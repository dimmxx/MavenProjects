package controller;

import java.sql.*;
import model.User;

public class PostgresSQLDAO {

    //Queries
    private static final String CREATE_TABLE_POSTGESQL = "CREATE TABLE users (id serial PRIMARY KEY, username VARCHAR (50) UNIQUE NOT NULL, password VARCHAR (50) NOT NULL, email VARCHAR (50) UNIQUE, age VARCHAR (3), gender VARCHAR (1), address VARCHAR(50), comment VARCHAR (100), agree VARCHAR (1), role VARCHAR (10), created_on TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, last_login TIMESTAMP)";
    
    private final static String ADD_USER = "INSERT INTO users (username, password, email, age, gender, address, comment, agree, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final static String GET_USER = "SELECT username, password, email, role FROM users WHERE username= ? AND password= ?";
    private final static String CHECK_USER = "SELECT username FROM users WHERE username= ?";


    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://amazonpostgressql.c1mepymbmqks.us-east-2.rds.amazonaws.com:5432/testdb";

    private static final String USER = "master";
    private static final String PASS = "Qwerty77";

    Statement st = null;
    Connection conn = null;

    public PostgresSQLDAO() {

        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName(JDBC_DRIVER).newInstance();
        } catch (Exception ex) {
            // handle the error
        }
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        System.out.println("Connection OK...");

        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
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
            prs.setString(4, user.getAge());
            prs.setString(5, user.getGender());
            prs.setString(6, user.getAddress());
            prs.setString(7, user.getComment());
            prs.setString(8, user.getAgree());
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

    public User authUser(User user) {
        User userDB = new User();
        try {
            PreparedStatement prs = conn.prepareStatement(GET_USER);
            prs.setString(1, user.getUsername());
            prs.setString(2, user.getPassword());
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                userDB.setUsername(rs.getString(1));
                userDB.setPassword(rs.getString(2));
                userDB.setEmail(rs.getString(3));
                userDB.setRole(rs.getString(4));
            }
            prs.close();
            return userDB;
        } catch (SQLException e) {
            e.printStackTrace();
            return userDB;
        }
    }


}
