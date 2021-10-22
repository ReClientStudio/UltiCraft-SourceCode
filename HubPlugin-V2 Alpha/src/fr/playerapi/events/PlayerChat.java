package fr.playerapi.events;


import fr.playerapi.main;
import fr.playerapi.rank.Rank;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {

    private main main;

    public PlayerChat(main main){
            this.main = main;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        Player player = e.getPlayer();

        e.setFormat("§6[Hub] " + main.rank.getRank(player).getPrefix() + "%1$s §7: §f%2$s"); // [Grade] Joueur : Message
    }

}
