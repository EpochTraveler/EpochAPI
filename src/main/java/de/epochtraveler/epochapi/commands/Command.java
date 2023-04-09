package de.epochtraveler.epochapi.commands;

import de.epochtraveler.epochapi.user.User;

import java.util.List;

public interface Command
{

    /**
     * Command Executor
     * @param user User Object
     * @param args String[]
     * @return CommandStatus
     */
    CommandStatus onCommand(User user, String args[]);

    /**
     * The list which is used for tab completion
     * @param user User Object
     * @param args String[]
     * @return List<String>
     */
    List<String> onTabComplete(User user, String args[]);

    /**
     * Contains the different Command Feedbacks when executing the command
     */
    enum CommandStatus
    {
        /**
         * Command is successful
         */
        SUCCESS,

        /**
         * Someone tried to execute a command
         */
        ABUSE,

        /**
         * Wrong command syntax
         */
        WRONG_SYNTAX,

        /**
         * No permission to execute that command
         */
        NO_PERMISSION,

        /**
         * No Response
         */
        NONE;
    }

}
