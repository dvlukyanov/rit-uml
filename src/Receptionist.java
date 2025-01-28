public class Receptionist extends Staff {

    public Receptionist(String name, String contactNumber) {
        super(name, contactNumber);
    }

    @Override
    public void performDuty() {
        System.out.println("Receptionist is scheduling appointments.");
    }

    @Override
    public String getPosition() {
        return "Receptionist";
    }

    public void scheduleAppointment(Animal animal, String date) {
        System.out.println("Scheduled an appointment for " + animal.name + " on " + date);
    }

    private boolean verifySchedule(String date) {
        return date != null && !date.isEmpty();
    }

}
