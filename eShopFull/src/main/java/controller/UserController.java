package controller;

import model.User;

import java.sql.*;

public class UserController {

    DbWorker db;
    Statement st;
    Connection conn;

    private static final String CREATE_TABLE_POSTGESQL = "CREATE TABLE users_store (id serial PRIMARY KEY, username VARCHAR (50) UNIQUE NOT NULL, password VARCHAR (50) NOT NULL, email VARCHAR (50) UNIQUE, age INTEGER , gender VARCHAR (1), address VARCHAR(50), comment VARCHAR (100), agree INTEGER , role VARCHAR (10), created_on TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, last_login TIMESTAMP)";
    private final static String ADD_USER = "INSERT INTO users_store (username, password, email, age, gender, address, comment, agree, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final static String GET_USER = "SELECT username, password, email, role FROM users_store WHERE username= ? AND password= ?";
    private final static String CHECK_USER = "SELECT username FROM users WHERE username= ?";

    public UserController(DbWorker db) {
        this.db = db;
        st = db.getStatement();
        conn = db.getConnection();
    }

    public User authUser(User user) {
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
            st.close();
            return userTemp;
        } catch (SQLException e) {
            e.printStackTrace();
            return userTemp;
        }
    }









    public void createTable() {
        try {
            st.executeUpdate(CREATE_TABLE_POSTGESQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropTable(String name) {
        String DROP_TABLE = "DROP TABLE " + name;
        try {
            st.executeUpdate(DROP_TABLE);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectAll() {

        String sql2 = "SELECT * FROM users";
        try {
            ResultSet rs = st.executeQuery(sql2);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " | " + rs.getString(5) + " | ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User addUser(User user) {
        try {
            PreparedStatement prs = conn.prepareStatement(ADD_USER);
            prs.setString(1, user.getUsername());
            prs.setString(2, user.getPassword());
            prs.setString(3, user.getEmail());
            prs.setInt(4, user.getAge());
            prs.setString(5, user.getGender());
            prs.setString(6, user.getAddress());
            prs.setString(7, user.getComment());
            prs.setInt(8, user.getAgree());
            prs.setString(9, user.getRole());
            prs.execute();
            prs.close();
            user.setMessageSb("Registration succeded. Login with your username and password\n");
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            user.setMessageSb("Registration failed:\n");
            user.setMessageSb("<li>" + e.toString() + "</li>");
            return user;
        }
    }


}



    
