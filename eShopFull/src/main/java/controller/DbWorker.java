package controller;

import java.sql.*;

public class DbWorker {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://s3.thehost.com.ua/itea2";

    static final String USER = "helen";
    static final String PASS = "123456";

    private Connection conn;
    private Statement st;

    private final static String ADD_MATE = "INSERT INTO mate (name, age) VALUES";
    private final static String GET_MATE = "SELECT * FROM mate WHERE id = ";


    public DbWorker() {
        try {
            Class.forName(JDBC_DRIVER).newInstance();
        } catch (Exception ex) {
            System.out.println("Connection error...");
        }

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Statement getStatement(){
        return st;
    }














}