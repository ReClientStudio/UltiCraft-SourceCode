package net.skyblock.spigot.drops;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class minerais {
	
	public static void GiveCobbleStone(Player p) {
		
		ItemStack CobbleStone = new ItemStack(Material.COBBLESTONE);
		ItemMeta CobbleStoneM = CobbleStone.getItemMeta();
		CobbleStoneM.setDisplayName("§fCobblestone");
		CobbleStoneM.setLore(Arrays.asList("", "§f§lCOMMON"));
		CobbleStone.setItemMeta(CobbleStoneM);
		
	}
	
}
