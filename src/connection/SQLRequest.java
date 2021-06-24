package com.company.connection;

import com.company.User;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Manuel Avila Rodriguez
 */
public class SQLRequest extends LoadDriver {
    public SQLRequest() throws SQLException {
    }

    public boolean registerUser(User user) throws SQLException {
        PreparedStatement preparedStatement = null;
        Connection connection = getConnection();
        String request = "INSERT INTO users (user_name, user_email, user_password) VALUES (?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(request);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred: \n" + ex + "\n" + ex.getMessage());
            return false;
        }
    }

    public boolean validateUser(User user, String password) throws SQLException {
        PreparedStatement preparedStatement = null;
        Connection connection = getConnection();
        String request = "SELECT * FROM users WHERE name='" + user + "' and password='" + password + "' VALUES(?,?)";
        try {
            preparedStatement = connection.prepareStatement(request);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred: \n" + ex + "\n" + ex.getMessage());
            return false;
        }
    }
}
