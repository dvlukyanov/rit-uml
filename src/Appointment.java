public class Appointment {

    private String appointmentDate;
    private Animal animal;
    private Staff staffMember;

    public Appointment(String appointmentDate, Animal animal, Staff staffMember) {
        this.appointmentDate = appointmentDate;
        this.animal = animal;
        this.staffMember = staffMember;
    }

    public String getAppointmentDetails() throws Exception {
        return "Appointment on: " + appointmentDate +
                ", Animal: " + animal.getDetails() +
                ", Staff: " + staffMember.getPosition();
    }

}
