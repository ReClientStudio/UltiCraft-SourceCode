package fr.playerapi.managers;

import fr.playerapi.events.InventoryClick;
import fr.playerapi.events.PlayerChat;
import fr.playerapi.events.PlayerInteract;
import fr.playerapi.events.PlayerJoin;
import fr.playerapi.main;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventsManager {

    public void registers(main main) {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoin(main), main);
        pm.registerEvents(new PlayerChat(main), main);
        pm.registerEvents(new InventoryClick(), main);
        pm.registerEvents(new PlayerInteract(), main);
    }
}
