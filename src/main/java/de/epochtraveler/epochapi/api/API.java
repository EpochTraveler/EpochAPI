package de.epochtraveler.epochapi.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface API {

    /**
     * API-Name
     * @return API-Name
     */
    String name();

    /**
     * API-Authors
     * @return API-Authors
     */
    String[] authors() default { "EpochTravelers - Development" };

    /**
     * API-Version
     * @return API-Version
     */
    String version();

}
