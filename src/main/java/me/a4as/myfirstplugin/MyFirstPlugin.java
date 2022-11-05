package me.a4as.myfirstplugin;

import me.a4as.myfirstplugin.commands.FeedCommand;
import me.a4as.myfirstplugin.commands.GodCommand;
import me.a4as.myfirstplugin.commands.RipCommand;
import me.a4as.myfirstplugin.listeners.JoinLeaveListener;
import me.a4as.myfirstplugin.listeners.SheapShearListener;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("[First-Plugin] &eFirst Plugin Has &aSuccessfully &eEnabled!");

        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("rip").setExecutor(new RipCommand());
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new SheapShearListener(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        System.out.println("A Noob Player has Joined MistyMC");
        //event.setJoinMessage("Hey Bozo welcome to da server UWU §cbtw I am A4As the dev :)");

    }

    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) {

        Player player = event.getPlayer();
        player.sendMessage("§bYou slept on this §cBed, §bNow enjoy §4§lCreative mode!");
        player.setGameMode(GameMode.CREATIVE);


    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("§c[First-Plugin] §fFirst Plugin Has §aSuccessfully§f Disabled");
    }
}
