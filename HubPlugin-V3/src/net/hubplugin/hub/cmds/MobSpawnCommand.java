package net.hubplugin.hub.cmds;

import java.util.Arrays;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;

import net.hubplugin.hub.kit.MobSpawnItems;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.EntityZombie;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import net.minecraft.server.v1_8_R3.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo.EnumPlayerInfoAction;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import net.minecraft.server.v1_8_R3.PlayerInteractManager;
import net.minecraft.server.v1_8_R3.WorldServer;

public class MobSpawnCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("mobspawn")) {
            if(!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "Only Players can use this Command");
                return true;
            }
            Player player = (Player) sender;
            WorldServer world = ((CraftWorld)player.getWorld()).getHandle();
            Location loc = player.getLocation();
            if (args.length == 0) {
                player.sendMessage(ChatColor.GREEN + "Merci d'utiliser la commande /mobspawn help");
                return true;
            }
            else if(args.length == 1) {
                if (args[0].equalsIgnoreCase("help")) {
                    player.sendMessage(ChatColor.GREEN + "DragonBoss");  
                    return true;
                }
                if(args[0].equalsIgnoreCase("dragonboss")) { 
                	
                	EntityZombie zomb = new EntityZombie(world);
                	
                	zomb.setCustomName(ChatColor.GOLD + "Egyptian Guardian Dragon §e✪✪✪");
                	zomb.setCustomNameVisible(true);
                	
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
            		
            		
            		ItemStack weapon = new ItemStack(Material.IRON_SWORD, 1);
            		ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
            		ItemStack pants = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
            		ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
            		ItemStack helmet = new ItemStack(Material.SNOW_BLOCK, 1);

            		
            		
            		zomb.isPersistent();
            		zomb.setHealth(500);
                	zomb.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
                	world.addEntity(zomb);
                	
                /*	Player p = (Player) sender;
                    Location loc = p.getLocation();
					Player zombie = (Player) p.getWorld().spawnEntity(loc, EntityType.PLAYER);
                    
                    zombie.setCustomName(ChatColor.GOLD + "Egyptian Guardian Dragon §e✪✪✪");
                    zombie.setCustomNameVisible(true);
                    
                    
                    zombie.getInventory().setChestplate(null);
                    zombie.getInventory().setLeggings(null);
                    zombie.getInventory().setBoots(null);
            		zombie.setHealth(20);
            		zombie.setFoodLevel(20);
            		zombie.setAllowFlight(false);
            		zombie.setFlying(false);
            		
            		MobSpawnItems.egyptianGuardianDragonItems(zombie);*/
                    
                }
                if(args[0].equalsIgnoreCase("giveItemsOfDragon")) {
                	
                	MobSpawnItems.egyptianGuardianDragonItems(player);
                }
                if(args[0].equalsIgnoreCase("ZombieDugeons1")) {
                	
                	Location location = player.getLocation();
                	
                	ItemStack Sword = new ItemStack(Material.IRON_SWORD);
            		ItemMeta SwordM = Sword.getItemMeta();
            		SwordM.setDisplayName("§6Egyptian Guardian Dragon Sword");
            		SwordM.setLore(Arrays.asList(" ","§cDamage : +261 §9(+51)§8 (+123.8)","§cStrenght : +302 §8(+84.2)"," ","§dSharpness IX, FireAspect III"," ","§6§lON RIGHT CLICK §r§6- God Of Cat :"," ","§6Allows you to have the §aJump boost II§6 and §fSpeed V §6effect for 1 minute.","§8Mana Costs : 100"));
            		SwordM.addEnchant(Enchantment.DAMAGE_ALL, 9 * 15, true);
            		SwordM.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
            		SwordM.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
            		SwordM.spigot().setUnbreakable(true);
            		Sword.setItemMeta(SwordM);
                	
                	MinecraftServer server = ((CraftServer)Bukkit.getServer()).getServer();
                    WorldServer world1 = ((CraftWorld)Bukkit.getServer().getWorlds().get(0)).getHandle();
                   
                    EntityPlayer friend = new EntityPlayer(server, world1, new GameProfile(UUID.fromString("ecd27fd8-5b86-4683-98b4-f3e59dbda7de"), commandLabel), new PlayerInteractManager(world));
                   
                    friend.teleportTo(player.getLocation(), false);
                    friend.setCustomName("§dZombie Dugeons Tier I §c" + friend.getHealth());
                    friend.setCustomNameVisible(true);
                    friend.setHealth(100);
                   
                    PacketPlayOutPlayerInfo playerInfoPacket = new PacketPlayOutPlayerInfo(EnumPlayerInfoAction.ADD_PLAYER, friend);
                    PacketPlayOutNamedEntitySpawn namedEntityPacket = new PacketPlayOutNamedEntitySpawn(friend);
                       
                   
                    for(Player players : Bukkit.getOnlinePlayers()){
                    PlayerConnection connection = ((CraftPlayer)players).getHandle().playerConnection;
                        connection.sendPacket(playerInfoPacket);
                        connection.sendPacket(namedEntityPacket);
                    }
                	
                }
            /*else if(args.length == 3) {
            	if(args[0].equalsIgnoreCase("ban")) {
            		Player target = Bukkit.getServer().getPlayer(args[1]);
            		if(target.isOnline()) {
            			target.getInventory().clear();
            			main.rank.addPermission(target, "banned.player");
            			target.kickPlayer("§cVous avez été bannie.");
            		}
            		else {
            			player.sendMessage(ChatColor.RED + "{Target} N'est pas connectez..");
            		}
            	}
            }
                else {
                    player.sendMessage(ChatColor.RED + "Im sorry, I cant find the requested");
                }*/
            }
        }
        return true;
	}
	
	
	


}
