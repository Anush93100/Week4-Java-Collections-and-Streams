package regex.basic_regex_problems.validate_a_username;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAUsername {

    public static boolean validatingUsername(String username){
        String regex="^[a-zA-Z]{1}[a-zA-Z0-9_]{4,14}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(username);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the user name: ");
        String username=input.next();
        boolean isValid=validatingUsername(username);

        if(isValid){
            System.out.println("Username : " + username + ", is valid.");
        }else{
            System.out.println("Username : " + username + ", is not valid.");
        }

        input.close();
    }
}
