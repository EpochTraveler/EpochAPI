package de.epochtraveler.epochapi.api;

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
