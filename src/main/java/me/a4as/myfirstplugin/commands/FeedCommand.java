package me.a4as.myfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){

            p.setFoodLevel(20);
            p.sendMessage(ChatColor.WHITE + "You have been" + ChatColor.YELLOW + " Feeded!");


        }
              return true;
    }

}