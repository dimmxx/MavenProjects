package controller;

import java.sql.SQLException;
import model.User;

public class Main {

    public static void main(String[] args) throws SQLException {


        //User user = new User("linda", "123", "linda@yahoo.com", 45, "f", "Paris, France", "comment", true);
        PostgresSQLDAO db = new PostgresSQLDAO();

        //db.createTable();
        //db.dropTable("users");

        //user = db.authUser(user);

        //db.selectAll();
        //db.tablesInfo();

        //System.out.println(user.getRole());


           // db.addUser(user);

        //System.out.println(user.getMessageSb());


        db.close();




    }





}
