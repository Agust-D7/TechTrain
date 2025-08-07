class Main1{
    public static void main(String args[]){
    Franchise sub= new Subway();
    Franchise dom= new Dominoes();
    sub.rules();
    sub.payment();
    dom.rules();
    dom.payment();
}
}
abstract class Franchise {
    void rules(){
        System.out.println("maintain food quality");
        System.out.println("maintain hygiene");
}
abstract void payment ();
}
class Subway extends Franchise{
    void payment() {
        System.out.println("take cash payment");
        System.out.println("take card payment");
}  
}
class Dominoes extends Franchise {
    void payment (){
        System.out.println("take cash payment");
        System.out.println("take card payment");
        System.out.println("take app payment");
}
}