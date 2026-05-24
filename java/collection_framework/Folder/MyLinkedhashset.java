import java.util.LinkedHashSet;
class MyLinkedhashset{
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<String>();
        cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    cars.add("Mazda");
// it also has like contains(),add(),remove(),size(),clear() etc ..method to operate with data inside LinkedHashSet
    System.out.println(cars);
    }
}