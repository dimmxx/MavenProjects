package homework.homework32_servlets;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        User user = new User ("olga", "qwerty", "peter@gmail.com", "guest");
        //MySqlDAO db = new MySqlDAO();
        PostgresSQLDAO db = new PostgresSQLDAO();

        //db.createTable();

        //db.dropTable("users");

        //db.addUser(user);

        //db.selectAll();
        //db.tablesInfo();

        System.out.println(db.authUser("dima", "123"));

        db.close();




    }





}
