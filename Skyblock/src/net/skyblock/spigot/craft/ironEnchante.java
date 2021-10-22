package net.skyblock.spigot.craft;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.skyblock.spigot.utiles.AdvanceRecipe;

public class ironEnchante {
	
	/*AdvanceRecipe recipe = new AdvanceRecipe(itemACrafter);
	recipe.shape("AAA", "AAA", "AAA");
	recipe.setIngredient('A', itemARemplacé);
	recipe.register();
	*/
	
	 public void NomDeCraft() {
		 ItemStack IronE = new ItemStack(Material.IRON_INGOT);
		 ItemMeta IronEM = IronE.getItemMeta();
		 IronEM.addEnchant(Enchantment.DURABILITY, 1, true);
		 IronEM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		 IronEM.setDisplayName("§aEnchanted iron");
		 IronEM.setLore(Arrays.asList("", "§a§lUNCOMMON"));
		 IronE.setItemMeta(IronEM);
		 
		 ItemStack Iron = new ItemStack(Material.IRON_INGOT);
		 ItemMeta IronM = Iron.getItemMeta();
		 IronM.setDisplayName("§firon");
		 IronM.setLore(Arrays.asList("", "§f§lCOMMON"));
		 Iron.setItemMeta(IronM);
		 
		 AdvanceRecipe recipe = new AdvanceRecipe(IronE);
		 recipe.shape(" A ", "AAA", " A ");
		 recipe.setIngredient('A', Iron);
		 recipe.register();
	 }
	 
	 
	
}
