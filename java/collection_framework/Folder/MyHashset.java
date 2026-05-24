import java.util.HashSet;

public class MyHashset {


  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    cars.add("Mazda");
    // for an element exisistence..
    System.err.println(cars.contains("BMD"));
    cars.remove("mazda");
    for(String i : cars)
    {
        System.out.println(i);
    }
    System.out.println(cars);
  }
}
    

