package generics;
public class Main {
    public static void main(String[] args) {
        Genericspractice <String>g=new Genericspractice<>();
        g.setValue("abs");
        String ans=g.getvalue();
        System.out.println(ans);
        Genericspractice <Integer>i=new Genericspractice<>();
        i.setValue(18);
        int ans2=i.getvalue();
        System.out.println(ans2);
        Container <String>c=new interfaceContainer<>();
        c.add("harsh");  //interface called using generics
        System.out.println(c.get());
        practice mynumber =new practice(12);
        Boxx<practice>b=new Boxx<>(mynumber);
        b.display();
        // methods generics 
        Methodspractice m=new Methodspractice();
        Integer arr[]={1,2,3,4,5};
        m.printarray(arr);

        
    }
}
