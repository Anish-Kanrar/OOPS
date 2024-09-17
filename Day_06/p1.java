abstract class Animals {
    abstract void makeSound();
    abstract void kidName();
}
class Cats extends Animals {
    void makeSound() {
        System.out.println("Cats meow");
    }
    void kidName() {
        System.out.println("The cat's kid is known as a kitten");
    }
}
class Dogs extends Animals {
    void makeSound() {
        System.out.println("Dogs bark");
    }
    void kidName() {
        System.out.println("The dog's kid is called a puppy");
    }
}
public class p1 {
    public static void main(String args[]) {
        Cats c1 = new Cats(); c1.makeSound(); c1.kidName();
        System.out.println();
        Dogs d1 = new Dogs(); d1.makeSound(); d1.kidName();
    }
} 
