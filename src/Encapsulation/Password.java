
//Implement a class to securely store and validate passwords

package Encapsulation;

class PasswordProtector {
    private String password;

    public void setPassword(String password) {
        if (password.length() >= 6)
            this.password = password;
        else
            System.out.println("Password too short!");
    }

    public boolean verifyPassword(String input) {
        return password.equals(input);
    }
}

public class Password {
    public static void main(String[] args) {
        PasswordProtector p = new PasswordProtector();
        p.setPassword("secure123");

        System.out.println("Verification: " + p.verifyPassword("secure123"));
    }
}
