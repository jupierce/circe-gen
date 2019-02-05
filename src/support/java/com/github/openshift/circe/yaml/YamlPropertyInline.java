package com.github.openshift.circe.yaml;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({METHOD})
/**
 * Use this annotation on a getter method to serialize the result
 * inline without a 'key: ...'.
 */
public @interface YamlPropertyInline { }
