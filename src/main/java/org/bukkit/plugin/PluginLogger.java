package org.bukkit.plugin;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * The PluginLogger class is a modified {@link Logger} that prepends all
 * logging calls with the name of the plugin doing the logging. The API for
 * PluginLogger is exactly the same as {@link Logger}.
 *
 * @see Logger
 */
public class PluginLogger extends Logger {
    private String pluginName;

    /**
     * Creates a new PluginLogger that extracts the name from a plugin.
     *
     * @param context A reference to the plugin
     */
    public PluginLogger(Plugin context) {
        super(context.getClass().getCanonicalName(), null);
        String prefix = context.getDescription().getPrefix();
        // Crucible start - give plugins a proper prefix for log4j
        //pluginName = prefix != null ? new StringBuilder().append("[").append(prefix).append("] ").toString() : "[" + context.getDescription().getName() + "] ";
        pluginName = prefix != null ? prefix : context.getDescription().getName();
        // Crucible end
        setParent(context.getServer().getLogger());
        setLevel(Level.ALL);
    }

    @Override
    public void log(LogRecord logRecord) {
        // Crucible start - fix log4j prefix
        //logRecord.setMessage(pluginName + logRecord.getMessage());
        logRecord.setLoggerName(pluginName);
        // Crucible end
        super.log(logRecord);
    }

}
