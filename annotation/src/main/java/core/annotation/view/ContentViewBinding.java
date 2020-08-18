package core.annotation.view;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author DrkCore
 * @since 2017-7-10
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ContentViewBinding {
    int value();
}

