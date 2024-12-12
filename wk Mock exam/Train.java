package vehicles;

/**
 * A kind of vehicle that represents a passenger train.
 *
 * @author mdixon
 */
public class Train extends Vehicle {

    /**
     * The number of passengers that the train can carry.
     */
    private int passengerCount;

    /**
     * The maximum range of the train
     */
    private int maxRange;

    ///////////////////////////////////////////////////////////////////////

    @Override
    public double getMaxRange() {
        return maxRange;  // Return the maximum range of the train
    }

    /**
     * Sets the max range
     *
     * @param maxRange the max range
     */
    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;  // Set the max range
    }

    /**
     * @return the number of passengers that the train can carry.
     */
    public int getPassengerCount() {
        return passengerCount;  // Return the number of passengers
    }

    /**
     * Sets the passengerCount
     *
     * @param passengerCount the number of passengers that the train can carry.
     */
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;  // Set the passenger count
    }

    /**
     * Gets the estimated length of the train.
     *
     * The train length is estimated as being 3.2 metres for each of its wheels.
     *
     * @return the estimated length of the train.
     */
    public double getTrainLength() {
        return getWheels() * 3.2;  // Estimated length = number of wheels * 3.2 meters per wheel
    }

    ///////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     *
     * Creates a train.
     *
     * By default, a train can carry 125 passengers, and has a range of 200.
     *
     * @param wheels the number of wheels
     * @param model the model name of the vehicle
     * @param regNo the registration number of the vehicle
     */
    public Train(int wheels, String model, String regNo) {
        // Call the superclass (Vehicle) constructor with the specified values for wheels, model, and regNo.
        super(wheels, model, regNo);

        // Set the default range and passenger count.
        this.maxRange = 200;  // Default range
        this.passengerCount = 125;  // Default passenger count
    }
}

