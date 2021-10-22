package net.ulticraft.practice.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class UnrankedGUI {
	
	public static void openGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9, ChatUtils.format("§6Unranked"));
		
		ItemStack Gapple = new ItemStack(Material.GOLDEN_APPLE);
		ItemMeta GappleM = Gapple.getItemMeta();
		GappleM.setDisplayName(ChatUtils.format("§6Gapple"));
		Gapple.setItemMeta(GappleM);
		
		ItemStack Diamond = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta DiamondM = Diamond.getItemMeta();
		DiamondM.setDisplayName(ChatUtils.format("§eDiamond"));
		Diamond.setItemMeta(DiamondM);
		
		ItemStack Debuff = new ItemStack(Material.COOKED_BEEF);
		ItemMeta DebuffM = Debuff.getItemMeta();
		DebuffM.setDisplayName(ChatUtils.format("§cNoDebuff"));
		Debuff.setItemMeta(DebuffM);
		
		ItemStack Classic = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta ClassicM = Classic.getItemMeta();
		ClassicM.setDisplayName(ChatUtils.format("§9Classic"));
		Classic.setItemMeta(ClassicM);
		
		ItemStack Soup = new ItemStack(Material.BOWL);
		ItemMeta SoupM = Soup.getItemMeta();
		SoupM.setDisplayName("§aSoup");
		Soup.setItemMeta(SoupM);
		
		inv.setItem(0, Diamond);
		inv.setItem(1, Gapple);
		inv.setItem(2, Debuff);
		inv.setItem(3, Classic);
		inv.setItem(4, Soup);
		
		p.openInventory(inv);
	}
		
}
