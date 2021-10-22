package net.ulticraft.practice.asset;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.ulticraft.practice.utils.ChatUtils;
import net.ulticraft.practice.utils.QueueManager;

public class Queue {

	public static void giveItems(Player p) {
		
		ItemStack Info = new ItemStack(Material.PAPER);
		ItemMeta InfoM = Info.getItemMeta();
		
		if(QueueManager.unrankedDiamond.contains(p)) {
			InfoM.setDisplayName(ChatColor.DARK_BLUE+"Queue : Diamond Unranked");
		}
		if(QueueManager.unrankedGapple.contains(p)) {
			InfoM.setDisplayName(ChatColor.DARK_BLUE+"Queue : Gapple Unranked");
		}
		if(QueueManager.unrankedNoDebuff.contains(p)) {
			InfoM.setDisplayName(ChatColor.DARK_BLUE+"Queue : NoDebuff Unranked");
		}
		if(QueueManager.unrankedClassic.contains(p)) {
			InfoM.setDisplayName(ChatColor.DARK_BLUE+"Queue : Classic Unranked");
		}
		
		Info.setItemMeta(InfoM);
		
		ItemStack LeaveQueue = new ItemStack(Material.BARRIER);
		ItemMeta LeaveQueueM = LeaveQueue.getItemMeta();
		
		if(QueueManager.unrankedDiamond.contains(p)) {
			LeaveQueueM.setDisplayName(ChatColor.DARK_BLUE+"Leave queue : Diamond Unranked");
		}
		if(QueueManager.unrankedGapple.contains(p)) {
			LeaveQueueM.setDisplayName(ChatColor.DARK_BLUE+"Leave queue : Gapple Unranked");
		}
		if(QueueManager.unrankedNoDebuff.contains(p)) {
			LeaveQueueM.setDisplayName(ChatColor.DARK_BLUE+"Leave queue : NoDebuff Unranked");
		}
		if(QueueManager.unrankedClassic.contains(p)) {
			LeaveQueueM.setDisplayName(ChatColor.DARK_BLUE+"Leave queue : Classic Unranked");
		}
		LeaveQueue.setItemMeta(LeaveQueueM);
		
		p.getInventory().clear();
		p.getInventory().setItem(0, Info);
		p.getInventory().setItem(8, LeaveQueue);
	}
	
}
