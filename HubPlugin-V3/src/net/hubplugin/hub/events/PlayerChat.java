package net.hubplugin.hub.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import net.hubplugin.hub.Main;
import net.hubplugin.hub.rank.Rank;

public class PlayerChat implements Listener {
	
	private Main main;
	

	public PlayerChat(Main main) {
		this.main = main;
	}


	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
		e.setFormat(new Rank(main).getRank(p).getPrefix() + "%1$s "+ ChatColor.WHITE +": "+ChatColor.DARK_GRAY+"%2$s");
	}
	
	
	

}
