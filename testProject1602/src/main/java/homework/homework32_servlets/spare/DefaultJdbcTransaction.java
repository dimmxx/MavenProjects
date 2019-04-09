package homework.homework32_servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DefaultJdbcTransaction {

    Connection connection = null;
    Statement st = null;


public DefaultJdbcTransaction(String driverClassName, String url, String user, String password) throws SQLException {
        super();
        // TODO Auto-generated constructor stub
        try {
            Class.forName(driverClassName).newInstance();

            if (user == null && password == null) {
                connection = DriverManager.getConnection(url);

                st = connection.createStatement();
            st.setQueryTimeout(30);

            } else {
                connection = DriverManager.getConnection(url, user, password);
            }
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            throw new SQLException(e);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            throw new SQLException(e);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            throw new SQLException(e);
        }
    }


    public void createTable() {
        try {
            st.executeUpdate("CREATE TABLE rooters (id INTEGER PRIMARY KEY AUTOINCREMENT, login VARCHAR UNIQUE, pass VARCHAR, role VARCHAR)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
