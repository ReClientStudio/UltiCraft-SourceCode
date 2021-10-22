package net.hubplugin.hub.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickCommand implements CommandExecutor {
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("/// ")) {
        /*	if(main.rank.getRank(player).getPower() >= RankUnit.MVP2.getPower()) {
	            if(!(sender instanceof Player)) {
	                sender.sendMessage(ChatColor.RED + "Only Players can use this Command");
	                return true;
	            }
	        
	            if (args.length == 0) {
	                player.sendMessage(ChatColor.GREEN + "/nick {nickname}");
	                return true;
	            }
	            if(args.length == 1) {
					
					StringBuilder bc = new StringBuilder();
					for(String part : args) {
						bc.append(part + "");
					}
					
					
				}
				
				return true;
        	}
        	else {player.sendMessage("�c Vous n'avez pas la permission de faire cette action.");}*/
        }
		return false;
	}
	
	

}
