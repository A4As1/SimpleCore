package me.a4as.myfirstplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.AQUA + "" + player.getDisplayName() + ChatColor.WHITE + " has joined the server.");
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.AQUA + "" + player.getDisplayName() + ChatColor.WHITE + " has left the server.");
    }
}