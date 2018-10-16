package com.example.demo.dto;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by kalhara@boswin on 10/16/2018 9:46 AM.
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = HomePageEmptyMessageValidator.class)
public @interface HomePageEmptyMessage {
    String message() default "";

    String[] msg() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
