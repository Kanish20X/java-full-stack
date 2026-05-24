// add()	Adds an element to the end of the list
// get()	Returns the element at the specified position
// set()	Replaces the element at the specified position
// remove()	Removes the element at the specified position
// size()	Returns the number of elements in the list 
import java.util.ArrayList;
import java.util.Collections;

public class Mylist {
  public static void main(String[] args) {
    //ArrayList<String> cars = new ArrayList<String>();
    var cars = new ArrayList<String>(); //var used instead writing the ArrayList multiple tym
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    // adding value to the array list by index 
    cars.add(0,"mustang");
    cars.set(0,"Volvo");
    cars.get(0);
    //collection paqckage has sort method in built..
    Collections.sort(cars);
    System.out.println(cars);
  }
}