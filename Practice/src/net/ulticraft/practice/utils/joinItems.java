package net.ulticraft.practice.utils;

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
		
		inv.clear();
		ItemStack unranked = new ItemStack(Material.IRON_SWORD);
		ItemMeta unrankedM = unranked.getItemMeta();
		
		unrankedM.setDisplayName(ChatUtils.format("§6Unranked"));
		unranked.setItemMeta(unrankedM);
		
		inv.setItem(0, unranked);
		
		
		ItemStack ranked = new ItemStack(Material.GOLD_SWORD);
		ItemMeta rankedM = ranked.getItemMeta();
		
		rankedM.setDisplayName(ChatUtils.format("§bRanked"));
		ranked.setItemMeta(rankedM);
		
		inv.setItem(1, ranked);
		
		ItemStack Stats = new ItemStack(Material.BOOK);
		ItemMeta StatsM = Stats.getItemMeta();
		
		StatsM.setDisplayName(ChatUtils.format("§9Stats"));
		Stats.setItemMeta(StatsM);
		
		inv.setItem(7, Stats);
		
		
		ItemStack EditKit = new ItemStack(Material.BOOKSHELF);
		ItemMeta EditKitM = EditKit.getItemMeta();
		
		EditKitM.setDisplayName(ChatUtils.format("§2EditKit"));
		EditKit.setItemMeta(EditKitM);
		
		inv.setItem(8, EditKit);
		
		
		ItemStack Spec = new ItemStack(Material.EYE_OF_ENDER);
		ItemMeta SpecM = Spec.getItemMeta();
		
		SpecM.setDisplayName(ChatUtils.format("§9Spectate"));
		Spec.setItemMeta(SpecM);
		
		inv.setItem(6, Spec);
		

		ItemStack Partie = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta PartieM = Partie.getItemMeta();
		
		PartieM.setDisplayName(ChatUtils.format("§aTeaming"));
		Partie.setItemMeta(PartieM);
		
		inv.setItem(2, Partie);
	}
	
}
