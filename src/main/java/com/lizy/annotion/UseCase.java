package com.lizy.annotion;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface UseCase {

    int id();

    String description() default "no description";

}
