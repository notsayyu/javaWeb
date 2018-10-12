package org.sydai.configuration.annotation;

import java.lang.annotation.*;

/**
 * 切面注解
 * @author dsy
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     */
    Class<? extends Annotation> value();
}
