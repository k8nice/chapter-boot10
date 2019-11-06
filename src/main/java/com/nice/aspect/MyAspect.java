/*ckage com.nice.aspect;

import com.nice.pojo.User;
import com.nice.validator.UserValidator;
import com.nice.validator.impl.UserValidatorImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

*//**
 * @author ningh
 *//*
@Aspect
public class MyAspect {

*//*
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
*//*

    @DeclareParents(value = "com.nice.service.impl.UserServiceImpl"
    ,defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;

    @Pointcut("execution(* com.nice.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {
    }

    @Before("pointCut() && args(user)")
    public void beforeParam(JoinPoint point, User user) {
        Object[] args = point.getArgs();
        System.out.println("前置通知中获取参数" + Arrays.toString(args));
        System.out.println("before ......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after ......");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning ......");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing ......");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around before ......");
        jp.proceed();
        System.out.println("around after ......");
    }

}*/
