package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class LogAspect {

	@Pointcut("@annotation(com.example.aop.Action)")
	public void annotationPointCut() {
		System.out.println("LogAspect->annotationPointCut()");
	}

	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("拦截注解 " + action.name());
	}

	@Before("execution(* com.example.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("拦截方法 " + method.getDeclaringClass().getName() + "->" + method.getName() + "()");
	}

	@Around("execution(* com.example.aop.DemoMethodService.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		MethodSignature signature = (MethodSignature) pjp.getSignature();
		Method method = signature.getMethod();
		System.out.println("拦截方法前 " + method.getDeclaringClass().getName() + "->" + method.getName() + "()");
		pjp.proceed();
		System.out.println("拦截方法后 " + method.getDeclaringClass().getName() + "->" + method.getName() + "()");
	}
}
