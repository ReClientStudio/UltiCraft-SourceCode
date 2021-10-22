package net.hubplugin.hub.kit;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class joinItems {
	
	public static void giveItems(Player p) {
		p.getInventory().setHelmet(null);
		p.getInventory().setChestplate(null);
		p.getInventory().setLeggings(null);
		p.getInventory().setBoots(null);
		Inventory inv = p.getInventory();
		p.setGameMode(GameMode.ADVENTURE);
		p.setHealth(20);
		p.setFoodLevel(20);
		p.setAllowFlight(false);
		p.setFlying(false);
		p.getInventory().clear();
		
		p.setAllowFlight(true);
		p.setFlying(true);
		
		ItemStack Jeux = new ItemStack(Material.NETHER_STAR);
		ItemMeta JeuxM = Jeux.getItemMeta();
		JeuxM.setDisplayName(ChatColor.GOLD+"Jeux");
		Jeux.setItemMeta(JeuxM);
		
		inv.setItem(4, Jeux);
		
	}	

}
