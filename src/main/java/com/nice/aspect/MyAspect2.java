package com.nice.aspect;

import com.nice.pojo.User;
import com.nice.validator.UserValidator;
import com.nice.validator.impl.UserValidatorImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

/**
 * @author ningh
 */
@Aspect
//@Order(2)
public class MyAspect2 implements Ordered {

/*
    @Before("execution(* com.nice.service.impl.UserServiceImpl.printUser(..))")
    public void before(){
        System.out.println("before......");
    }

    @After("execution(* com.nice.service.impl.UserServiceImpl.printUser(..))")
    public void after() {
        System.out.println("after ......");
    }

    @AfterReturning("execution(* com.nice.service.impl.UserServiceImpl.printUser(..))")
    public void afterReturning() {
        System.out.println("afterReturning ......");
    }

    @AfterThrowing("execution(* com.nice.service.impl.UserServiceImpl.printUser(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
*/

    @DeclareParents(value = "com.nice.service.impl.UserServiceImpl"
    ,defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;

    @Pointcut("execution(* com.nice.service.impl.UserServiceImpl.manyAspects(..))")
    public void manyAspects() {
    }

    @Before("manyAspects() && args(user)")
    public void beforeParam(JoinPoint point, User user) {
        Object[] args = point.getArgs();
        System.out.println("前置通知中获取参数" + Arrays.toString(args));
        System.out.println("MyAspect2 before ......");
    }

    @After("manyAspects()")
    public void after() {
        System.out.println("MyAspect2 after ......");
    }

    @AfterReturning("manyAspects()")
    public void afterReturning() {
        System.out.println("MyAspect2 afterReturning ......");
    }

    @AfterThrowing("manyAspects()")
    public void afterThrowing() {
        System.out.println("MyAspect2 afterThrowing ......");
    }

    @Around("manyAspects()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("MyAspect2 around before ......");
        jp.proceed();
        System.out.println("MyAspect2 around after ......");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
