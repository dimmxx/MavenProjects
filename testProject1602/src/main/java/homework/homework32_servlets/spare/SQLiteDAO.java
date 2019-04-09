package homework.homework32_servlets;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

public class SQLiteDAO {

    private final static String ADD_USER = "INSERT INTO users (login, pass, role) VALUES (?, ?, ?)";
    private final static String GET_USER = "SELECT role FROM users WHERE login= ? AND pass= ?";

    private Connection conn = null;
    private Statement st = null;
    boolean isConnected = false;


    public SQLiteDAO() {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // create a database connection
            conn = DriverManager.getConnection("jdbc:sqlite:users_sqlite.db");
            st = conn.createStatement();
            st.setQueryTimeout(30);  // set timeout to 30 sec.
            System.out.println("Connection OK");
            isConnected = true;

        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
            isConnected = false;
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

    public void createTable() {
        try {
            st.executeUpdate("CREATE TABLE rooters (id INTEGER PRIMARY KEY AUTOINCREMENT, login VARCHAR UNIQUE, pass VARCHAR, role VARCHAR)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean addUser(User user) {
        try {
            PreparedStatement prs = conn.prepareStatement(ADD_USER);
            prs.setString(1, user.getName());
            prs.setString(2, user.getPass());
            prs.setString(3, user.getRole());
            prs.execute();
            prs.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String authUser(String login, String pass) {
        String role = "error";
        try {
            PreparedStatement prs = conn.prepareStatement(GET_USER);
            prs.setString(1, login);
            prs.setString(2, pass);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                role = rs.getString(1);
            }
            prs.close();
            return role;
        } catch (SQLException e) {
            e.printStackTrace();
            return role;
        }
    }

    public boolean isConnected() {
        return isConnected;
    }









}