package Exception.Exc;

public class Login extends Exception {
    
    private String detail;

    public Login () {
        detail = "Incorrect login";
    }

    public Login (String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString () {
        return "Login: " + detail;
    }

}
