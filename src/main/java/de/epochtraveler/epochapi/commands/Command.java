package de.epochtraveler.epochapi.commands;

import de.epochtraveler.epochapi.user.User;

import java.util.List;


/**
 * A functional interface representing a command to be executed.
 */
public interface Command {

    /**
     * Executes the command.
     *
     * @param user The user object executing the command.
     * @param args The arguments provided with the command.
     * @return The status of the command execution.
     */
    CommandStatus onCommand(User user, String args[]);

    /**
     * Provides a list of suggestions for tab completion.
     *
     * @param user The user object executing the command.
     * @param args The arguments provided with the command.
     * @return A list of suggestions for tab completion.
     */
    List<String> onTabComplete(User user, String args[]);

    /**
     * Enumerates the possible statuses of a command execution.
     */
    enum CommandStatus {

        /**
         * The command was executed successfully.
         */
        SUCCESS,

        /**
         * The command execution was considered an abuse attempt.
         */
        ABUSE,

        /**
         * The command syntax was incorrect.
         */
        WRONG_SYNTAX,

        /**
         * The user does not have permission to execute the command.
         */
        NO_PERMISSION,

        /**
         * No specific feedback is provided for the command execution.
         */
        NONE
    }
}