package br.eti.clairton.jcachepolicy;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Target({ FIELD, PARAMETER, METHOD, CONSTRUCTOR, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HalfAMinuteExpiry {

}
