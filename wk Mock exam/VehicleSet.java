package vehicles;

import java.util.HashSet;
import java.util.Set;

/**
 * Implements the {@link VehicleCollection} interface using an underlying set.
 *
 * @author mdixon
 */
public class  VehicleSet implements VehicleCollection {

    /**
     * The set of vehicles
     */
    private Set<Vehicle> vehicles = new HashSet<Vehicle>();

    ///////////////////////////////////////////////////////////////////////

    @Override
    public int addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            return vehicles.size();  // If the vehicle is null, don't add and return the current size.
        }
        vehicles.add(vehicle);  // Add vehicle to the set
        return vehicles.size();  // Return the size of the set after adding the vehicle.
    }

    @Override
    public boolean removeVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            return false;  // If the vehicle is null, return false.
        }
        return vehicles.remove(vehicle);  // Attempt to remove the vehicle; return true if removed.
    }

    @Override
    public boolean containsVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            return false;  // If the vehicle is null, return false.
        }
        return vehicles.contains(vehicle);  // Return whether the set contains the vehicle.
    }

    @Override
    public int vehicleCount() {
        return vehicles.size();  // Return the size of the set, which represents the vehicle count.
    }

    @Override
    public void clearAllVehicles() {
        vehicles.clear();  // Clears all vehicles from the set.
    }

    @Override
    public Vehicle getLargestRange() {
        Vehicle largest = null;
        for (Vehicle vehicle : vehicles) {
            if (largest == null || vehicle.getMaxRange() > largest.getMaxRange()) {
                largest = vehicle;  // Update if current vehicle has a larger range.
            }
        }
        return largest;  // Return the vehicle with the largest range.
    }

    @Override
    public int countVehiclesOfModel(String model) {
        if (model == null) {
            return 0;  // If the model is null, return 0 as no vehicles can match.
        }

        int count = 0;
        for (Vehicle vehicle : vehicles) {
            if (model.equals(vehicle.getModel())) {
                count++;  // Increment count if the vehicle's model matches the given model.
            }
        }
        return count;  // Return the number of vehicles matching the given model.
    }

    @Override
    public boolean containsVehicleWithReg(String regNo) {
        if (regNo == null) {
            return false;  // If the registration number is null, return false.
        }

        for (Vehicle vehicle : vehicles) {
            if (regNo.equals(vehicle.getRegNo())) {
                return true;  // Return true if a vehicle with the given registration number is found.
            }
        }
        return false;  // Return false if no vehicle with the given registration number is found.
    }

    ///////////////////////////////////////////////////////////////////////

}

