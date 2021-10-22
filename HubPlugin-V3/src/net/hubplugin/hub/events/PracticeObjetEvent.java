package net.hubplugin.hub.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PracticeObjetEvent implements Listener {
	
	ItemStack Soup = new ItemStack(Material.BOWL);
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(p.getInventory().getItemInHand() == null) {
			return;
		}
		
		if(p.getInventory().getItemInHand().getItemMeta() == null) {
			return;
		}
		
		if(p.getInventory().getItemInHand().getType() == (Material.MUSHROOM_SOUP)) {
				if(p.getHealth() == 20) {return;}
				
				if(p.getHealth() == 18) {
					p.setHealth(p.getHealth() + 2);
					p.setItemInHand(Soup);
				}
				
				if(p.getHealth() == 19) {
					p.setHealth(p.getHealth() + 1);
					p.setItemInHand(Soup);
				}
				
				if(p.getHealth() <= 17) {
					p.setHealth(p.getHealth() + 3);
					p.setItemInHand(Soup);
				}
				if(p.getHealth() >= 17) {
					p.setHealth(p.getHealth() + 3);
					p.setItemInHand(Soup);
				}
		}
	}

}
