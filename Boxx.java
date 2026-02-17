package generics;

public class Boxx <T extends Number & param> {
    // bounded parameter
    
    private T item;
    public Boxx(T item){
        this.item=item;
    }
    public void display(){
        item.print();
    }
    public T getitem(){
        return item;
    }
    
}
