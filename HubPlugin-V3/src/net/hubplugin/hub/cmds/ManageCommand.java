package net.hubplugin.hub.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.hubplugin.hub.Main;
import net.hubplugin.hub.rank.RankUnit;

public class ManageCommand implements CommandExecutor {
	
	private Main main;

	public ManageCommand(Main main) {
		this.main = main;
	}

	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player))return false;
        Player p = (Player) sender;
        if(command.getName().equalsIgnoreCase("gamemode")){
            if(!(main.rank.getRank(p).getPower() <= RankUnit.MOD.getPower()))
            {
            	p.sendMessage(ChatColor.RED+"Unkown command.");
            }
        }
        
        return false;
    }

}
