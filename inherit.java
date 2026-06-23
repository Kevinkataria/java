class Parent
{
   int age,id;
   String name;
   void naming( String name)
   {
    System.out.println("Name is: " + name);
   }
}


class Child extends Parent
{
   void ageN(int age)
   {
    System.out.println("Age is: " + age);
    System.out.println("Id is: " + id);
   }
}

class inherit
{
   public static void main(String[] args)
   {
    Child c1= new Child();
    c1.age= 10;
    c1.id= 101;
    c1.name= "Kevin";
    c1.naming(c1.name);
    c1.ageN(c1.age);
   }
}
      