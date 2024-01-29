package de.epochtraveler.epochapi.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to describe local interface-related information.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface LocalInterface {

    /**
     * Specifies the name of the API.
     *
     * @return The name of the API.
     */
    String name();

    /**
     * Specifies the authors of the API.
     *
     * @return The authors of the API.
     */
    String[] authors() default { "EpochTravelers inc." };

    /**
     * Specifies the version of the API.
     *
     * @return The version of the API.
     */
    String version();
}
