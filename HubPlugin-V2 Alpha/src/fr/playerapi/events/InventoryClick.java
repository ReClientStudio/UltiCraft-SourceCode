package fr.playerapi.events;

import fr.playerapi.managers.InventorysManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        if(e.getCurrentItem() == null) return;
        Player player = (Player) e.getWhoClicked();
        InventorysManager invs = new InventorysManager(player);

        e.setCancelled(true);

        switch(e.getCurrentItem().getType()){

            case COMPASS:
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Menu des Jeux")){
                    invs.menuDesJeux();
                }
                break;

            case NETHER_STAR:
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§1L§2o§3b§4b§5y")){
                    invs.menuDesLobby();
                }
                break;
            case BARRIER:
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§cClose")){
                    player.closeInventory();
                }
                break;
            case EMERALD:
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§aBoutique")){
                    invs.menuBoutique();
                }
                break;

            default: break;
        }
    }

}
