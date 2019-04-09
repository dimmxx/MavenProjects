package controller;

import java.sql.SQLException;
import model.User;

public class Main {

    public static void main(String[] args) throws SQLException {

        UserController userController = new UserController();
        User user = userController.getUser();
        PostgresSQLDAO db = new PostgresSQLDAO();

        //db.createTable();
        //db.dropTable("users");

        db.addUser(user);

        //db.selectAll();
        //db.tablesInfo();

        //System.out.println(db.authUser("dima", "123"));

        db.close();




    }





}
