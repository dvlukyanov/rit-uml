public abstract class Staff extends Person {

    public Staff(String name, String contactNumber) {
        super(name, contactNumber);
    }

    protected abstract void performDuty();

    protected abstract String getPosition();

}
