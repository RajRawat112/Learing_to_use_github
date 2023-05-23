public class human{     // Here human is a class.

    String name;          // Here name, age and, weight is data variable.
    int age;
    double weight;
    human(String name, int age, double weight){   // Method
        this.name = name;            // constructor
        this.age = age;
        this.weight = weight;}

    void drink() {   // Method
    System.out.println(this.name + " had drinked 1lt water");
    }

    void eat(){  // Method
        System.out.println(this.name+ " had already ate his meal");
    }
}                       