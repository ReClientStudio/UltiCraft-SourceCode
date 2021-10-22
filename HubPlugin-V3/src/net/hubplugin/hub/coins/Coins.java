package net.hubplugin.hub.coins;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

import net.hubplugin.hub.Main;
import net.hubplugin.hub.mysql.MySQL;
import net.hubplugin.hub.rank.RankUnit;

public class Coins {
	
	private Main main;
	
	public Coins(Main main) {
		this.main = main;
	}

	

	public void createAccount(Player p, long coins) {
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("SELECT `coins` FROM `coins` WHERE `player_uuid`='" + p.getUniqueId().toString() + "'");
			ResultSet rs = sts.executeQuery();
			if(!rs.next()) {
				sts.close();
				sts = main.mysql.getConnection().prepareStatement("INSERT INTO `coins` (player_uuid, coins) VALUES ('" + p.getUniqueId().toString() + "', '" + coins + "')");
				sts.executeUpdate();
				sts.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public long getCoins(Player p) {
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("SELECT `coins` FROM `coins` WHERE `player_uuid`='" + p.getUniqueId().toString() + "'");
			ResultSet rs = sts.executeQuery();
			if(rs.next()) {
				return rs.getLong("coins");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return 0;
	}
	
	
	public void addCoins(Player p, long coins) {
		if(coins < 1 ) {
			return;
		}
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("SELECT `coins` FROM `coins` WHERE `player_uuid`='" + p.getUniqueId().toString() + "'");
			ResultSet rs = sts.executeQuery();
			if(rs.next()) {
				sts.close();
				sts = main.mysql.getConnection().prepareStatement("UPDATE `coins` SET `coins`='" + (coins + getCoins(p)) +"'  WHERE `player_uuid`='" + p.getUniqueId().toString() +"'");
				sts.executeUpdate();
				sts.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removeCoins(Player p, long coins) {
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("SELECT `coins` FROM `coins` WHERE `player_uuid`='" + p.getUniqueId().toString() + "'");
			ResultSet rs = sts.executeQuery();
			if(rs.next()) {
				sts.close();
				if((getCoins(p) - coins) < 0) {
					return;
				}
				sts = main.mysql.getConnection().prepareStatement("UPDATE `coins` SET `coins`='" + (getCoins(p) - coins) +"'  WHERE `player_uuid`='" + p.getUniqueId().toString() +"'");
				sts.executeUpdate();
				sts.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
