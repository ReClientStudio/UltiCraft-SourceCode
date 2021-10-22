package net.ulticraft.practice.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.ulticraft.practice.Main;
import net.ulticraft.practice.kit.Classic;
import net.ulticraft.practice.kit.Diamond;
import net.ulticraft.practice.kit.Gapple;
import net.ulticraft.practice.kit.NoDebuff;
import net.ulticraft.practice.kit.Queue;
import net.ulticraft.practice.kit.Soup;
import net.ulticraft.practice.utils.ChatUtils;
import net.ulticraft.practice.utils.QueueManager;
import net.ulticraft.practice.utils.joinItems;


public class UnrankedGUIInteract implements Listener {
	
	int count = 60;
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equals(ChatUtils.format("§6Unranked"))) {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtils.format("§cNoDebuff"))) {
				
				QueueManager.addUnrankedNoDebuff(p);
				
				p.sendMessage("§9§lPractice §6> §7 You have been added to the §6Unranked NoDebuff §7 queue!");
				e.setCancelled(true);
				p.closeInventory();

				if(QueueManager.getUnrankedNoDebuffSize() >= 2) {
					
					Player t = QueueManager.unrankedNoDebuff.get(0);
					QueueManager.removeUnrankedNoDebuff(p);;
					QueueManager.removeUnrankedNoDebuff(p);
					
					QueueManager.addFightingPlayer(p, t);
					
					NoDebuff.giveItems(p);
					NoDebuff.giveItems(t);
					
					Location spawn1 = new Location(Bukkit.getWorld("practice"), -549.500, 60, -200.500, 140f, 0f);
					Location spawn2 = new Location(Bukkit.getWorld("practice"), -612.500, 60, -283.500, -40f, 0f);
					
					p.teleport(spawn1);
					t.teleport(spawn2);
					
					p.sendMessage("§9§lPractice §6> §7 You are duelling §a" + t.getName() + " §7 in §6NoDebuff§7!");
					t.sendMessage("§9§lPractice §6> §7 You are duelling §a" + p.getName() + " §7 in §6NoDebuff§7!");
					
					Main.combat.put(p, t);
					Main.combat.put(t, p);
					
				}
				else {
					Queue.giveItems(p);
					p.sendMessage("§9§lPractice §6> §7You are the §a" + QueueManager.getUnrankedNoDebuffSize() + " §7in the §6Unranked NoDebuff§7 Queue.");
				}
					
			}
			else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtils.format("§6Gapple"))) {
				QueueManager.addUnrankedGapple(p);
				
				p.sendMessage("§9§lPractice §6> §7 You have been added to the §6Unranked Gapple §7 queue!");
				e.setCancelled(true);
				p.closeInventory();

				if(QueueManager.getUnrankedGappleSize() >= 2) {
					
					Player t = QueueManager.unrankedGapple.get(0);
					QueueManager.removeUnrankedGapple(p);
					QueueManager.removeUnrankedGapple(t);
					
					QueueManager.addFightingPlayer(p, t);
					
					Location spawn1 = new Location(Bukkit.getWorld("practice"), -619.500, 19, -509.500, 180f, 0f);
					Location spawn2 = new Location(Bukkit.getWorld("practice"), -623.500, 19, -595.500, 0f, 0f);
					
					p.teleport(spawn1);
					t.teleport(spawn2);
					
					Gapple.giveItems(p);
					Gapple.giveItems(t);
				
					p.sendMessage("§9§lPractice §6> §7 You are duelling §a" + t.getName() + " §7 in §6Gapple§7!");
					t.sendMessage("§9§lPractice §6> §7 You are duelling §a" + p.getName() + " §7 in §6Gapple§7!");
					
					Main.combat.put(p, t);
					Main.combat.put(t, p);
					
				}
				else {
					Queue.giveItems(p);
					p.sendMessage("§9§lPractice §6> §7You are the §a" + QueueManager.getUnrankedGappleSize() + " §7in the §6Unranked Gapple§7 Queue.");
				}
			}
			if(e.getInventory().getName().equals(ChatUtils.format("§6Unranked"))) {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtils.format("§eDiamond"))) {
					
					QueueManager.addUnrankedDiamond(p);
					
					p.sendMessage("§9§lPractice §6> §7 You have been added to the §6Unranked Diamond §7 queue!");
					e.setCancelled(true);
					p.closeInventory();

					if(QueueManager.getUnrankedDiamondSize() >= 2) {
						
						
						Player t = QueueManager.unrankedDiamond.get(0);
						QueueManager.removeUnrankedDiamond(p);
						QueueManager.removeUnrankedDiamond(t);
						
						QueueManager.addFightingPlayer(p, t);
						
						Diamond.giveItems(p);
						Diamond.giveItems(t);
						
						Location spawn1 = new Location(Bukkit.getWorld("practice"), -864.500, 58, -176.500, 180f, 0f);
						Location spawn2 = new Location(Bukkit.getWorld("practice"), -864.500, 58, -255.500, 0f, 0f);
						
						p.teleport(spawn1);
						t.teleport(spawn2);
						
						p.sendMessage("§9§lPractice §6> §7 You are duelling §a" + t.getName() + " §7 in §6Diamond§7!");
						t.sendMessage("§9§lPractice §6> §7 You are duelling §a" + p.getName() + " §7 in §6Diamond§7!");
						
						Main.combat.put(p, t);
						Main.combat.put(t, p);
						
					}
					else {
						Queue.giveItems(p);
						p.sendMessage("§9§lPractice §6> §7You are the §a" + QueueManager.getUnrankedDiamondSize() + " §7in the §6Unranked Diamond§7 Queue.");
					}
				}
			}
			if(e.getInventory().getName().equals(ChatUtils.format("§6Unranked"))) {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtils.format("§9Classic"))) {
					
					QueueManager.addUnrankedClassic(p);
					
					p.sendMessage("§9§lPractice §6> §7 You have been added to the §6Unranked Classic §7 queue!");
					e.setCancelled(true);
					p.closeInventory();

					if(QueueManager.getUnrankedClassicSize() >= 2) {
						
						Player t = QueueManager.unrankedClassic.get(0);
						QueueManager.removeUnrankedClassic(p);
						QueueManager.removeUnrankedClassic(t);
						
						QueueManager.addFightingPlayer(p, t);
						
						Classic.giveItems(p);
						Classic.giveItems(t);
						
						Location spawn1 = new Location(Bukkit.getWorld("practice"), -1117.500, 38, -104.500, 0f, 0f);
						Location spawn2 = new Location(Bukkit.getWorld("practice"), -1116.500, 38, -22.500, 180f, 0f);
						
						p.teleport(spawn1);
						t.teleport(spawn2);
						
						p.sendMessage("§9§lPractice §6> §7 You are duelling §a" + t.getName() + " §7 in §6Classic§7!");
						t.sendMessage("§9§lPractice §6> §7 You are duelling §a" + p.getName() + " §7 in §6Classic§7!");
						
						Main.combat.put(p, t);
						Main.combat.put(t, p);
						
					}
					else {
						Queue.giveItems(p);
						p.sendMessage("§9§lPractice §6> §7You are the §a" + QueueManager.getUnrankedClassicSize() + " §7in the §6Unranked Classic§7 Queue.");
					}
				}
			}
			if(e.getInventory().getName().equals(ChatUtils.format("§6Unranked"))) {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtils.format("§aSoup"))) {
					
					QueueManager.addUnrankedSoup(p);
					
					p.sendMessage("§9§lPractice §6> §7 You have been added to the §6Unranked Soup §7 queue!");
					e.setCancelled(true);
					p.closeInventory();

					if(QueueManager.getUnrankedSoupSize() >= 2) {
						
						
						Player t = QueueManager.unrankedSoup.get(0);
						QueueManager.removeUnrankedSoup(p);
						QueueManager.removeUnrankedSoup(t);
						
						QueueManager.addFightingPlayer(p, t);
						
						Soup.giveItems(p);
						Soup.giveItems(t);
						
						Location spawn1 = new Location(Bukkit.getWorld("practice"), 10138.500, 31, 10186.500, 180f, 0f);
						Location spawn2 = new Location(Bukkit.getWorld("practice"), 10140.500, 31, 10142.500, 0f, 0f);
						
						p.teleport(spawn1);
						t.teleport(spawn2);
						
						p.sendMessage("§9§lPractice §6> §7 You are duelling §a" + t.getName() + " §7 in §6Soup§7!");
						t.sendMessage("§9§lPractice §6> §7 You are duelling §a" + p.getName() + " §7 in §6Soup§7!");
						
						Main.combat.put(p, t);
						Main.combat.put(t, p);
						
					}
					else {
						Queue.giveItems(p);
						p.sendMessage("§9§lPractice §6> §7You are the §a" + QueueManager.getUnrankedSoupSize() + " §7in the §6Unranked Soup§7 Queue.");
					}
				}
			}
		}else {
			return;
		}
	}
	
	/*
	@EventHandler
	public void onDeath(PlayerDeathEvent event) {
			Player player = event.getEntity();
			Player killer = player.getKiller();
			if (killer instanceof Player) {
				
	        if(Main.combat.containsKey(player) || Main.combat.containsKey(killer)) {
	        	String world = player.getLocation().getWorld().getName();
	    	    if (world.equals("practice")) {
			        QueueManager.removeFightingPlayer(player, killer);
			        
			        Main.combat.remove(player);
			        Main.combat.remove(killer);
			        
			        player.sendMessage("§6=============");
			        player.sendMessage(" ");
			        player.sendMessage("§a§lWinner : " + killer.getDisplayName() + " §f[§a" + killer.getHealth() +"§f]");
			        player.sendMessage("§c§lLooser : " + player.getDisplayName() + " §f[§a" + player.getHealth() +"§f]");
			        player.sendMessage(" ");
			        player.sendMessage("§6=============");
			        
			        killer.sendMessage("§6=============");
			        killer.sendMessage(" ");
			        killer.sendMessage("§a§lWinner : " + killer.getDisplayName() + " §f[§a" + killer.getHealth() +"§f]");
			        killer.sendMessage("§c§lLooser : " + player.getDisplayName() + " §f[§a" + player.getHealth() +"§f]");
			        killer.sendMessage(" ");
			        killer.sendMessage("§6=============");
			        
			        Location lobby = new Location(Bukkit.getWorld("practicelobby"), -98.500, 26, 86.500, 180f, 0f);
			        Location lobby2 = new Location(Bukkit.getWorld("practicelobby"), -98.500, 26, 86.500, 180f, 0f);
			        
			        player.teleport(lobby2);
					killer.teleport(lobby);
					
					joinItems.giveItems(player);
					joinItems.giveItems(killer);
					
	    	    }
    	    }
        }
	}*/
	
	@EventHandler
    public void onDamage(EntityDamageByEntityEvent e) {
        if (e.getEntity().getType() == EntityType.PLAYER) {
        	Player p = (Player) e.getEntity();
        	Player d = (Player) e.getDamager();
        	if (p.getHealth() <= 2) {
	            e.setCancelled(true);
	            if(Main.combat.containsKey(d)) {
	            	 
	            	int healkiller = (int) d.getHealth();
	            	
	            	QueueManager.removeFightingPlayer(p, d);
				    
	            	p.addPotionEffect((new PotionEffect(PotionEffectType.SPEED, 200000000, 2)));
					p.addPotionEffect((new PotionEffect(PotionEffectType.JUMP, 2000000000, 1)));
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0),true);
					p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 0, 0),true);
					p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 0, 0),true);
					
					d.addPotionEffect((new PotionEffect(PotionEffectType.SPEED, 200000000, 2)));
					d.addPotionEffect((new PotionEffect(PotionEffectType.JUMP, 2000000000, 1)));
					d.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0),true);
					d.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 0, 0),true);
					d.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 0, 0),true);

	            	
				   	Main.combat.remove(p);
				    Main.combat.remove(d);
				     
				    p.sendMessage("§6=============");
				    p.sendMessage(" ");
				    p.sendMessage("§a§lWinner : " + d.getDisplayName() + " §f[§a" + healkiller +"§f]");
				    p.sendMessage("§c§lLooser : " + p.getDisplayName() + " §f[§a0§f]");
				    p.sendMessage(" ");
				    p.sendMessage("§6=============");
				        
				    d.sendMessage("§6=============");
				    d.sendMessage(" ");
				    d.sendMessage("§a§lWinner : " + d.getDisplayName() + " §f[§a" + healkiller +"§f]");
				    d.sendMessage("§c§lLooser : " + p.getDisplayName() + " §f[§a0§f]");
				    d.sendMessage(" ");
				    d.sendMessage("§6=============");
				    
		            Location lobby = new Location(Bukkit.getWorld("practicelobby"), -181.500, 74.500, 357.500, 180f, 0f);
		         				 				        
		     	    p.teleport(lobby);
		         	d.teleport(lobby);
		         	
				    joinItems.giveItems(p);
				    joinItems.giveItems(d);
				    p.setFireTicks(0);
				    p.setHealth(20);
					p.setFoodLevel(20);
					p.setAllowFlight(false);
					p.setFlying(false);
					
					d.setFireTicks(0);
				    d.setHealth(20);
					d.setFoodLevel(20);
					d.setAllowFlight(false);
					d.setFlying(false);
		    	    
	    	    }
	        } 
        }      
	} 
}
