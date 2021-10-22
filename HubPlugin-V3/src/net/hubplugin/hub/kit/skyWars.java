package net.hubplugin.hub.kit;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class skyWars {

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
		
		ItemStack Jeux = new ItemStack(Material.NETHER_STAR);
		ItemMeta JeuxM = Jeux.getItemMeta();
		JeuxM.setDisplayName(ChatColor.GOLD+"Jeux");
		Jeux.setItemMeta(JeuxM);
		
		ItemStack Shop = new ItemStack(Material.EMERALD);
		ItemMeta ShopM = Shop.getItemMeta();
		ShopM.setDisplayName(ChatColor.GOLD+"Boutique SkyWars");
		Shop.setItemMeta(ShopM);
		
		p.addPotionEffect((new PotionEffect(PotionEffectType.SPEED, 200000, 0)));
		
		inv.setItem(8, Shop);
		inv.setItem(4, Jeux);
		
	}	
	
}
