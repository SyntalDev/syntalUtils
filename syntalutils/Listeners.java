package com.syntalutils.syntalutils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.ChatColor;

public class Listeners implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Material type = event.getBlock().getType();
        if (type == Material.OAK_LOG) {
            Player player = event.getPlayer();
            player.sendMessage(ChatColor.RED + "Placed oak log");
        }
    }
    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Material type = event.getBlock().getType();
        if (type == Material.OAK_LOG){
            Player player = event.getPlayer();
            player.sendMessage(ChatColor.RED + "Removed oak log");
        }
    }
}
