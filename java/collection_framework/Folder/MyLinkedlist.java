// Import the LinkedList class
// addFirst()	Adds an element to the beginning of the list	
// addLast()	Add an element to the end of the list	
// removeFirst()	Remove an element from the beginning of the list	
// removeLast()	Remove an element from the end of the list	
// getFirst()	Get the element at the beginning of the list	
// getLast()	Get the element at the end of the list	

import java.util.LinkedList;

public class MyLinkedlist {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.addFirst("mustang");
    cars.addLast("honda");
    cars.removeFirst();
    cars.removeLast();
    cars.getFirst();
    cars.getLast();
    System.out.println(cars);
  }
}