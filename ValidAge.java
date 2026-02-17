package exceptionhandling;
 class InvalidAgeException extends Exception{//custom exception class 
    public InvalidAgeException(String s){
        super(s);
    }
}
public class ValidAge {
    public static void age(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Valid age is:"+age);
    }
    public static void main(String[] args) {
        try{
            age(15);
        }
        catch(InvalidAgeException e){
            System.out.println("caught exception is "+e.getMessage());
        }
    }
}
