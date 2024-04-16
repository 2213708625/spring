package bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: bean
 * @className: loginaspect
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/25 20:35
 * @version: 1.0
 */
@Component("loginaspect")
@Aspect
public class loginaspect {
    @Pointcut("execution(* bean..*(..))")
    public void generic(){
    }
    @AfterReturning("generic()")
    public void afterreturningAdvice(JoinPoint joinPoint){
        System.out.println("之后增强");
    }
    @Before("generic()")
    public void beforeAdvice(){
        System.out.println("之前增强");
    }
    @Around("generic()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("最上面增强");
        proceedingJoinPoint.proceed();
        System.out.println("最下面增强");
    }
    @AfterThrowing("generic()")
    public void exceptionAdvice(){
        System.out.println("出现异常增强");
    }
    @After("generic()")
    public void finallyAdvice(){
        System.out.println("最终增强");
    }
}
