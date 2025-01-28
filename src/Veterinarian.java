public class Veterinarian extends Staff {

    private String specialization;

    public Veterinarian(String name, String contactNumber) {
        super(name, contactNumber);
    }

    @Override
    public void performDuty() {
        System.out.println("Veterinarian is treating animals.");
    }

    @Override
    public String getPosition() {
        return "Veterinarian (Specialization: " + specialization + ")";
    }

    public void treatAnimal(Animal animal) throws Exception {
        System.out.println("Treating " + animal.getDetails());
    }

    private void logTreatment(Animal animal) {
        System.out.println("Treatment logged for " + animal.name);
    }

}
