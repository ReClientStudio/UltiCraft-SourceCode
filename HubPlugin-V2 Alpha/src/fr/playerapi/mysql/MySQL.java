package fr.playerapi.mysql;

import org.bukkit.Bukkit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

    private Connection conn;

    public void connect(String host, String database, int port, String user, String password){
        if(!isConnected()){
            try {
                conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, user, password);
                System.out.println("Connected on MySql : true");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Connected on MySql : false");
            }
        }
    }

    public void disconnect(){

        if(isConnected()){
            try {
                conn.close();
                System.out.println("disconnected on MySql : true");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("disconnected on MySql : false");
            }
        }

    }

    public boolean isConnected(){
        try {
            if((conn == null) || (conn.isClosed()) || (conn.isValid(5))){
                return false;
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Connection getConnection() {
        return conn;
    }
}
