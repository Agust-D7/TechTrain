abstract class Loan{
    void roi(){
    System.out.println("carloan 10%");
}
}
class SBI extends Loan{
    void roi() {       // scenario 3: connent theee two lines 
    System.out.println("car loan 10%"); // scenario 4: just write void roi() with empty braces
}
}
class Main{
public static void main(String args[]){
                     Loan obj= new Loan();       // scenario 2: Loan obj=new SBI();                    
}
}
/* scenario 5
class Main{
        public static void main(String args[]){
                Loan obj= new SBI();
                    }
                    }
                    abstract class Loan{
                        void roi();
                        }
                        class SBI extends Loan
                        {
                            void roi() { System.out.println("Car loan 9%");}
                                
                                }*/
/* class Main{
    public static void main(String args[]){
            Loan obj= new SBI();
                }
                }
                 class Loan{
                    abstract  void roi();
                    }
                    class SBI extends Loan
                    {
                        void roi() { System.out.println("Car loan 9%");}
                            
                            }
                            */
/* class Main{
    public static void main(String args[]){
            Loan obj= new SBI();
                }
                }
                 class Loan{
                    void roi(){}
                    }
                    class SBI extends Loan
                    {
                        
                            
                            }
                            */

