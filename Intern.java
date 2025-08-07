public class Intern {
        final int SALARY = 10000;

            void change()
             {
        SALARY = 10500; //ERROR Final variable
        System.out.println("SALARY is " + SALARY);
      }

    public static void main(String args[])
    {
    Intern i = new Intern();
    System.out.println(i);
    i.change();
                }
}