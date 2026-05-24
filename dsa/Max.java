
class Main {

    int a = 10;
    int b = 20;

    Main(int a, int b) {
        this.a = a;
        this.b = b;

    }

    void maxi() {
        if (a > b) {
            System.out.println("The maximum number is: " + a);
        } else if (b > a) {
            System.out.println("The maximum number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

}

class Max {

    public static void main(String args[]) {

        Main m = new Main(10, 20);
        m.maxi();
    }
}
