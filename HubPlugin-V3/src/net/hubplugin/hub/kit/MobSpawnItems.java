package net.hubplugin.hub.kit;

import java.util.Arrays;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class MobSpawnItems {
	
	public static void egyptianGuardianDragonItems(Player p) {
		Inventory inv = p.getInventory();
		
		ItemStack Sword = new ItemStack(Material.IRON_SWORD);
		ItemMeta SwordM = Sword.getItemMeta();
		SwordM.setDisplayName("§6Egyptian Guardian Dragon Sword");
		SwordM.setLore(Arrays.asList(" ","§cDamage : +261 §9(+51)§8 (+123.8)","§cStrenght : +302 §8(+84.2)"," ","§dSharpness IX, FireAspect III"," ","§6§lON RIGHT CLICK §r§6- God Of Cat :"," ","§6Allows you to have the §aJump boost II§6 and §fSpeed V §6effect for 1 minute.","§8Mana Costs : 100"));
		SwordM.addEnchant(Enchantment.DAMAGE_ALL, 9 * 15, true);
		SwordM.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		SwordM.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
		SwordM.spigot().setUnbreakable(true);
		Sword.setItemMeta(SwordM);
		
		ItemStack ECDragon = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta ECDragonM = (SkullMeta) ECDragon.getItemMeta();
		ECDragonM.setOwner("biiianca");
		ECDragonM.setDisplayName("§6Egyptian Dragon Helmet");
		ECDragonM.setLore(Arrays.asList(" ","§cStrenght : +100 §8(+124.3)","§9Speed : +10 §8(+14.7)"," ","§aHP : +150 §8(+160.4)"," ","§6§lFULL SET ABILITY §r§6: ", "§6Improves the damage of the Egyptian Guardian Dragon Sword by 5"));
		ECDragon.setItemMeta(ECDragonM);
		
		ItemStack lhelmet = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		LeatherArmorMeta lam = (LeatherArmorMeta)lhelmet.getItemMeta();
		lam.setColor(Color.fromRGB(96, 232, 45));
		lam.setDisplayName("§6Egyptian Dragon Chestplate");
		lam.setLore(Arrays.asList(" ","§cStrenght : +250 §8(+264.3)","§9Speed : +12 §8(+18.4)"," ","§aHP : +210 §8(+200.3)"," ","§6§lFULL SET ABILITY §r§6: ", "§6Improves the damage of the Egyptian Guardian Dragon Sword by 5"));
		lhelmet.setItemMeta(lam);
		
		ItemStack ArmorLeg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		LeatherArmorMeta ArmorLegm = (LeatherArmorMeta)ArmorLeg.getItemMeta();
		ArmorLegm.setColor(Color.fromRGB(96, 232, 45));
		ArmorLegm.setDisplayName("§6Egyptian Dragon Leggings");
		ArmorLegm.setLore(Arrays.asList(" ","§cStrenght : +170 §8(+157.1)","§9Speed : +11 §8(+17.9)"," ","§aHP : +185 §8(+190.2)"," ","§6§lFULL SET ABILITY §r§6: ", "§6Improves the damage of the Egyptian Guardian Dragon Sword by 5"));
		ArmorLeg.setItemMeta(ArmorLegm);
		
		ItemStack ArmorBot = new ItemStack(Material.LEATHER_BOOTS, 1);
		LeatherArmorMeta ArmorBotm = (LeatherArmorMeta)ArmorBot.getItemMeta();
		ArmorBotm.setColor(Color.fromRGB(96, 232, 45));
		ArmorBotm.setDisplayName("§6Egyptian Dragon Boots");
		ArmorBotm.setLore(Arrays.asList(" ","§cStrenght : +120 §8(+124.3)","§9Speed : +10.2 §8(+16.4)"," ","§aHP : +164.4 §8(+184.4)"," ","§6§lFULL SET ABILITY §r§6: ", "§6Improves the damage of the Egyptian Guardian Dragon Sword by 5"));
		ArmorBot.setItemMeta(ArmorBotm);
		
		inv.setItem(0, ECDragon);
		inv.setItem(1, lhelmet);
		inv.setItem(2, ArmorLeg);
		inv.setItem(3, ArmorBot);
		
		
		p.setItemInHand(Sword);
		
	}	

}
