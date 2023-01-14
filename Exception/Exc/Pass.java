package Exception.Exc;

public class Pass extends Exception {

    private String detail;

    public Pass() {
        detail = "Incorrect password";
    }

    public Pass(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}
