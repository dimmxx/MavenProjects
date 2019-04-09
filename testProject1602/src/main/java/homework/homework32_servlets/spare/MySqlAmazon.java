package homework.homework32_servlets;

import java.sql.*;

public class MySqlAmazon {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    private final static String ADD_USER = "INSERT INTO secure (login, pass, role) VALUES (?, ?, ?)";
    private final static String GET_USER = "SELECT role FROM secure WHERE login= ? AND pass= ?";


    String RDS_HOSTNAME = "bdaws.c1mepymbmqks.us-east-2.rds.amazonaws.com";
    String RDS_DB_NAME = "bdata";
    String RDS_USERNAME = "master";
    String RDS_PASSWORD = "Qwerty77";
    String RDS_PORT = "3306";

    Statement st = null;
    Connection conn = null;

    public MySqlAmazon() {

        System.out.println("Starting");

            try {
                Class.forName(JDBC_DRIVER);
                String dbName = RDS_DB_NAME;
                String userName = RDS_USERNAME;
                String password = RDS_PASSWORD;
                String hostname = RDS_HOSTNAME;
                String port = RDS_PORT;
                String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
                Connection conn = DriverManager.getConnection(jdbcUrl);
                System.out.println(conn);
            } catch (Exception e) {

            }

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

        public void tablesInfo () {

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
        public void selectAll () {

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

        public void createTable () {
            try {
                st.executeUpdate("CREATE TABLE users222 (id INT(3) PRIMARY KEY AUTO_INCREMENT, login VARCHAR(10) UNIQUE, pass VARCHAR(10), role VARCHAR(10))");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        public void dropTable (String name){
            String DROP_TABLE = "DROP TABLE " + name;
            try {
                st.executeUpdate(DROP_TABLE);
            } catch (
                    SQLException e) {
                e.printStackTrace();
            }
        }

        public void close () {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public boolean addUser (User user){
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

        public String authUser (String login, String pass){
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
