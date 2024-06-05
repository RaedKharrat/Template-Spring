package tn.esprit.Config;

// Importing necessary libraries
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// Declaring the class as a Spring component and an aspect
@Component
@Aspect
@Slf4j
public class AOP {

    // Uncomment and modify the following advice to enable method profiling
    // @Around("execution(* tn.esprit.spring.Service.*.*(..))")
    // public Object profile(ProceedingJoinPoint pjp) throws Throwable {
    //     long start = System.currentTimeMillis();
    //     Object obj = pjp.proceed();
    //     long elapsedTime = System.currentTimeMillis() - start;
    //     log.info("Method execution time: " + elapsedTime + " milliseconds.");
    //     return obj;
    // }
}
