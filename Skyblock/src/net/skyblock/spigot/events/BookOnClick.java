package net.skyblock.spigot.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import net.skyblock.spigot.gui.Guide;
import net.skyblock.spigot.gui.craftguide.WeaponsCraft;

public class BookOnClick implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
		
		// -{([ SkyBlock Guide Book ])}-
		
		if(e.getInventory().getName().equals("�6Guide")) {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("�aA quoi cela sert ?")) {
				e.setCancelled(true);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("�f?????")){
				e.setCancelled(true);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("�eWeapons")){
				e.setCancelled(true);
				Guide.WeaponsGui(p);
			}
		}
		if(e.getInventory().getName().equals("�6Weapons")) {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("�f�lOld Sword")) {
				e.setCancelled(true);
				p.closeInventory();
				WeaponsCraft.OldSwordCraft(p);
				
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("�f?????")){
				e.setCancelled(true);
			}
		}
		if(e.getInventory().getName().equals("�fOld Sword Craft")) {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("�f�lOld Sword")) {
				e.setCancelled(true);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("�f?????")){
				e.setCancelled(true);
			}
		}else {
			return;
		}
		
		
	}
	
}
