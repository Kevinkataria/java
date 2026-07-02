class Student {
    private String name;

public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}

public class GetSet {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Kevin");
        System.out.println("Name is: " + s1.getName());
    }
}