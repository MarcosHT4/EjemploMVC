public class CarController {

    private CarModel carModel;
    private CarView carView;

    public CarController(CarModel carModel, CarView carView) {
        this.carModel = carModel;
        this.carView = carView;
    }

    public void updateCarView() {

        carView.printCarView(carModel.getBrand(), carModel.getModel(), carModel.getColor(), carModel.getNumberOfSeats()
        ,carModel.getNumberOfMirrors(), carModel.isHasAirConditioner(), carModel.getEngine(), carModel.isHasShockAbsorber());

    }

    public void setCarBrand(String brand) {

        carModel.setBrand(brand);

    }

    public void setCarModel(String model) {

        carModel.setModel(model);

    }

    public void setCarColor(String color) {

        carModel.setColor(color);

    }

    public void setCarNumberOfSeats(int numberOfSeats) {

        carModel.setNumberOfSeats(numberOfSeats);

    }

    public void setCarNumberOfMirrors(int numberOfMirrors) {

        carModel.setNumberOfMirrors(numberOfMirrors);

    }

    public void setCarHasAirConditioner(boolean hasAirConditioner) {

        carModel.setHasAirConditioner(hasAirConditioner);

    }

    public void setCarEngine(String engine) {

        carModel.setEngine(engine);

    }

    public void setCarHasShockAbsorber(boolean hasShockAbsorber) {

        carModel.setHasShockAbsorver(hasShockAbsorber);

    }


}
