class Father {
        void shoot() {
                    System.out.println("I am the father! I am a right-handed shooter! ");
        }
}

public class Child extends Father {
        void shoot() {
                    System.out.println("I am the son! I am a left-handed shooter!");
        }

            public static void main(String[] args) {
                        Father f = new Father();
                                f.shoot();

                                        Father fc = new Child();
                                                fc.shoot();
            }
}