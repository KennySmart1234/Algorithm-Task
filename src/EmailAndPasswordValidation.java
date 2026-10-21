public class EmailAndPasswordValidation {

    public static boolean validateEmail(String email){
        if(email.isEmpty() || email.isBlank()){
            return false;
        }

       String userEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

       return email.matches(userEmail);
    }

    public static boolean validatePassword(String password){
        if(password.isEmpty() || password.isBlank()){
            return false;
        }

        String userPassword = "^(?=.*\\d)(?=.*[@#$%^&+])\\S{8,16}$";
        return password.matches(userPassword);
    }

}
