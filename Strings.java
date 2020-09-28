import java.util.*;
import java.lang.Math;

public class Strings {

    public static String trimAndConcat(String str1, String str2) {
        return str1.trim() + str2.trim();
    }

    public static Character getIndexOrNull(String str, int index) {
        if(str.length() > index) {
            return str.charAt(index);
        } else {
            return null;
        }
    }

    public static Double getAverage(int[] arr) {
        Double total = 0.0;
        for(int i=0; i<arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }

    public static ArrayList<Integer> squareArray(ArrayList<Integer> arr) {
        for(int i=0; i<arr.size(); i++) {
            Double square = Math.pow(arr.get(i), 2);
            arr.set(i, square.intValue());
        }
        return arr;
    }

    public static ArrayList<Integer> getRandomArray() {
        ArrayList<Integer> randomArr = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i=0; i<10; i++) {
            randomArr.add( rand.nextInt(46) + 55 );
        }
        return randomArr;
    }

    public static void main(String[] args) {
        // System.out.println( trimAndConcat(" hello   ", "     world  ") );
        // System.out.println( getIndexOrNull("hello", 4) );
        // System.out.println( getIndexOrNull("hello", 5) );
        // new String("hello").charAt(5); // this will throw an error
        // System.out.println( getAverage( new int[] {5, 6, 7, 8} ));
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(-2);
        x.add(3);
        x.add(9);
        // System.out.println(squareArray(x));
        // System.out.println( getRandomArray() );
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("color", "red");
        dictionary.put("number", "8");
        dictionary.put("name", "example mc exampleface");
        dictionary.put("name", "testy mc testerson");
        System.out.println(dictionary);
        System.out.println(dictionary.get("color"));
        for (Map.Entry kvpair : dictionary.entrySet()) {
            System.out.println(kvpair.getKey());
            System.out.println(kvpair.getValue());
        }
    } 

}