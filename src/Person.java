public class Person {

    private String name;
    private String contactNumber;

    public Person(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getContactDetails() {
        return "Name: " + name + ", Contact: " + contactNumber;
    }

    private boolean isContactValid() {
        return contactNumber != null && contactNumber.matches("\\d{10}");
    }

}
