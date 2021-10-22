package net.skyblock.spigot.cmds;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class SkyBlockItemDebug implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			Player p = ((Player) sender).getPlayer();
			Inventory inv = Bukkit.createInventory(null, 9, ("§6Skyblock Item Debug"));
			
			ItemStack IronE = new ItemStack(Material.IRON_INGOT);
			 ItemMeta IronEM = IronE.getItemMeta();
			 IronEM.addEnchant(Enchantment.DURABILITY, 1, true);
			 IronEM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			 IronEM.setDisplayName("§fEnchanted Iron");
			 IronEM.setLore(Arrays.asList("", "§f§lCOMMON"));
			 IronE.setItemMeta(IronEM);
			 
			 ItemStack diamond = new ItemStack(Material.DIAMOND);
			 ItemMeta diamondM = diamond.getItemMeta();
			 IronEM.addEnchant(Enchantment.DURABILITY, -1, true);
			 IronEM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			 diamondM.setDisplayName("§aEnchanted Diamond");
			 diamondM.setLore(Arrays.asList("", "§a§lUNCOMMON"));
			 diamond.setItemMeta(diamondM);
			 ItemStack PICKAXEFAIRY = new ItemStack(Material.GOLD_PICKAXE);
			 ItemMeta PICKAXEFAIRYM = PICKAXEFAIRY.getItemMeta();
			 PICKAXEFAIRYM.addEnchant(Enchantment.DURABILITY, -1, true);
			 PICKAXEFAIRYM.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
			 PICKAXEFAIRYM.setDisplayName("§5Fairy Pickaxe");
			 PICKAXEFAIRYM.setLore(Arrays.asList("", "§5§lEPIC"));
			 PICKAXEFAIRY.setItemMeta(PICKAXEFAIRYM);
			 
			 ItemStack OBSISWORD = new ItemStack(Material.DIAMOND_SWORD);
			 ItemMeta OBSISWORDM = OBSISWORD.getItemMeta();
			 OBSISWORDM.addEnchant(Enchantment.DURABILITY, -1, true);
			 OBSISWORDM.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
			 OBSISWORDM.setDisplayName("§6Obsidian Sword");
			 OBSISWORDM.setLore(Arrays.asList("§cATTACK : +320", "§cCRIT CHANCE : +53%", "§cSPEED : -5", " ", "§6ON RIGHT CLICK :", "§a+200 Defense, §c+50 Hp §6and §b+30 Speed §6For 60 seconds", "§3Mana cost : 50", " ", "§6§lLEGENDARY"));
			 OBSISWORD.setItemMeta(OBSISWORDM);
			 
			 ItemStack Wolf = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
			 SkullMeta WolfM = (SkullMeta) Wolf.getItemMeta();
			 WolfM.setOwner("MHF_Wolf");
			 WolfM.setDisplayName("§9Wolf pet §7[Lvl 0]");
			 WolfM.setLore(Arrays.asList("§8Combat pet", " ", "§7Attack : §9§k???", "§7Speed : §9§k???", " ", "§7Progress to level 1: §e0%", "§f-------------------- §e0§6/§e250", " ", "§9§lRARE"));
			 Wolf.setItemMeta(WolfM);
			 
			 ItemStack Weapons = new ItemStack(Material.WOOD_HOE);
			ItemMeta WeaponsM = Weapons.getItemMeta();
			WeaponsM.setDisplayName("§f§lOld Sword");
			WeaponsM.setLore(Arrays.asList("§cDAMAGE: 10"," ","§f§lCOMMON"));
			WeaponsM.addEnchant(Enchantment.DAMAGE_ALL, 16, true);
			WeaponsM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			Weapons.setItemMeta(WeaponsM);
			 
			 
			 inv.setItem(4, OBSISWORD);
			 inv.setItem(3, PICKAXEFAIRY);
			 inv.setItem(1, diamond);
			 inv.setItem(0, IronE);
			 inv.setItem(2, Wolf);
			 inv.setItem(5, Weapons);
			 
			 p.openInventory(inv);
			 
		}
		return false;
	}

}
