package problems.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
    public static boolean isValidUserName(String userName){
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(userName);
        boolean flag=m.matches();
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(isValidUserName("AB1245"));
        System.out.println(isValidUserName("A12332"));
        System.out.println(isValidUserName("AB12383"));
    }
}
