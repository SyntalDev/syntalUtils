package com.syntalutils.syntalutils.commands;

import com.syntalutils.syntalutils.SyntalMsg;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.units.qual.C;

public class Heal implements CommandExecutor{
    SyntalMsg syntalMSG = new SyntalMsg();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + syntalMSG.msg() + "Only players can access this command!");
        };
        Player player = (Player) sender;
        player.setHealth(20.0d);
        player.sendMessage(ChatColor.GREEN + syntalMSG.msg() + "Your health was replenished!");
        return true;
    };
};
