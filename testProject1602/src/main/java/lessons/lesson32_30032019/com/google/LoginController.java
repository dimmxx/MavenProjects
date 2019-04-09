package lessons.lesson32_30032019.com.google;

public class LoginController {

    public String authorize(String login, String password) {

        if (login != null) {
            if (login.equals("admin") && password.equals("123")) {
                return "Access granted";

            } else {
                return "Access denied";
            }


        }

        return  "Parameters error";

    }


}
