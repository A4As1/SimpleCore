package me.a4as.myfirstplugin.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheapShearListener implements Listener {

    @EventHandler
    public void onSheepShear(PlayerShearEntityEvent event) {

        Player player = event.getPlayer();
        Entity entity = event.getEntity();
        if (entity.getType() == EntityType.SHEEP){
            player.sendMessage("This Sheep loves his wool, don't ya dear shearing em eh");
            event.setCancelled(true);
        }else{
            player.sendMessage("§fThis aint a §6Sheep. §fhahaha!");

        }

    }
}