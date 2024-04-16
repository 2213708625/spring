package TestAop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: TestAop.aspect
 * @className: UserServiceaspect
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 14:36
 * @version: 1.0
 */
@Component
@Aspect
public class UserServiceaspect {
    @Pointcut("execution(* TestAop.service..*(..))")
    public void pointcut(){

    }
    @Before("pointcut()")
    public void loginBeforeaspect(JoinPoint joinPoint){
      /*  System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getSignature().getDeclaringType());
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());
        System.out.println(joinPoint.getSignature().getModifiers());*/
        System.out.println("使用aop的Before通知");
    }
    @AfterReturning("pointcut()")
    public void loginAfterReturningaspect(){
        System.out.println("使用aop的afterreturning通知");
    }
    @Around("pointcut()")
    public void loginAroundaspect(ProceedingJoinPoint joinPoint) throws Throwable {
         //环绕通知的前置通知
        System.out.println("环绕通知的前置通知");
        //目标方法
        joinPoint.proceed();
        //环绕通知的后置通知
        System.out.println("环绕通知的后置通知");
    }
    @AfterThrowing("pointcut()")
    public void loginThrowaspect(){
        System.out.println("使用aop的异常通知");
    }
    @After("pointcut()")
    public void loginafteraspect(){
        System.out.println("使用aop的最终通知");
    }
}
