package homework.homework32_servlets;

import java.sql.*;

public class MySqlDAO {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //private static final String DB_URL = "jdbc:mysql://s3.thehost.ua/itea2";

    //private static final String USER = "helen";
    //private static final String PASS = "123456";

    private static final String DB_URL = "jdbc:mysql://amazondb.c1mepymbmqks.us-east-2.rds.amazonaws.com:3306/data";
    private static final String USER = "master";
    private static final String PASS = "Qwerty77";

    private final static String ADD_USER = "INSERT INTO secure (login, pass, role) VALUES (?, ?, ?)";
    private final static String GET_USER = "SELECT role FROM secure WHERE login= ? AND pass= ?";

    Statement st = null;
    Connection conn = null;

    public MySqlDAO() {

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


//        String sql1 = "DESCRIBE mate";
//        try {
//            ResultSet rs = st.executeQuery(sql1);
//
//            while (rs.next()) {
//                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
//                        + " | " + rs.getString(4)+ " | " + rs.getString(5));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }

    public void tablesInfo() {

        String sql = "SHOW TABLES";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void selectAll() {

        String sql2 = "SELECT * FROM secure";
        try {
            ResultSet rs = st.executeQuery(sql2);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " | ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        try {
            st.executeUpdate("CREATE TABLE users22 (id INT(3) PRIMARY KEY AUTO_INCREMENT, login VARCHAR(10) UNIQUE, pass VARCHAR(10), role VARCHAR(10))");
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
        String role = null;
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




}
