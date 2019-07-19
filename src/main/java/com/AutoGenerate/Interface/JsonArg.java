package com.AutoGenerate.Interface;


import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented//action生成注释
public @interface JsonArg {
    String value() default "";
    Class bean() default Object.class;
}
