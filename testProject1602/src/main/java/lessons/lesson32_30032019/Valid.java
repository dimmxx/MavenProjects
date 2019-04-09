package lessons.lesson32_30032019;

public class Valid {

    private String login;
    private String pass;

    public Valid(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public boolean valid(String login, String pass){

        if(login.equals("admin") && pass.equals("admin")){
            return false;
        } else return true;
    }





}
