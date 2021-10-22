package net.skyblock.spigot.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.skyblock.spigot.drops.Skyblock;

public class SkyBlockGuide implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			Player p = ((Player) sender).getPlayer();
			String world = p.getLocation().getWorld().getName();
		    if (world.equals("skyblocklobby") || world.equals("Skyblock")) {
		    	Skyblock.GiveSkyBlockBook(p);
		    }else {
		    	p.sendMessage("§c[§e¿§c] Tu devrais surement allez dans le skyblock et visez le sud.");
		    }
		}
		
		return false;
	}

}
