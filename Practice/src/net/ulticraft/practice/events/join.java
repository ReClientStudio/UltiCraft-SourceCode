package net.ulticraft.practice.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;

import net.ulticraft.practice.utils.QueueManager;
import net.ulticraft.practice.utils.joinItems;
public class join implements Listener {
	
	@EventHandler
	public void onChangeWorld(PlayerChangedWorldEvent e) {
		Player p = e.getPlayer();
		Inventory inv = p.getInventory();
		String world = p.getLocation().getWorld().getName();
		if(world.equals("practicelobby")) {
	    	joinItems.giveItems(p);
		}
		
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if(QueueManager.unrankedNoDebuff.contains(p)) {
			QueueManager.removeUnrankedNoDebuff(p);
		}
		if(QueueManager.unrankedDiamond.contains(p)) {
			QueueManager.removeUnrankedDiamond(p);
		}
		if(QueueManager.unrankedGapple.contains(p)) {
			QueueManager.removeUnrankedGapple(p);
		}
		if(QueueManager.unrankedClassic.contains(p)) {
			QueueManager.removeUnrankedClassic(p);
		}
	}

}
