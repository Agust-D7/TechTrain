class Bank{
        int getRoi(){return 0;}
}
class SBI extends Bank{
        int getRoi(){return 8;}
}
class ICICI extends Bank{
        int getRoi(){return 7;}
}
class AXIS extends Bank{
        int getRoi(){return 9;}
}
public class BankExample{
        public static void main (String[] args){
        Bank sbibank= new SBI();
        Bank icicibank= new ICICI();
        Bank axisbank= new AXIS();
        System.out.println("sbi rate of interest:"+sbibank.getRoi());
        System.out.println("icici rate of interest:"+icicibank.getRoi());
        System.out.println("axis rate of interest:"+axisbank.getRoi());
        }
}
        