package homework.homework32_servlets;

import java.sql.*;

public class PostgresSQLDAO {

    //Queries
    private static final String CREATE_TABLE_POSTGESQL = "CREATE TABLE users (id serial PRIMARY KEY, username VARCHAR (50) UNIQUE NOT NULL, password VARCHAR (50) NOT NULL, email VARCHAR (50) UNIQUE NOT NULL, role VARCHAR (10), created_on TIMESTAMP NOT NULL, last_login TIMESTAMP)";
    private final static String ADD_USER = "INSERT INTO users (username, password, email, role) VALUES (?, ?, ?, ?)";
    private final static String GET_USER = "SELECT role FROM users WHERE username= ? AND password= ?";

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

    public boolean addUser(User user) {
        try {
            PreparedStatement prs = conn.prepareStatement(ADD_USER);
            prs.setString(1, user.getName());
            prs.setString(2, user.getPass());
            prs.setString(3, user.getEmail());
            prs.setString(4, user.getRole());
            prs.execute();
            prs.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String authUser(String username, String password) {
        String role = null;
        try {
            PreparedStatement prs = conn.prepareStatement(GET_USER);
            prs.setString(1, username);
            prs.setString(2, password);
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
}
