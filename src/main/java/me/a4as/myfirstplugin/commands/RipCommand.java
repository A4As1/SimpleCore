package me.a4as.myfirstplugin.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;

public class RipCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //** /rip - rips the player **//
        if (command.getName().equalsIgnoreCase("rip")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                p.setHealth(0.0);
                p.sendMessage("&bHey Fool you ripped your self! &4&lRIP");
                p.setGameMode(GameMode.SPECTATOR);
                p.sendMessage("&bYou are now a Spectator!");

            } else if (sender instanceof ConsoleCommandSender) ;

            getServer().getConsoleSender().sendMessage("You must be a Player to run this Command.");

        }

        return true;
    }

}