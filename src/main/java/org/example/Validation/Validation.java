package org.example.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public boolean isValidCoupon(String coupon){
        String regex="save[0-9]{2}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(coupon);
        return matcher.matches();
    }
    public boolean isvalidname(String name){
        String nameregex="^[A-Za-z0-9]+$";
        Pattern p=Pattern.compile(nameregex);
        Matcher m=p.matcher(name);
        return m.matches();
    }
    public boolean isvalidemail(String email){
        String nameregex="^[a-zA-Z0-9./_-]+[@]{1}[a-zA-Z]+[.]{1}[a-zA-Z]+$";
        Pattern p=Pattern.compile(nameregex);
        Matcher m=p.matcher(email);
        return m.matches();
    }
    public boolean isvalidid(String ID){
        String Idregex="^[A-Za-z]{1}[0-9]+$";
        Pattern p=Pattern.compile(Idregex);
        Matcher m=p.matcher(ID);
        return m.matches();
    }
}