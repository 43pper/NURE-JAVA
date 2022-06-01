package ua.nure.matsak.task2.part2;

import java.util.Objects;

public class Car {
    private String model;
    private int power;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power);
    }
}
