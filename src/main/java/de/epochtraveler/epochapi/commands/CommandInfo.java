package de.epochtraveler.epochapi.commands;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to describe command-related information.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface CommandInfo {

    /**
     * Required: The primary name of the command ("/<command>").
     *
     * @return The primary name of the command.
     */
    String command();

    /**
     * Optional: Aliases for the command.
     *
     * @return An array of alias names for the command.
     */
    String[] aliases() default {};

    /**
     * Required: The syntax of the command.
     *
     * @return The syntax of the command.
     */
    String syntax();

    /**
     * Optional: A brief description of the command.
     *
     * @return A brief description of the command.
     */
    String description() default "";

    /**
     * Required: The permissions required to execute the command.
     *
     * @return An array of permission nodes required to execute the command.
     */
    String[] permissions();
}