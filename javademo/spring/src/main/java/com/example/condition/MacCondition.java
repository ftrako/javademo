package com.example.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MacCondition implements Condition {
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
		return conditionContext.getEnvironment().getProperty("os.name").toLowerCase().contains("mac");
	}
}
