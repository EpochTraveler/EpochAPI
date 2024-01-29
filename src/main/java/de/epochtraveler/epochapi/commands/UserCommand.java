package de.epochtraveler.epochapi.commands;

import de.epochtraveler.epochapi.user.User;

import java.util.List;
import java.util.Objects;

/**
 * Implementation of the interface {@link Command}
 */
public abstract class UserCommand implements Command {

    private final CommandInfo commandInfo;

    /**
     * Creates a new PlayerCommand instance
     */
    public UserCommand()
    {
        this.commandInfo = Objects.requireNonNull(getClass().getAnnotation(CommandInfo.class),
                "CommandInfo Annotation is missing!");
    }

    @Override
    public List<String> onTabComplete(User user, String[] args)
    {
        return null;
    }

    public CommandInfo getCommandInfo()
    {
        return commandInfo;
    }
}
