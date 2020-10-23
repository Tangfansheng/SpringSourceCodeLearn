package com.ordo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogsAspect {
    @Pointcut("execution(* com.ordo.aop.MathDiv.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature()+"方法执行前..参数列表："+"{"+ Arrays.asList(args) +"}");
    }

    @After("com.ordo.aop.LogsAspect.pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature()+"方法执行后..");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception){
        System.out.println(joinPoint.getSignature()+"出现异常："+"{"+ exception+ "}");
    }
    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println(joinPoint.getSignature()+"正常返回："+"{"+ result +"}");
    }


    public void log(){
        System.out.println("方法执行后..运行结果："+"{}");
    }
}
