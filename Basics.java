import java.util.ArrayList;

public class Basics {

    public static void main(String[] args) {

        Integer x = 3;
        String y = "hello";
        Boolean z = true;
        Double w = 3.14;

        System.out.println(1.0 / 3);
        System.out.println(y.charAt(0) == 'h');
        System.out.println("Hello World!!!");

        // String[] snacks = new String[3];
        // snacks[0] = "chips";
        // snacks[1] = "almonds";
        // snacks[2] = "snickers";

        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("chips");
        snacks.add("almonds");
        snacks.add("snickers");
        snacks.add("pears");
        
        // System.out.println(String.join(", ", snacks));

        // for(int i=0; i<snacks.size(); i++) {
        //     System.out.println(snacks.get(i));
        // }

        // if(w > 4) {
        //     System.out.println("yes");
        // } else {
        //     System.out.println("no");
        // }

        // greeting("Maysamia");
        // greeting(5);
        greeting("Tyler", "Hatter");

    }

    public static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    public static void greeting(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    public static void greeting(Integer x) {
        for(int i=0; i<x; i++) {
            System.out.println("Greetings");
        }
    }

}