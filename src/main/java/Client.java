public class Client {

    public static void main(String[] args) {

        CarModel carModel = new CarModel();
        CarView carView = new CarView();

        CarController carController = new CarController(carModel, carView);

        carController.setCarBrand("Mazda");
        carController.setCarModel("CX3");
        carController.setCarColor("Red");
        carController.setCarNumberOfSeats(5);
        carController.setCarNumberOfMirrors(2);
        carController.setCarHasAirConditioner(true);
        carController.setCarEngine("SKYACTIV");
        carController.setCarHasShockAbsorber(true);

        carController.updateCarView();

    }

}
