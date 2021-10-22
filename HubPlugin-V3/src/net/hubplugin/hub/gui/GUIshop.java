package net.hubplugin.hub.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIshop {
	
	public static void openGUI(Player p) {
		
		Inventory shop = Bukkit.createInventory(null, 54, "§6Shop");
		
		ItemStack Gapple = new ItemStack(Material.EYE_OF_ENDER);
		ItemMeta GappleM = Gapple.getItemMeta();
		GappleM.setDisplayName("§6§l Grade §6[MVP§c++§6]");
		Gapple.setItemMeta(GappleM);
		
		ItemStack Diamond = new ItemStack(Material.IRON_AXE);
		ItemMeta DiamondM = Diamond.getItemMeta();
		DiamondM.setDisplayName("§6§l Grade §b[MVP§c+§b]");
		Diamond.setItemMeta(DiamondM);
		
		ItemStack Shop = new ItemStack(Material.ENDER_PORTAL_FRAME);
		ItemMeta ShopM = Shop.getItemMeta();
		ShopM.setDisplayName("§6§l Grade §b[MVP]");
		Shop.setItemMeta(ShopM);
		
		ItemStack Retour = new ItemStack(Material.GOLDEN_APPLE);
		ItemMeta RetourM = Retour.getItemMeta();
		RetourM.setDisplayName("§6§l Grade §a[VIP§c+§a]");
		Retour.setItemMeta(RetourM);
		
		ItemStack Conf = new ItemStack(Material.RECORD_6);
		ItemMeta ConfM = Conf.getItemMeta();
		ConfM.setDisplayName("§6§l Grade §a[VIP]");
		Conf.setItemMeta(ConfM);
		ItemStack Vitre = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)9);
		
		
		shop.setItem(0, Vitre);
		shop.setItem(1, Vitre);
		shop.setItem(2, Vitre);
		shop.setItem(3, Vitre);
		shop.setItem(4, Vitre);
		shop.setItem(5, Vitre);
		shop.setItem(6, Vitre);
		shop.setItem(7, Vitre);
		shop.setItem(8, Vitre);
		shop.setItem(49, Vitre);
		shop.setItem(51, Vitre);
		shop.setItem(52, Vitre);
		shop.setItem(47, Vitre);
		shop.setItem(46, Vitre);
		shop.setItem(45, Vitre);
		shop.setItem(52, Vitre);
		
		shop.setItem(22, Shop);
		shop.setItem(21, Retour);
		shop.setItem(30, Conf);
		shop.setItem(23, Diamond);
		shop.setItem(32, Gapple);
		
		p.openInventory(shop);
	}	
}
/*
 *	
 		shop.setItem(21, Shop);
		shop.setItem(22, Retour);
		shop.setItem(23, Conf);
		shop.setItem(32, Diamond);
		shop.setItem(30, Gapple); 
 * 
 */
 