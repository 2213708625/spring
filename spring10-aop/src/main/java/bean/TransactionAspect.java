package bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: bean
 * @className: TransactionAspect
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/27 9:28
 * @version: 1.0
 */
@Component
@Aspect
public class TransactionAspect {
    @Around("execution(* bean.AccountService..*(..))")
    public void transactionadvice(ProceedingJoinPoint joinPoint){
        try {
            //开启事务
            System.out.println("开启事务");
            //目标方法
            joinPoint.proceed();
            //提交事务
            System.out.println("提交事务");
        } catch (Throwable e) {
            //回滚事务
            System.out.println("回滚事务");
            e.printStackTrace();
        }
    }
}
