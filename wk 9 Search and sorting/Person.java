/**
 * Person class.
 *
 * @author mdixon
 *
 */
public class Person {

    /**
     * The height of the person in cm
     */
    private int height;

    /**
     * The age of the person in years.
     */
    private int age;

    /**
     * Flag indicating whether the person is male (true) or female (false).
     */
    private boolean isMale;

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the isMale
     */
    public boolean isMale() {
        return isMale;
    }

    /**
     * @param isMale the isMale to set
     */
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    @Override
    public String toString() {

        return "Height: "+height + "cm, age: "+age+" years, " + ((isMale) ? "male" : "female");
    }

    /**
     *
     * @param height
     * @param age
     * @param isMale
     */
    public Person(int height, int age, boolean isMale) {
        super();
        this.height = height;
        this.age = age;
        this.isMale = isMale;
    }

}
