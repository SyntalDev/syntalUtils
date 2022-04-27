package com.syntalutils.syntalutils;

import com.syntalutils.syntalutils.commands.Feed;
import com.syntalutils.syntalutils.commands.Gm;
import com.syntalutils.syntalutils.commands.Heal;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class SyntalUtils extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        //gets the plugin.yml loaded as a configuration file, then iterates through all of the registered commands.
        Bukkit.getPluginManager().registerEvents(new Listeners(), this);
        getCommand("heal").setExecutor(new Heal());
        getCommand("feed").setExecutor(new Feed());
        getCommand("gm").setExecutor(new Gm());
    }
}
