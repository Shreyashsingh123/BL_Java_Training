package generics;

public class enumOperation {
    public static void main(String[] args) {
        // enumOperation e=new enumOperation();
        // e.solve(20)
       System.out.println(Operation.Add.solve(20,30));
       System.out.println(Operation.Multiply.solve(20,30));
    }
}
enum Operation{
    Add,Multiply,Divide,Subtract;

    public <T extends Number> double solve(T a,T b){
        switch (this) {
            case Add:
                return a.doubleValue()+b.doubleValue();
                case Multiply:
                return a.doubleValue()*b.doubleValue();
                case Divide:
                return a.doubleValue()/b.doubleValue();
                case Subtract:
                return a.doubleValue()-b.doubleValue();
               default:
                throw new AssertionError("Unknown operation"+this);
            }
    }
}