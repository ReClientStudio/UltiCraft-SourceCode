package fr.playerapi.managers;

import fr.playerapi.main;
import fr.playerapi.rank.RankUnit;
import fr.playerapi.shop.ShopItems;
import fr.playerapi.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InventorysManager {

    private Player player;

    public InventorysManager(Player player){
        this.player = player;
    }

    public void menuDesJeux() {
        Inventory inv = Bukkit.createInventory(null, 5 * 9, "Menu des Jeux");

        ItemBuilder bed = new ItemBuilder(Material.BED).setName("§6BedWars").setLore("", "§a> §eClic gauche pour rejoindre", "");

        inv.setItem(11, bed.toItemStack());

        player.openInventory(inv);
    }

    public void menuDesLobby() {
        Inventory inv = Bukkit.createInventory(null, 3 * 9, "Menu des Lobby");

        ItemBuilder lobby1 = new ItemBuilder(Material.QUARTZ_BLOCK).setName("§r§lLobby #1").setLore("", "§a> §eClic gauche pour rejoindre", "");
        ItemBuilder lobby2 = new ItemBuilder(Material.HARD_CLAY).setName("§r§lLobby #2").setLore("", "§a> §eClic gauche pour rejoindre", "§cServeur Off");
        ItemBuilder lobby3 = new ItemBuilder(Material.HARD_CLAY).setName("§r§lLobby #3").setLore("", "§a> §eClic gauche pour rejoindre", "§cServeur Off");
        ItemBuilder door1 = new ItemBuilder(Material.BARRIER).setName("§cClose").setLore("", "§a> §eClic gauche pour fermer l'interface", "");

        inv.setItem(22, door1.toItemStack());
        inv.setItem(12, lobby1.toItemStack());
        inv.setItem(13, lobby2.toItemStack());
        inv.setItem(14, lobby3.toItemStack());

        player.openInventory(inv);
    }

    public void menuBoutique(){
        Inventory inv = Bukkit.createInventory(null, 5 * 9, "Boutique");

        ItemBuilder vip = new ItemBuilder(Material.NAME_TAG).setName("§a" + ShopItems.VIP.getName()).setLore("", "§7Prix: " + (main.getInstance().rank.getRank(player).getPower() >= RankUnit.VIP.getPower() ? "§6Acheté ✔" : "§a" + ShopItems.VIP.getPrice()));

        ItemBuilder vipx = new ItemBuilder(Material.NAME_TAG).setName("§a" + ShopItems.VIPX.getName()).setLore("", "§7Prix: " + (main.getInstance().rank.getRank(player).getPower() >= RankUnit.VIPX.getPower() ? "§6Acheté ✔" : "§a" + ShopItems.VIPX.getPrice()));

        ItemBuilder mvp = new ItemBuilder(Material.NAME_TAG).setName("§b" + ShopItems.MVP.getName()).setLore("", "§7Prix: " + (main.getInstance().rank.getRank(player).getPower() >= RankUnit.MVP.getPower() ? "§6Acheté ✔" : "§a" + ShopItems.MVP.getPrice()));

        ItemBuilder mvpx = new ItemBuilder(Material.NAME_TAG).setName("§b" + ShopItems.MVPX.getName()).setLore("", "§7Prix: " + (main.getInstance().rank.getRank(player).getPower() >= RankUnit.MVPX.getPower() ? "§6Acheté ✔" : "§a" + ShopItems.MVPX.getPrice()));

        ItemBuilder mvpxx = new ItemBuilder(Material.NAME_TAG).setName("§6" + ShopItems.MVPXX.getName()).setLore("", "§7Prix: " + (main.getInstance().rank.getRank(player).getPower() >= RankUnit.MVPXX.getPower() ? "§6Acheté ✔" : "§a" + ShopItems.MVPXX.getPrice()));

        inv.setItem(11, vip.toItemStack());
        inv.setItem(12, vipx.toItemStack());
        inv.setItem(13, mvp.toItemStack());
        inv.setItem(14, mvpx.toItemStack());
        inv.setItem(15, mvpxx.toItemStack());

        player.openInventory(inv);
    }

}
