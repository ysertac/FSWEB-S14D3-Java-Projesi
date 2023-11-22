import com.workintech.cars.Car;
import com.workintech.cars.Ford;
import com.workintech.cars.Mitsubishi;
import com.workintech.r_d.CarSkeleton;
import com.workintech.r_d.ElectricityCar;
import com.workintech.r_d.GasPoweredCar;
import com.workintech.r_d.HybridCar;

public class Main {
    public static void main(String[] args) {
        Car car0 = new Car(2, "Ranger");
        Car car1 = new Mitsubishi(4, "Lancer");
        Car car2 = new Ford(4, "Ranger");
        System.out.println(car0);
        System.out.println(car2);
        System.out.println(car0.startEngine());
        System.out.println(car2.getStart());
        System.out.println(car0.getStart());
        System.out.println(car1.getStart());
        System.out.println("-------------------------------");
        CarSkeleton electrical_car = new ElectricityCar("Tesla", "Electrical Car", 100, 4);
        CarSkeleton hybrid_car = new GasPoweredCar("Test1", "test 1", 100, 2);
        CarSkeleton gas_car = new HybridCar("Test2", "test 2", 90, 100, 3);
        System.out.println(electrical_car.drive());
        System.out.println(hybrid_car.drive());
        System.out.println(gas_car.drive());
    }
}