package com.test.source.struct.expr;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    String value() default "";
    int count() default 1;
}