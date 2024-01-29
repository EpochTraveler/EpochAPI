package de.epochtraveler.epochapi.logging;

import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;

public enum LogLevel {

    INFO(NamedTextColor.GRAY),
    WARN(NamedTextColor.YELLOW),
    ERROR(NamedTextColor.RED),
    TRACE(NamedTextColor.LIGHT_PURPLE),
    DEBUG(NamedTextColor.BLUE);

    private TextColor color;

    LogLevel(TextColor color)
    {
        this.color = color;
    }

    /**
     * Returns the current color of the log-level
     * @return ChatColor
     */
    public TextColor getColor() {
        return color;
    }
}
