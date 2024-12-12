package vehicles;

/**
 * A kind of vehicle that represents a private car.
 *
 * @author mdixon
 */
public class Car extends Vehicle {

    /**
     * The size of the fuel tank (in gallons). If 0, the car is electric.
     */
    private int tankSize;

    /**
     * The range of the vehicle (total range if electric, otherwise a per-gallon range).
     */
    private int range;

    ///////////////////////////////////////////////////////////////////////

    @Override
    public double getMaxRange() {
        // If the tankSize is zero, the car is electric, so return the range as is.
        if (tankSize == 0) {
            return range;
        }
        // Otherwise, calculate the max range by multiplying tankSize with range (miles per gallon).
        return tankSize * range;
    }

    /**
     * @return the tankSize
     */
    public int getTankSize() {
        return tankSize;
    }

    /**
     * Sets the tankSize
     *
     * @param tankSize the tankSize
     */
    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    /**
     * @return the range per gallon.
     */
    public int getRange() {
        return range;
    }

    /**
     * @param range the range per gallon.
     */
    public void setRange(int range) {
        this.range = range;
    }

    /**
     * @return true if the car is electric (has a tank size of 0)
     */
    public boolean isElectric() {
        return tankSize == 0;  // If the tank size is zero, the car is electric.
    }

    ///////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     *
     * Creates a car (which always has 4 wheels).
     *
     * By default, a car has a range of 100, and a tank size of 0 (it is electric).
     *
     * @param model the model name of the vehicle
     * @param regNo the registration number of the vehicle
     */
    public Car(String model, String regNo) {
        // Call the superclass (Vehicle) constructor with default values for wheels, model, and regNo.
        super(4, model, regNo);

        // Set the default range and tank size.
        this.range = 100;  // Default range
        this.tankSize = 0; // Default to electric car (tankSize of 0)
    }
}

