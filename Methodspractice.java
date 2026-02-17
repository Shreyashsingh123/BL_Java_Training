package generics;

public class Methodspractice {
    public <T> void printarray(T[] arr){
        for(T ele:arr){
            System.out.print(ele+" ");
        }
    }
}
