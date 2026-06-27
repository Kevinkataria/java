class student
{
    int id;
    String name;
    float stipend;

    student(){}
    
    student (int id, String name){
        this.id= id;
        this.name= name;
     }

    student (int id, String name, float stipend){
        this.id= id;
        this.name= name;
        this.stipend= stipend;
     }  

     void display()
     {
        System.out.println("Id is: " + id);
        System.out.println("Name is: " + name);
        System.out.println("Stipend is: " + stipend);
     }
    }

    //student
class overloading1
    {
        public static void main(String[] args)
        {
            student s1= new student();
            s1.id= 101;
            s1.name= "Kevin";
            s1.stipend= 10000000.00f;
            s1.display();

            student s2= new student(102, "John");
            s2 .stipend= 10000000.00f;
            s2.display();  
            
            student s3= new student(103, "Smith");
            s3.stipend=10000000.00f;
            s3.display();}}