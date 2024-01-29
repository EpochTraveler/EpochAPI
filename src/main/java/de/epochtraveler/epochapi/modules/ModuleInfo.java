package de.epochtraveler.epochapi.modules;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to describe module information.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModuleInfo {

    /**
     * Gets the current module name.
     *
     * @return Module name
     */
    String name();

    /**
     * Gets the current module version.
     *
     * @return Module version
     */
    String version();

    /**
     * Gets the author/s of the module.
     * Default value is "EpochTravelers Development Team".
     *
     * @return Module author
     */
    String[] authors() default "EpochTravelers Development Team";

    /**
     * Gets the description of the module.
     * Default value is "No description was given on this module".
     *
     * @return Module description
     */
    String description() default "No description was given on this module";

}
