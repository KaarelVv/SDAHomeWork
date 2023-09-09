package com.userspringboot.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;


public class EmailValidator implements ConstraintValidator<ValidEmail,String > {
    private static final String EMAIL_REGEX = "your_email_regex_pattern_here";

    @Override
    public void initialize(ValidEmail constraintAnnotation) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email != null && Pattern.matches(EMAIL_REGEX, email);
    }
}
