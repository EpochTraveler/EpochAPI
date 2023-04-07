package de.epochtraveler.epochapi.modules;

import de.epochtraveler.epochapi.Core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleDescription {

    /**
     * Required:
     * Current module name
     * @return Module name
     */
    String name();

    /**
     * Required:
     * Current module version
     * @return Module version
     */
    String version();

    /**
     * Optional:
     * The author/s of the module
     * @return Module author
     */
    String[] authors() default "EpochTravelers Development Team";

    /**
     * Optional:
     * The description of the module
     * @return Module description
     */
    String description() default "No description was given on this module";

    /**
     * Optional:
     * Custom module prefix when sending messages or commands
     * @return Module prefix
     */
     String prefix() default Core.CORE_PREFIX;

    /**
     * Optional
     * Should the module be enabled on server startup
     * @return Module autostart boolean
     */
     boolean enableAutomatically() default true;
}
