package com.example.mvc.validator

import com.example.mvc.annotation.StringFormatDateTime
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class StringFormatDateTimeValidator : ConstraintValidator<StringFormatDateTime, String> {

    private var pattern : String?=null

    override fun initialize(constraintAnnotation: StringFormatDateTime?) {
        this.pattern = constraintAnnotation?.pattern
    }

    // 정상이면 true
    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        //정상 true, 비정상 false
        return try {
            LocalDateTime.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            true
        } catch (e: Exception) {
            false
        }
    }
}