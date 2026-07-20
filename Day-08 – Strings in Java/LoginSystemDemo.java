// Create:

// LoginSystemDemo.java

// Requirements:

// String storedPassword = "Java123";
// String enteredPassword = "Java123";

// If passwords match:

// Login Successful

// Otherwise:

// Wrong Password

// Use:

// if(storedPassword.equals(enteredPassword))

public class LoginSystemDemo {
    public static void main(String[] args) {
        String storedPassword = "Java123";
        String enteredPassword = "Java123";

        if(storedPassword.equals(enteredPassword)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Wrong Password");
        }
    }
}