package main.java.password;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){
        if(s.length() < 8){
            return PasswordStrength.NORMAL;
        }
        return PasswordStrength.STRONG;
    }
}
