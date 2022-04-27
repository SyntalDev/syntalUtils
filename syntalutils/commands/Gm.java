package com.syntalutils.syntalutils.commands;

import com.syntalutils.syntalutils.SyntalMsg;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

public class Gm implements CommandExecutor {
    SyntalMsg syntalMSG = new SyntalMsg();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0){
            Player player = (Player) sender;
            if (player.getGameMode() == GameMode.SURVIVAL){
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GREEN + syntalMSG.msg() + "Your gamemode is now set to creative!");
            } else {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GREEN + syntalMSG.msg() + "Your gamemode is now set to survival");
            }
            return true;
        } else {
            Player player = Bukkit.getPlayer(args[0]);
            if (player.getGameMode() == GameMode.SURVIVAL){
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GREEN + syntalMSG.msg() + "Your gamemode is now set to creative!");
            } else {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GREEN + syntalMSG.msg() + "Your gamemode is now set to survival");
            }
        }
        return true;
    }
}
