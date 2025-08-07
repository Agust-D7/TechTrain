class A
{
        void add()
            {
                        System.out.println("addinng A value");
            }
}
class B extends A
{
        void add()
            {
                        System.out.println("addinng B value");
            }
}
class C
{
       public static void main(String arg[])
           {
                    A obj = new B();
                            obj.add();
           }
}
           