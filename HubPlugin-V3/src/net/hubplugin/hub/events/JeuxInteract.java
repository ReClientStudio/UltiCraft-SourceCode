package net.hubplugin.hub.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import net.hubplugin.hub.gui.GUIjeux;


public class JeuxInteract implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(p.getInventory().getItemInHand() == null) {
			return;
		}
		
		if(p.getInventory().getItemInHand().getItemMeta() == null) {
			return;
		}
		
		if(p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§6Jeux")) {
			GUIjeux.openGUI(p);
				
		}
		else {
			return;
		}
	}

}
