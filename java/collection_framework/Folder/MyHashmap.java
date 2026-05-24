// put()	Adds or updates a key-value pair
// get()	Returns the value for a given key
// remove()	Removes the key and its value
// containsKey()	Checks if the map contains the key
// keySet()	Returns a set of all keys
import java.util.HashMap;
public class MyHashmap {
   public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate
    capitalCities.put("USA", "Washington DC");
    //get method
        System.out.println(capitalCities.get("England"));
        //remove method
         capitalCities.remove("England");
           System.out.println(capitalCities);
         //clear method
     //capitalCities.clear();
     //loop
      for (String i : capitalCities.keySet()) {
      System.out.println(i);
    }

    // System.out.println(capitalCities);
  }
}

// algorithms
// The Collections class contains many more algorithms, such as:

// Collections.max() - find the largest element
// Collections.min() - find the smallest element
// Collections.shuffle() - randomly shuffle elements
// Collections.frequency() - count how many times an element appears
// Collections.swap() - swap two elements in a list
