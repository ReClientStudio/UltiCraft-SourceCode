package net.skyblock.spigot.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import net.skyblock.spigot.drops.minerais;


public class BreakBlock implements Listener {
	
	
	@SuppressWarnings("unlikely-arg-type")
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		Block b = e.getBlock();
			
		if(b.equals(Material.STONE)) {
			b.getDrops().clear();
			b.setType(Material.COBBLESTONE);
			
			minerais.GiveCobbleStone(p);
			p.playSound(b.getLocation(), Sound.DRINK, 1, 1);
		}

	}
	
}
