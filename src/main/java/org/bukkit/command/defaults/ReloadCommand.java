package org.bukkit.command.defaults;

import java.util.Arrays;

import net.minecraft.server.MinecraftServer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class ReloadCommand extends BukkitCommand {
    public ReloadCommand(String name) {
        super(name);
        this.description = "Reloads the server configuration and plugins";
        this.usageMessage = "/reload";
        this.setPermission("bukkit.command.reload");
        this.setAliases(Arrays.asList("rl"));
    }

    @Override
    public boolean execute(CommandSender sender, String currentAlias, String[] args) {
        // Cauldron start - disable reload as it causes many issues with mods
      if(MinecraftServer.getServer().cauldronConfig.reloadPlugins.getValue()) // Thermos - let's let people reload their plugins...
      {
        if (!testPermission(sender)) return true;

        Bukkit.reload();
        Command.broadcastCommandMessage(sender, ChatColor.GREEN + "Reload complete.");
      }
      else
        sender.sendMessage(ChatColor.RED + "Reload not allowed on a Cauldron server.");
        // Cauldron end

        return true;
    }

    // Spigot Start
    @Override
    public java.util.List<String> tabComplete(CommandSender sender, String alias, String[] args) throws IllegalArgumentException
    {
        return java.util.Collections.emptyList();
    }
    // Spigot End
}
