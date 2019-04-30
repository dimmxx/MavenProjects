package controller;

import model.User;

import java.sql.*;

public class UserController {

    User user;
    DbWorker db;

    private static final String CREATE_TABLE_POSTGESQL = "CREATE TABLE users_store (id serial PRIMARY KEY, username VARCHAR (50) UNIQUE NOT NULL, password VARCHAR (50) NOT NULL, email VARCHAR (50) UNIQUE, age INTEGER, gender VARCHAR (1), address VARCHAR(50), comment VARCHAR (100), agree INTEGER, role VARCHAR (10), created_on TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, last_login TIMESTAMP)";
    private final static String ADD_USER = "INSERT INTO users (username, password, email, age, gender, address, comment, agree, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final static String GET_USER = "SELECT username, password, email, role FROM users_store WHERE username= ? AND password= ?";
    private final static String CHECK_USER = "SELECT username FROM users WHERE username= ?";

    public UserController(User user) {
        this.user = user;
    }

    public UserController(DbWorker db) {
        this.db = db;
    }




    


    public User getUser() {
        return user;
    }

    public User authUser(User user) {
        Statement st = db.getStatement();
        Connection conn = db.getConnection();
        User userTemp = new User();
        try {
            PreparedStatement prs = conn.prepareStatement(GET_USER);
            prs.setString(1, user.getUsername());
            prs.setString(2, user.getPassword());
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                userTemp.setUsername(rs.getString(1));
                userTemp.setPassword(rs.getString(2));
                userTemp.setEmail(rs.getString(3));
                userTemp.setRole(rs.getString(4));
            }
            prs.close();
            db.closeConnection();
            return userTemp;
        } catch (SQLException e) {
            e.printStackTrace();
            return userTemp;
        }
    }












}
