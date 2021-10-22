package net.hubplugin.hub.cmds;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.hubplugin.hub.events.JeuxGUIInteract;
import net.hubplugin.hub.kit.joinItems;

public class HubCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		Inventory inv = p.getInventory();
		String world = p.getLocation().getWorld().getName();
	    if (!world.equals("world")) {
			Location spawn = new Location(Bukkit.getWorld("world"), 0.500, 142, 0.500, 90f, 0f);
			p.teleport(spawn);
			joinItems.giveItems(p);
			p.removePotionEffect(null);
			if(JeuxGUIInteract.PracticeList.contains(p)) {
				JeuxGUIInteract.removePracticeList(p);
			}
	    }
	    else {
	    	p.sendMessage("§fUnknown command. /help for help. ");
	    }
		return false;
	}

}
