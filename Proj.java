class Proj{
    public static void main(String args[]){
                Project p= new Project();
                        p.deets();
                            }
                            }
                            interface StudCS{
                                void deets();
                                }
                                interface StudIS{
                                    void deets();
                                    }
                                    interface StudAI{
                                        void deets();
                                        }
                                        class Project implements StudCS,StudIS,StudAI{
                                           public void deets()
                                               {
                                                       System.out.println("Cs,IS,AI Proj executed");
                                                           }
                                                           }