package net.hubplugin.hub.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.hubplugin.hub.Main;
import net.hubplugin.hub.kit.joinItems;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class join implements Listener {
	
	private Main main;
	
	
	public join(Main main) {
		this.main = main;
	}


	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		main.rank.createAccount(p);
		main.coins.createAccount(p, 1000);
		e.setJoinMessage("");
		System.out.println("(Connection:"+p.getUniqueId()+"+"+p.getName()+"+"+main.rank.getRank(p)+"+"+main.coins.getCoins(p)+"€)");
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 0, 0),true);
		Location spawn = new Location(Bukkit.getWorld("world"), 0.500, 142, 0.500, 90f, 0f);
		p.sendMessage(ChatColor.YELLOW+"========"+ChatColor.DARK_PURPLE+"UltiCraft"+ChatColor.YELLOW+"========");
		p.sendMessage(" ");
		p.sendMessage(ChatColor.RED+"Le Serveur est en bêta.");
		p.sendMessage(ChatColor.RED+"Si il y a des problemes");
		p.sendMessage(ChatColor.RED+"Merci de nous le signaler");
		p.sendMessage(ChatColor.RED+"sur notre "+ChatColor.DARK_PURPLE+"Discord.");
		p.sendMessage(" ");
		p.sendMessage(ChatColor.YELLOW+"========"+ChatColor.DARK_PURPLE+"UltiCraft"+ChatColor.YELLOW+"========");
		p.teleport(spawn);
		p.sendMessage(" ");
		p.sendMessage(ChatColor.GREEN+"Sent to the mini876 server");
		p.getInventory().clear();

		joinItems.giveItems(p);
		
	}
	
	@EventHandler
	public void OnQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if(JeuxGUIInteract.PracticeList.contains(p)) {
			JeuxGUIInteract.removePracticeList(p);
		}
	}

}
