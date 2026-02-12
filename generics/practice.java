package generics;

interface param {
    void print();
}

public class practice extends Number implements param {
    private final int value;
    public practice(int value){
        this.value=value;
    }
    @Override
    public void print(){
        System.out.println("value is "+value);
    }
    @Override
    public int intValue(){
        return value;
    }
    @Override
    public double doubleValue(){
        return value;
    }
    public float floatValue(){
        return value;
    }
    public long longValue(){
        return value;
    }

}
