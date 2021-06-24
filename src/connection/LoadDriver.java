package com.company.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Manuel Avila Rodriguez
 */
public class LoadDriver {
    private static Connection connection = null;
    private static final String DATABASE_NAME = "mydb";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "n#J4S#yWeMqXg%4_";

    public LoadDriver() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "n#J4S#yWeMqXg%4_");
            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Connection established successfully");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred: \n" + ex + "\n" + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() {
        connection = null;
        JOptionPane.showMessageDialog(null, "Connection finished");
    }
}
