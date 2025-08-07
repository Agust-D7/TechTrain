package train;
public class addition{
    void sum(int a, int b)
    {System.out.println(a+b);}
    void sum(double a, double b){
        System.out.print(a+b);
    }
    void sum(int a, int b, int c)
    {
        System.out.println(a+b+c)
    }
    public static void main [String args[]]{
        addition add = new addition();
        add.sum(10,20);
        add.sum(12.5,14.9);
    }
}