package fr.playerapi.events;

import fr.playerapi.main;
import fr.playerapi.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class PlayerJoin implements Listener {

    private main main;

    public PlayerJoin(main main){
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        p.setGameMode(GameMode.ADVENTURE);
        p.teleport(Bukkit.getWorlds().get(0).getSpawnLocation());
        p.getInventory().clear();
        p.getInventory().setHelmet(new ItemStack(Material.AIR));
        p.getInventory().setChestplate(new ItemStack(Material.AIR));
        p.getInventory().setLeggings(new ItemStack(Material.AIR));
        p.getInventory().setBoots(new ItemStack(Material.AIR));
        p.setHealth(20);
        p.setFoodLevel(20);
        p.setLevel(0);
        p.setExp(0);

        for(PotionEffect pe : p.getActivePotionEffects()){
            p.removePotionEffect(pe.getType());
        }

        e.setJoinMessage("§6[Hub] " +  main.rank.getRank(p).getPrefix() + p.getName() + "§a a rejoint le hub !");

        ItemBuilder compass = new ItemBuilder(Material.COMPASS).setName("§6Menu des Jeux").setLore("", "§aClic droit !");
        ItemBuilder emerald = new ItemBuilder(Material.EMERALD).setName("§aBoutique").setLore("", "§aClic droit !");
        ItemBuilder enderchest = new ItemBuilder(Material.ENDER_CHEST).setName("§5Cosmetiques").setLore("", "§aClic droit !");
        ItemBuilder netherstar = new ItemBuilder(Material.NETHER_STAR).setName("§1L§2o§3b§4b§5y").setLore("", "§aClic droit !");

        p.getInventory().setItem(0, compass.toItemStack());
        p.getInventory().setItem(7, emerald.toItemStack());
        p.getInventory().setItem(4, enderchest.toItemStack());
        p.getInventory().setItem(8, netherstar.toItemStack());

        main.rank.createAccount(p);

    }

}
