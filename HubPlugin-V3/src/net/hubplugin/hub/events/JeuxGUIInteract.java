package net.hubplugin.hub.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.hubplugin.hub.gui.GUIshop;
import net.hubplugin.hub.kit.skyWars;
import net.hubplugin.hub.scoreboards.ScoreboardSign;


public class JeuxGUIInteract implements Listener {
	
	public static ArrayList<Player> PracticeList = new ArrayList<Player>();
	public Map<Player, ScoreboardSign> boards = new  HashMap<>();
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();

		if(e.getInventory().getName().equals("§6Jeux")) {
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Practice")) {
				Location spawn = new Location(Bukkit.getWorld("practicelobby"), -181.500, 74.500, 357.500, 180f, 0f);
				
				JeuxGUIInteract.addPracticeList(p);

				p.sendMessage("§6Change-Log Practice200620B :");
				p.sendMessage("§d1. Ajout d'§ffet au spawn.");
				p.sendMessage("§d2. Modification du kit Classic.");
				p.sendMessage("§d3. Correction du scoreboard.");
				p.sendMessage("§d4. Ajout d'arene suplementaire.");
				p.sendMessage("§d5. Correction de bug en tous genre. ");
				p.sendMessage("§6Bon jeu sur le practice.");

				ScoreboardSign scoreboard = new ScoreboardSign(p, "§dPractice §9(B§ta)");
				scoreboard.create();
				scoreboard.setLine(0, "§a");
				scoreboard.setLine(1, "§6Connect : §d" + JeuxGUIInteract.getPracticeListSize() + "/250");
				scoreboard.setLine(2, "§d");
				scoreboard.setLine(4, "§eUlti.craft.gg");
				boards.put(p, scoreboard);
				
				p.addPotionEffect((new PotionEffect(PotionEffectType.SPEED, 200000000, 2)));
				p.addPotionEffect((new PotionEffect(PotionEffectType.JUMP, 2000000000, 1)));
				
				p.teleport(spawn);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6SkyWars")) {
				Location spawn = new Location(Bukkit.getWorld("Skywarslobby"), 0.500, 46, 26.500, 180f, 0f);
				skyWars.giveItems(p);
				p.teleport(spawn);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Fermer")) {
				p.closeInventory();
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Boutique")) {
				p.closeInventory();
				GUIshop.openGUI(p);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Skyblock")) {
				Location spawn = new Location(Bukkit.getWorld("Skyblocklobby"), -1.500, 85, 9.500, 0f, 0f);
				p.teleport(spawn);
			}
		}
	}
	
	public static void removePracticeList(Player p) {
		PracticeList.remove(p);
	}
	
	
	public static void addPracticeList(Player p) {
		PracticeList.add(p);
	}
	
	public static Integer getPracticeListSize() {
		return PracticeList.size();
	}
	
	@EventHandler
	public void OnChangeWorld(PlayerChangedWorldEvent e) {
		Player p = e.getPlayer();
		if(boards.containsKey(p)) {
			String world = p.getLocation().getWorld().getName();
			if (world.equals("world")) {
				JeuxGUIInteract.removePracticeList(p);
				
				boards.get(p).destroy();
				
			}

			boards.get(p).setLine(1, "§6Connect : §d" + JeuxGUIInteract.getPracticeListSize() + "/250");
		}
	}
	
	@EventHandler
	public void OnQuitg(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if(JeuxGUIInteract.PracticeList.contains(p)) {
			JeuxGUIInteract.removePracticeList(p);
			boards.get(p).destroy();
		}
	}
	
}