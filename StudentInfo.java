class Studentinfo
{
    public void infoStudent(int age, int phoneNo, int aadharCardNo)
        {
                System.out.println("age:"+age +"phoneno:"+phoneNo+" AadharCardNo:"+ aadharCardNo);
                    }
                        public void infoStudent(int age, String loc,int phoneNo)
                            {
                                    System.out.println("age:"+age+"Location:"+loc +"phoneno:"+phoneNo);
                                        }
                                            public static void main(String[] args)
                                                {
                                                        Studentinfo stu= new Studentinfo();
                                                                stu.infoStudent(20,88888888,837373773);
                                                                        stu.infoStudent(20,"ABC",88888888);
                                                                            }


                                                                            }