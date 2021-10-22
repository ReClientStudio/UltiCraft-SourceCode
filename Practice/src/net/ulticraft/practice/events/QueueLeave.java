package net.ulticraft.practice.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.ulticraft.practice.utils.QueueManager;
import net.ulticraft.practice.utils.joinItems;

public class QueueLeave implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if(p.getInventory().getItemInHand().getType().equals(Material.BARRIER)) {
				if(QueueManager.unrankedDiamond.contains(p)) {
					QueueManager.removeUnrankedDiamond(p);
					p.sendMessage("§9§lPractice §6> §cYou leave the §6Unranked Diamond §7queue!");
					joinItems.giveItems(p);
				}
				if(QueueManager.unrankedGapple.contains(p)) {
					QueueManager.removeUnrankedGapple(p);
					p.sendMessage("§9§lPractice §6> §cYou leave the §6Unranked Gapple §7queue!");
					joinItems.giveItems(p);
				}
				if(QueueManager.unrankedNoDebuff.contains(p)) {
					QueueManager.removeUnrankedNoDebuff(p);
					p.sendMessage("§9§lPractice §6> §cYou leave the §6Unranked NoDebuff §7queue!");
					joinItems.giveItems(p);
				}
				if(QueueManager.unrankedClassic.contains(p)) {
					QueueManager.removeUnrankedClassic(p);
					p.sendMessage("§9§lPractice §6> §cYou leave the §6Unranked Classic §7queue!");
					joinItems.giveItems(p);
				}
			}
		}
	}

}
