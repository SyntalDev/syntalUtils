package com.syntalutils.syntalutils.commands;


import com.syntalutils.syntalutils.SyntalMsg;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {
    SyntalMsg syntalMSG = new SyntalMsg();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + syntalMSG.msg() + "Command can only be ran by a player!");
        }
        Player player = (Player) sender;
        player.setFoodLevel(20);
        player.sendMessage(ChatColor.GREEN + syntalMSG.msg() + "Your food was replenished!");
        return true;
    };
};