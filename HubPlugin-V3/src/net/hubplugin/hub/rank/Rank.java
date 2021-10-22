package net.hubplugin.hub.rank;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

import net.hubplugin.hub.Main;

public class Rank {

	private Main main;
	
	public Rank(Main main) {
		this.main = main;
	}

	
	
	public void createAccount(Player p) {
		
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("SELECT `grade` FROM `rank` WHERE `player_uuid`='" + p.getUniqueId().toString() + "'");
			ResultSet rs = sts.executeQuery();
			if(!rs.next()) {
				sts.close();
				sts = main.mysql.getConnection().prepareStatement("INSERT INTO `rank` (player_uuid, grade) VALUES ('"+ p.getUniqueId().toString() + "', '0')");
				sts.executeUpdate();
				sts.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public RankUnit getRank(Player p) {
		RankUnit rank = null;
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("SELECT `grade` FROM `rank` WHERE `player_uuid`= '" + p.getUniqueId().toString() + "' ");
			ResultSet rs = sts.executeQuery();
			if(rs.next()) {
				rank = RankUnit.getFromPower(rs.getInt("grade"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rank;
	}
	
	public void setRank(Player p, RankUnit rank) {
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("UPDATE `rank` SET `grade`= '" + rank.getPower() + "' WHERE `player_uuid`='" + p.getUniqueId().toString() +"'");
			sts.executeUpdate();
			sts.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean hasPermission(Player p, String permission) {
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("SELECT `permission` FROM `permissions` WHERE `player_uuid`= '" + p.getUniqueId().toString() + "' and `permission`='" + permission + "'");
			ResultSet rs = sts.executeQuery();
			if(rs.next()) {
				if(permission.equals(rs.getString("permission"))) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void addPermission(Player p, String permission) {
		if(hasPermission(p, permission)) {
			return;
		}
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("INSERT INTO `permissions` (player_uuid, permission) VALUES ('" + p.getUniqueId().toString() + "', '" + permission + "')");
			sts.executeUpdate();
			sts.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removePermission(Player p, String permission) {
		if(!hasPermission(p, permission)) {
			return;
		}
		try {
			PreparedStatement sts = main.mysql.getConnection().prepareStatement("DELETE FROM `permissions` WHERE `player_uuid`='" + p.getUniqueId().toString() +"' and  `permission`='" + permission + "'");
			sts.executeUpdate();
			sts.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
