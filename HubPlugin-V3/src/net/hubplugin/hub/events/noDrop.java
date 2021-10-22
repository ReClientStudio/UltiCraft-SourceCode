package net.hubplugin.hub.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class noDrop implements Listener {

	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
		String world = p.getLocation().getWorld().getName();
		if (world.equals("world")) {
			e.setCancelled(true);
		   	}else {
		    	e.setCancelled(false);
		    }	
		
	}
	
	@EventHandler
	public void onPickup(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		String world = p.getLocation().getWorld().getName();
		if (world.equals("world")) {
			e.setCancelled(true);
		   	}else {
		    	e.setCancelled(false);
		    }	  
	}
	
	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e) {
		if(e.getEntity() instanceof Player) {
			if(e.getDamager() instanceof Player) {
				Player p = (Player)e.getEntity();
				Player t = (Player)e.getDamager();
				String world = p.getLocation().getWorld().getName();
				if (world.equals("world")) {
					e.setCancelled(true);
				   	}else {
				    	e.setCancelled(false);
				    }	
			}
		}
	}
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		String world = p.getLocation().getWorld().getName();
		if (world.equals("world")) {
			e.setCancelled(true);
		   	}else {
		    	e.setCancelled(false);
		    }	   
	}
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
	Player p = e.getPlayer();
	String world = p.getLocation().getWorld().getName();
	if (world.equals("world")) {
		e.setCancelled(true);
	   	}else {
	    	e.setCancelled(false);
	    }	
    
	}
	@EventHandler(priority = EventPriority.HIGHEST)
    public void fall(EntityDamageEvent e){
        Player p = (Player) e.getEntity();
	    if(e.getEntity() instanceof Player && e.getCause() == EntityDamageEvent.DamageCause.FALL){
	    	String world = p.getLocation().getWorld().getName();
			if (world.equals("world")) {
				e.setCancelled(true);
			   	}else {
			    	e.setCancelled(false);
			    }	
             
        }
    }
}
