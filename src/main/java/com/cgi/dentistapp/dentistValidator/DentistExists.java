//this tutorial helped me made this https://www.youtube.com/watch?v=rFf0CaxaHVc
package com.cgi.dentistapp.dentistValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

@Constraint(
        validatedBy = {DentistExistsValidator.class}
)
public @interface DentistExists {
    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
