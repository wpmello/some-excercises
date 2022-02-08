package exercicios.veiculo.domain;

import exercicios.veiculo.exception.ImpossibleToDoThis;

public class Veiculo {

    private String brand;
    private String model;
    private String plate;
    private String color;
    private String km;
    private boolean isConnected;
    private int fuel;
    private int speed;
    private double price;

    public Veiculo(String brand, String model, String plate, String color, String km, boolean isOn, int fuel, int speed, double price) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.color = color;
        this.km = km;
        this.isConnected = isOn;
        this.fuel = fuel;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public String getKm() {
        return km;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void accelerate() {
        this.speed +=  20;
        if (this.speed > 0) {
            this.isConnected = true;
        }
    }

    public void toFuel(int fuelQuantity) {
        int quantityAfterIncrement = this.fuel + fuelQuantity;
        if (quantityAfterIncrement >= 60) {
            throw new ImpossibleToDoThis("Quantity max permitted is " + 60 + " litters");
        }
        this.fuel += fuelQuantity;
    }

    public void toBreak() {
        if (this.isConnected == false || this.speed == 0) {
            throw new ImpossibleToDoThis("Car is not in movement.");
        }
        this.speed -= 20;
    }

    public void print(String selectedColor) {
        this.color = selectedColor;
    }

    public void connected() {
        if (this.isConnected) {
            throw new ImpossibleToDoThis("Car is already connected");
        }
        this.isConnected = true;
    }

    public void unconnected() {
        if (this.isConnected == false) {
            throw new ImpossibleToDoThis("Car is already unconnected");
        }
        this.isConnected = false;
    }
}
