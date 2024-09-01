public class Main {
    public static void main(String[] args) {


        final Bicycle bicycle = new Bicycle("bicycle", 2);
        final Bicycle bicycle2 = new Bicycle("bicycle2", 1);

        final Car car = new Car("car1", 4);
        final Car car2 = new Car("car2", 1);

        final Truck truck = new Truck("track1", 8);
        final Truck truck2 = new Truck("track2", 6);



       final  WheeledTransport[] wheeledTransports  = {bicycle, bicycle2, car, car2, truck2, truck};
        for (WheeledTransport wheeledTransport : wheeledTransports) wheeledTransport.check();

    }
}