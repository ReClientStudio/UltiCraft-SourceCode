package net.ulticraft.practice.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import net.ulticraft.practice.utils.ChatUtils;
import net.ulticraft.practice.utils.UnrankedGUI;

public class UnrankedInteract implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(p.getInventory().getItemInHand() == null) {
			return;
		}
		
		if(p.getInventory().getItemInHand().getItemMeta() == null) {
			return;
		}
		
		if(p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals(ChatUtils.format("§6Unranked"))) {
			UnrankedGUI.openGUI(p);
				
		}
		else {
			return;
		}
	}

}
