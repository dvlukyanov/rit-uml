public abstract class Staff extends Person {

    public Staff(String name, String contactNumber) {
        super(name, contactNumber);
    }

    abstract void performDuty();

    abstract String getPosition();

}
