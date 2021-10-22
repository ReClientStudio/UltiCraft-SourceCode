package net.hubplugin.hub.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.hubplugin.hub.Main;

public class AcCommand implements CommandExecutor {
	
	private Main main;
	
	
	public AcCommand(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("ac")) {
            if(!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "Only Players can use this Command");
                return true;
            }
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage(ChatColor.GREEN + "Merci d'utiliser la commande /ac help");
                return true;
            }
            else if(args.length == 1) {
                if (args[0].equalsIgnoreCase("help")) {
                    player.sendMessage(ChatColor.GREEN + "Mod, Report, Ban");  
                    return true;
                }
                if(args[0].equalsIgnoreCase("report")) {
                	
                }
            else if(args.length == 3) {
            	if(args[0].equalsIgnoreCase("ban")) {
            		
            		}
            		else {
            			player.sendMessage(ChatColor.RED + "{Target} N'est pas connectez..");
            		}
            	}
            
                else {
                    player.sendMessage(ChatColor.RED + "Im sorry, I cant find the requested");
                }
            }
        }
        return true;
    }

}
