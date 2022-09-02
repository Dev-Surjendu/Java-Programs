class Car {

    int speed, milage, gear = 0, maxGear = 6;
    String color = "Black";

    private Car() {
    }

    // Car(int maxGear, String color) {
    //     this.maxGear = maxGear;
    //     this.color = color;
    //     System.out.println("run this par one");
    // }

    // copying bmw's maxGear and color toh bmwNewModel
    // Car(Car obj) {
    //     maxGear = obj.maxGear;
    //     color = obj.color;
    // }

    void start() {
        System.out.println("Key Plugged, Car Start");
    }

    void gearUp() {
        if (gear < maxGear) {
            gear += 1;
            System.out.println("Gear Up ----->" + gear);
        } else {
            System.out.println("already in max Gear");
        }
    }

    // over loading
    void gearUp(int gearNumber) {
        if (gear < maxGear && gearNumber <= maxGear) {
            gear += gearNumber;
            System.out.println("Gear Up ----->" + gear);
        } else {
            System.out.println("already in max Gear");
        }
    }

    void gearDown() {
        if (gear > 0) {
            gear -= 1;
            System.out.println("Gear Down ----->" + gear);
        } else {
            System.out.println("alreday in lowest Gear");
        }
    }

    public static void main(String[] args) {
        Car bmw = new Car();

        // Car bmwNewModel = new Car(bmw);

        System.out.println(bmw.maxGear);
    }
}

class SuperCar {
    public static void main(String[] args) {
        // Car newCar = new Car(); // Can't create obj because it's private
    }
}