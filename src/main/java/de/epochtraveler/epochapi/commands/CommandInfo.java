package de.epochtraveler.epochapi.commands;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface CommandInfo {

    /**
     * Required:
     * The command name /<command>
     * @return String
     */
    String command();

    /**
     * Optional:
     * Aliases for the commands
     * @return String[]
     */
    String[] aliases() default {};

    /**
     * Required:
     * Syntax for the command
     * @return String
     */
    String syntax();

    /**
     * Optional:
     * Description of the command
     * @return String
     */
    String description() default "";

    /**
     * Required:
     * Permissions for the command
     * @return String[]
     */
    String[] permissions();

}
