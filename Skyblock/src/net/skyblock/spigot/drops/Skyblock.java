package net.skyblock.spigot.drops;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Skyblock {
	
	public static void GiveSkyBlockBook(Player p) {
		Inventory inv = p.getInventory();
		
		ItemStack SkyBlockGuide = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta SkyBlockGuideM = SkyBlockGuide.getItemMeta();
		SkyBlockGuideM.setDisplayName("§fSkyBlock Guide");
		SkyBlockGuideM.setLore(Arrays.asList("", "§f§lCOMMON"));
		SkyBlockGuide.setItemMeta(SkyBlockGuideM);
		p.setItemInHand(SkyBlockGuide);
	}

}
