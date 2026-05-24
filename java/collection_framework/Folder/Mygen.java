public class Mygen {
    //T is a generic type parameter. It's like a placeholder for a data type.
  // Generic method: works with any type T
  public static <Y> void printArray(Y [] array) {
    for (Y item : array) {
      System.out.println(item);
    }
}

  public static void main(String[] args) {
    // Array of Strings
    String[] names = {"Satya", "Samantha"};

    // Array of Integers
    Integer[] numbers = {1, 4, 3};

    // Call the generic method with both arrays
    printArray(names);
    printArray(numbers);
  }
}

    

