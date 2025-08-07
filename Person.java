class Person {

        void teach() {
                    System.out.println("I can teach");
        }
}

class Teacher extends Person {

        void teach() {
                    System.out.println("I teaches English");
        }

            public static void main(String[] args) {

                        Person person = new Teacher(); // Upcasting
                                person.teach(); // Output: I teaches English

                                        Person person2 = new Person();
                                                person2.teach(); // Output: I can teach

                                                        Teacher teacher = new Teacher();
                                                                teacher.teach(); // Output: I teaches English
            }
}
        