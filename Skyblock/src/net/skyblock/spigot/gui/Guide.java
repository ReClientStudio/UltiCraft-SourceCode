package net.skyblock.spigot.gui;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Guide {
	
	public static void openGUI(Player p) {
		
		Inventory inv = Bukkit.createInventory(null, 9*5, "§6Guide");
		
		ItemStack Weapons = new ItemStack(Material.GOLD_SWORD);
		ItemMeta WeaponsM = Weapons.getItemMeta();
		WeaponsM.setDisplayName("§eWeapons");
		Weapons.setItemMeta(WeaponsM);
		
		ItemStack Help = new ItemStack(Material.GHAST_TEAR);
		ItemMeta HelpM = Help.getItemMeta();
		HelpM.setDisplayName("§aA quoi cela sert ?");
		HelpM.setLore(Arrays.asList("Ce livre vous aidera au debut de l'aventure."));
		Help.setItemMeta(HelpM);
		
		ItemStack Vitre = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)9);
		ItemMeta VitreM = Vitre.getItemMeta();
		VitreM.setDisplayName("§f?????");
		Vitre.setItemMeta(VitreM);
		
		inv.setItem(0, Vitre);
		inv.setItem(1, Vitre);
		inv.setItem(2, Vitre);
		inv.setItem(3, Vitre);
		inv.setItem(4, Vitre);
		inv.setItem(5, Vitre);
		inv.setItem(6, Vitre);
		inv.setItem(7, Vitre);
		inv.setItem(8, Vitre);
		inv.setItem(36, Vitre);
		inv.setItem(37, Vitre);
		inv.setItem(38, Vitre);
		inv.setItem(39, Vitre);
		inv.setItem(40, Help);
		inv.setItem(41, Vitre);
		inv.setItem(42, Vitre);
		inv.setItem(43, Vitre);
		inv.setItem(44, Vitre);
		
		inv.setItem(9, Weapons);
		p.openInventory(inv);
	}


	public static void WeaponsGui(Player p) {
		
		Inventory inv = Bukkit.createInventory(null, 9*5, "§6Weapons");
		
		ItemStack Weapons = new ItemStack(Material.WOOD_HOE);
		ItemMeta WeaponsM = Weapons.getItemMeta();
		WeaponsM.setDisplayName("§f§lOld Sword");
		WeaponsM.setLore(Arrays.asList("§cDAMAGE: 10"," ","§f§lCOMMON"));
		WeaponsM.addEnchant(Enchantment.DAMAGE_ALL, 16, true);
		WeaponsM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		Weapons.setItemMeta(WeaponsM);
		
		ItemStack Vitre = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)9);
		ItemMeta VitreM = Vitre.getItemMeta();
		VitreM.setDisplayName("§f?????");
		Vitre.setItemMeta(VitreM);
		
		
		inv.setItem(0, Vitre);
		inv.setItem(1, Vitre);
		inv.setItem(2, Vitre);
		inv.setItem(3, Vitre);
		inv.setItem(4, Vitre);
		inv.setItem(5, Vitre);
		inv.setItem(6, Vitre);
		inv.setItem(7, Vitre);
		inv.setItem(8, Vitre);
		inv.setItem(36, Vitre);
		inv.setItem(37, Vitre);
		inv.setItem(38, Vitre);
		inv.setItem(39, Vitre);
		inv.setItem(40, Vitre);
		inv.setItem(41, Vitre);
		inv.setItem(42, Vitre);
		inv.setItem(43, Vitre);
		inv.setItem(44, Vitre);
		
		inv.setItem(9, Weapons);
		p.openInventory(inv);
	}
	
}

/**
 * Weapons
 * 
 * 
 * 
 */

