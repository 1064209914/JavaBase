package com.hxd.Javabase.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface CostomAnnotion {

	int age() default 18;
	String name() default "jj";
	double score()default 121.0; 
	
}
