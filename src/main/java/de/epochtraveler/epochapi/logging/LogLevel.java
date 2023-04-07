package de.epochtraveler.epochapi.logging;

import org.bukkit.ChatColor;
public enum LogLevel {

    INFO(ChatColor.GRAY),
    WARN(ChatColor.YELLOW),
    ERROR(ChatColor.RED),
    TRACE(ChatColor.LIGHT_PURPLE),
    DEBUG(ChatColor.BLUE);

    private ChatColor color;

    LogLevel(ChatColor color)
    {
        this.color = color;
    }

    /**
     * Returns the current color of the log-level
     * @return ChatColor
     */
    public ChatColor getColor() {
        return color;
    }
}
