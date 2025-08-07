abstract class MotorBike {
        abstract void brake();
}

class SportsBike extends MotorBike {
        public void brake() {
                    System.out.println("SportsBike Brake");
        }
}

class MountainBike extends MotorBike {
        public void brake() {
                    System.out.println("MountainBike Brake");
        }
}

public class DemoAbs {
   public static void main(String[] args) {
       MotorBike bike1 = new SportsBike();
   bike1.brake();
          MotorBike bike2 = new MountainBike();
      bike2.brake();
    }
 }
    l