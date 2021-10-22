package net.hubplugin.hub.gui.manage;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BuilderGuiManage {
	
public static void openGUI(Player p) {
		
		Inventory inv = Bukkit.createInventory(null, 9, "§6Builder Menu");
		
		ItemStack Gapple = new ItemStack(Material.EYE_OF_ENDER);
		ItemMeta GappleM = Gapple.getItemMeta();
		GappleM.setDisplayName("§6Change Gamemode");
		Gapple.setItemMeta(GappleM);
		
		ItemStack Diamond = new ItemStack(Material.IRON_AXE);
		ItemMeta DiamondM = Diamond.getItemMeta();
		DiamondM.setDisplayName("§6Practice");
		Diamond.setItemMeta(DiamondM);
		
		ItemStack Shop = new ItemStack(Material.ENDER_PORTAL_FRAME);
		ItemMeta ShopM = Shop.getItemMeta();
		ShopM.setDisplayName("§6Boutique");
		Shop.setItemMeta(ShopM);
		
		ItemStack Retour = new ItemStack(Material.ARROW);
		ItemMeta RetourM = Retour.getItemMeta();
		RetourM.setDisplayName("§6Fermer");
		Retour.setItemMeta(RetourM);
		
		ItemStack Conf = new ItemStack(Material.ANVIL);
		ItemMeta ConfM = Conf.getItemMeta();
		ConfM.setDisplayName("§6Parametre");
		Conf.setItemMeta(ConfM);
		
		ItemStack Vitre = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)9);
		
		ItemStack Bientot = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)4);
		ItemMeta BienM = Bientot.getItemMeta();
		BienM.setDisplayName("§cBientôt.");
		Bientot.setItemMeta(BienM);
		
		ItemStack Skyblock = new ItemStack(Material.DIRT, 1, (byte)2);
		ItemMeta SkyblockM = Skyblock.getItemMeta();
		SkyblockM.setDisplayName("§6Skyblock");
		Skyblock.setItemMeta(SkyblockM);
		
		inv.setItem(21, Bientot);
		inv.setItem(22, Bientot);
		inv.setItem(23, Bientot);
		inv.setItem(31, Skyblock);
		inv.setItem(32, Diamond);
		inv.setItem(30, Gapple);
		
		inv.setItem(48, Shop);
		inv.setItem(50, Conf);
		inv.setItem(0, Vitre);
		inv.setItem(53, Retour);
		inv.setItem(1, Vitre);
		inv.setItem(2, Vitre);
		inv.setItem(3, Vitre);
		inv.setItem(4, Vitre);
		inv.setItem(5, Vitre);
		inv.setItem(6, Vitre);
		inv.setItem(7, Vitre);
		inv.setItem(8, Vitre);
		inv.setItem(49, Vitre);
		inv.setItem(51, Vitre);
		inv.setItem(52, Vitre);
		inv.setItem(47, Vitre);
		inv.setItem(46, Vitre);
		inv.setItem(45, Vitre);
		inv.setItem(52, Vitre);
		
		
		p.openInventory(inv);
	}

}
