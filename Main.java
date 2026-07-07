class hillstations{
    void loction(){
System.out.println("Location is:");
    }
    void famousFor(){
        System.out.println("Famous for:");
    }
}
class Manali extends hillstations{
    void loction(){
        System.out.println("Location is: Himachal Pradesh");
    }
    void famousFor(){
        System.out.println("Famous for: Solang Valley");
    }
}

class Shimla extends hillstations{
    void loction(){
        System.out.println("Location is: Himachal Pradesh");
    }
    void famousFor(){
        System.out.println("Famous for: Mall Road");
    }
}
class Mussoorie extends hillstations{
    void loction(){
        System.out.println("Location is: Uttarakhand");
    }
    void famousFor(){
        System.out.println("Famous for: Kempty Falls");
    }
}
class uttarakhand extends hillstations{
    void loction(){
        System.out.println("Location is: Uttarakhand");
    }
    void famousFor(){
        System.out.println("Famous for: Nainital Lake");
    }
} 
public class Main {
    public static void main(String[] args) {
        Manali manali = new Manali();
        Shimla shimla = new Shimla();
        Mussoorie mussoorie = new Mussoorie();
        uttarakhand u = new uttarakhand();

        manali.loction();
        manali.famousFor();

        shimla.loction();
        shimla.famousFor();

        mussoorie.loction();
        mussoorie.famousFor();

        u.loction();
        u.famousFor();
    } }