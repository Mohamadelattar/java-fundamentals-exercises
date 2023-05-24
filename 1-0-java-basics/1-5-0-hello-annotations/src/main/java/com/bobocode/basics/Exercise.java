package com.bobocode.basics;

import static com.bobocode.basics.Level.BASIC;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.AnnotatedFor;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Exercise {
    public String value() default " ";

    public Level complexityLevel() default BASIC;
}
