package com.example.aop.Aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectService {


    //region pointCut with annotation

    @Pointcut("@annotation(Log)")
    public void loggingPointCutAnnotation(){}

    @Before(value = "loggingPointCutAnnotation()")
    public void loggingAllMethodAdvice(){
        System.out.println("In Aspect from annotation ");
    }

//endregion


    //region pointCut with execution
@Pointcut("execution(public void com.example.aop.Aspect.MedicalService.medicalMethod())")
    public void logPointcutWithExecution(){}

    @After("logPointcutWithExecution()")
public void logMethodCallsWithExecutionAdvice(){
    System.out.println("In Aspect from execution");
}
//endregion


    //region  pointcut with within

    @Pointcut("within(com.example.aop.Aspect.MedicalService)")
    public void logPointcutWithin() {}

    @Before("logPointcutWithin()")
    public void logMethodCallsWithinAdvice() {
        System.out.println("In Aspect from within");
    }
    //endregion

//region pointcut  with args
    @Pointcut("execution(public void com.example.aop.Aspect.MedicalService.calculateMedicalMethod(Long))")
    public void logPointcutWithArgs() {}

    @Before("logPointcutWithArgs()")
    public void logMethodCallsWithArgsAdvice() {
        System.out.println("In Aspect from Args");
    }
    //endregion

    @Pointcut("within(com.example.aop.Aspect.OrderMedicalService) && execution(public String com.example.aop.Aspect.OrderMedicalService.*(..))")
    public void logPointcutWithLogicalOperator(){}

    @Before("logPointcutWithLogicalOperator()")
    public void logPointcutWithLogicalOperatorAdvice(){
        System.out.println("In Aspect from logical operator");
    }



}
