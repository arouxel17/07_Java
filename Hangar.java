public class Hangar {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", 236548, "C-Max");
        Boat boat1 = new Boat("Hobbie", 1000, "Hobbie Cat 16");
        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
    }
}