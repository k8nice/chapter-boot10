package com.nice;

//import com.nice.aspect.MyAspect;
import com.nice.aspect.MyAspect1;
import com.nice.aspect.MyAspect2;
import com.nice.aspect.MyAspect3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.nice"})
public class ChapterBoot10Application {

    /**
     * 定义切面
     * @return
     */
//    @Bean(name = "myAspect")
//    public MyAspect initMyAspect() {
//        return new MyAspect();
//    }

    @Bean(name = "myAspect1")
    public MyAspect1 initMyAspect1() {
        return new MyAspect1();
    }

        @Bean(name = "myAspect2")
    public MyAspect2 initMyAspect2() {
        return new MyAspect2();
    }

    @Bean(name = "myAspect3")
    public MyAspect3 initMyAspect3() {
        return new MyAspect3();
    }

    /**
     * 启动切面
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ChapterBoot10Application.class, args);
    }

}
