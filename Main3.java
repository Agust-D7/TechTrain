class Main3{
    public static void main(String args[]){
    Project p= new Project();
    p.deets();
}}
class StudCS{
    void deets(){
    System.out.println("CS Student");
}
}
class StudIS{
    void deets(){
    System.out.println("IS Student");
}
}
class StudAI{
    void deets(){
    System.out.println("AI Student");
}
}
class Project extends StudCS,StudIS,StudAI{}