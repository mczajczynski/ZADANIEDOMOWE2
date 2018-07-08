class Cars {
    public static void main(String[] args) {
        Car car1 = new Car ("BMW", "M5",2007,2.6);
        Car car2 = new Car ("Ferrari", "Italia",2014,4.5);

//car1.brand = "BMW";
//car1.model = "M5";
//car1.year = 2007;
//car1.capacity = 2.6;
//
//car2.brand = "Ferrari";
//car2.model = "Italia";
//car2.year = 2014;
//car2.capacity = 4.5;

        System.out.println("Samochod 1:");
        System.out.println("Marka: " + car1.brand + ", " + "Model: " + car1.model + ", Rocznik: "  + car1.year + ", Pojemnosc: " + car1.capacity );
        System.out.println("Samochod 2:");
        System.out.println("Marka: " + car2.brand + ", " + "Model: " + car2.model + ", Rocznik: "  + car2.year + ", Pojemnosc: " + car2.capacity );
        System.out.println('$');


        System.out.printf("%s", "Samochód 1: \n");
        System.out.printf("Marka: %s, model: %s, rocznik: %d, pojemność: %.1f \n", car1.brand, car1.model,
                car1.year, car1.capacity);
        System.out.printf("%s", "Samochód 2: \n");
        System.out.printf("Marka: %s, model: %s, rocznik: %d, pojemność: %.1f \n", car2.brand, car2.model,
                car2.year, car2.capacity);
    }
}