package net.skyblock.spigot.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.skyblock.spigot.gui.Guide;

public class ItemInteract implements Listener {

	static int timer = 60;
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(p.getInventory().getItemInHand() == null) {
			return;
		}
		
		if(p.getInventory().getItemInHand().getItemMeta() == null) {
			return;
		}
		
		if(p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§6Obsidian Sword")) {
			/*nnif(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
				p.sendMessage("§aUsed §6Obsidian Sword§a! §b(50 Mana)");
				p.setWalkSpeed(0.5f);
				Bukkit.getScheduler().runTaskTimer(Main.getInstance(), new BukkitRunnable(){
					  
	                   @Override
	                   public void run() {
	                       
	                	   //ON ENLEVE 1 A CHAQUE SECONDE POUR QUE LE CHRONO PUISSENT BAISSER
	                	   timer--;
	                       
	                       if(timer == 0){
	                           //ON ARRETE LE CHRONO
	                           Bukkit.getScheduler().cancelTask();
	                           p.setWalkSpeed(0.1f);
	                       }
	                      
	                   }
	                   
	              }, 0, 20);
	               
				
			}
	*/
			
		}
		if(p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§fSkyBlock Guide")) {
			Guide.openGUI(p);
			p.playSound(p.getLocation(), Sound.VILLAGER_YES, 10, 1);
		}
		else {
			return;
		}
	}

}
