import java.util.*;

interface Vehicle {
    void vehicleType();
}
interface Books {
    void bookType();
}
class MobileBookShopping implements Vehicle, Books {
    public void vehicleType() {
        System.out.println("The vehicle is car.");
    }
    public void bookType() {
        System.out.println("These are all Computer Science and Engineering books.");
    }
}
public class p4 {
    public static void main(String args[]) {
        MobileBookShopping m = new MobileBookShopping();
        m.vehicleType();
        m.bookType();
    }
}
