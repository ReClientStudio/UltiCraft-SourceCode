package net.skyblock.spigot.gui.craftguide;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WeaponsCraft {
	
		public static void OldSwordCraft(Player p) {
		
		Inventory inv = Bukkit.createInventory(null, 9*5, "§fOld Sword Craft");
		
		ItemStack Weapons = new ItemStack(Material.WOOD_HOE);
		ItemMeta WeaponsM = Weapons.getItemMeta();
		WeaponsM.setDisplayName("§f§lOld Sword");
		WeaponsM.setLore(Arrays.asList("§cDAMAGE: 10"," ","§f§lCOMMON"));
		WeaponsM.addEnchant(Enchantment.DAMAGE_ALL, 16, true);
		WeaponsM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		Weapons.setItemMeta(WeaponsM);
		
		ItemStack Charbon = new ItemStack(Material.COAL);
		ItemMeta CharbonM = Charbon.getItemMeta();
		CharbonM.setDisplayName("§f?????");
		Charbon.setItemMeta(CharbonM);
		
		ItemStack Stick = new ItemStack(Material.STICK);
		ItemMeta StickM = Stick.getItemMeta();
		StickM.setDisplayName("§f?????");
		Stick.setItemMeta(StickM);
		
		ItemStack Wood = new ItemStack(Material.LOG);
		ItemMeta WoodM = Wood.getItemMeta();
		WoodM.setDisplayName("§f?????");
		Wood.setItemMeta(WoodM);
		
		ItemStack Vitre = new ItemStack(Material.STAINED_GLASS_PANE);
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
		inv.setItem(9, Vitre);
		inv.setItem(13, Vitre);
		inv.setItem(14, Vitre);
		inv.setItem(15, Vitre);
		inv.setItem(16, Vitre);
		inv.setItem(17, Vitre);
		inv.setItem(18, Vitre);
		inv.setItem(22, Vitre);
		inv.setItem(23, Vitre);
		inv.setItem(32, Vitre);
		inv.setItem(25, Vitre);
		inv.setItem(26, Vitre);
		inv.setItem(27, Vitre);
		inv.setItem(31, Vitre);
		inv.setItem(33, Vitre);
		inv.setItem(34, Vitre);
		inv.setItem(35, Vitre);
		inv.setItem(36, Vitre);
		inv.setItem(37, Vitre);
		inv.setItem(38, Vitre);
		inv.setItem(39, Vitre);
		inv.setItem(40, Vitre);
		inv.setItem(41, Vitre);
		inv.setItem(42, Vitre);
		inv.setItem(43, Vitre);
		inv.setItem(44, Vitre);
		inv.setItem(10, Wood);
		inv.setItem(11, Charbon);
		inv.setItem(20, Wood);
		inv.setItem(29, Stick);
		
		inv.setItem(24, Weapons);
		p.openInventory(inv);
	}

}
// 12 19 21 28 30 /// 24 