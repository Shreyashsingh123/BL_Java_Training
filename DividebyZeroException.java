package exceptionhandling;
class dividebyzero extends RuntimeException{
    public dividebyzero(String s){
        super(s);
    }
}
public class DividebyZeroException{

    public static void fun(int a,int b){
        if(b==0){
            throw new dividebyzero("Divivde by zero exception");
        }
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            fun(a,b);
        }
        catch (dividebyzero e){
            System.out.println("Caught exception is"+e.getMessage());
        }
    }
}
