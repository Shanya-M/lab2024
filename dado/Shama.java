package shapes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Implements the {@link ShapeCollection} interface using an underlying map allowing the number of occurrences of each added shape to be counted.
 *
 * If the same shape is added more than once, then it is not re-added, but its occurrence count is increased.
 *
 * @author mdixon
 */
public class ShapeMap implements ShapeCollection {

    /**
     * A collection which maps contained shapes to an occurrence count.
     */
    private Map<Shape, Integer> shapes; // TODO PART5 : create a suitable map instance

    public ShapeMap() {
        this.shapes = new HashMap<>();
    }

    ///////////////////////////////////////////////////////////////////////

    @Override
    public int addShape(Shape shape) {

        // TODO PART5 : add the shape to the map setting the correct associated occurrence count
        // if the shape was not already in the map, set the associated count to 1
        // otherwise increase the existing occurrence count.
        // finally, return the total number of key/value pairs in the map
        shapes.put(shape, shapes.getOrDefault(shape, 0) + 1);
        return shapes.size();
    }


    @Override
    public boolean removeShape(Shape shape) {

        // TODO PART5 : remove the shape if it exists and return true. Return false if it does not exist.

        if (shapes.containsKey(shape)) {
            int count = shapes.get(shape);
            if (count > 1) {
                shapes.put(shape, count - 1);
            } else {
                shapes.remove(shape);
            }
            return true;
        }
        return false;

    }

    @Override
    public boolean containsShape(Shape shape) {

        // TODO PART5 : check if the map contains the given shape as a key
        return shapes.containsKey(shape);
    }

    @Override
    public int shapeCount() {

        // TODO PART5 : return the number of key/value pairs in the map
        return shapes.size();
    }


    @Override
    public void clearAllShapes() {

        // TODO PART5 : remove all shapes form the map

        shapes.clear();
    }

    @Override
    public int indexOfShape(Shape shape) {

        // TODO PART5 : throw correct exception which indicates this is an unsupported operation
        throw new UnsupportedOperationException("indexOfShape is unsupported.");

    }


    @Override
    public Shape getLargestShape() {
        Shape largest = null;
        double maxArea = -1; // Start with a very low value to ensure the first area is larger.

        for (Entry<Shape, Integer> entry : shapes.entrySet()) {
            Shape shape = entry.getKey();
            double area = shape.getArea(); // Assuming Shape has getArea() method.

            if (area > maxArea) {
                maxArea = area;
                largest = shape;
            }
        }

        return largest;
    }



    @Override
    public Shape getSmallestShape() {
        // Return null if the map is empty
        if (shapes.isEmpty()) {
            return null;
        }
        // Iterate the map and find the shape with the smallest area
        Shape smallestShape = null;
        double minArea = Double.MAX_VALUE;
        for (Map.Entry<Shape, Integer> entry : shapes.entrySet()) {
            Shape shape = entry.getKey();
            double area = shape.getArea();
            if (area < minArea) {
                minArea = area;
                smallestShape = shape;
            }
        }
        return smallestShape;
    }


    @Override
    public int countShapeOfName(String name) {
        // TODO PART5 : iterate the map and count the shapes which have the given name (ignoring case).

        if (name == null || name.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (Entry<Shape, Integer> entry : shapes.entrySet()) {
            Shape shape = entry.getKey();
            if (shape.getName() != null && shape.getName().equalsIgnoreCase(name)) {
                count += entry.getValue();
            }
        }

        return count;
    }


    /**
     * Gets the shape which has the highest occurrence count (i.e. has been added to the collection the most number of times).
     *
     * @return the shape which has been added to the collection the most number of times, null if no shapes exist within the collection.
     */

    public Shape getMostCommonShape() {
        Shape shape = null;
        int max = 0;

        // Iterate the map and find the shape with the highest occurrence count
        for (Entry<Shape, Integer> entry : shapes.entrySet()) {
            if (entry.getValue() > max) { // Correct the variable name here
                max = entry.getValue(); // Update max count
                shape = entry.getKey(); // Update the shape with the highest occurrence
            }
        }

        return shape;
    }


    /**
     * Gets the occurrence count of the most common shape.
     *
     * @return the occurrence count of the most common shape, 0 if no shapes exist within the collection.
     */
    public int getMostCommonShapeCount() {

        Shape shape = getMostCommonShape();

        // TODO PART5 : if the shape is not null, then get the associated occurrence count from the map
        if (shape != null) {
            return shapes.get(shape);
        }
        return 0;
    }
}

///////////////////////////////////////////////////////////////////////




