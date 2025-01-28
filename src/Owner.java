import java.util.ArrayList;
import java.util.List;

public class Owner extends Person {

    private List<Animal> pets;

    public Owner(String name, String contactNumber) {
        super(name, contactNumber);
        this.pets = new ArrayList<>();
    }

    public void addPet(Animal pet) {
        pets.add(pet);
    }

    public void viewPets() throws Exception {
        for (Animal pet : pets) {
            System.out.println(pet.getDetails());
        }
    }

    private Animal findPetByName(String name) {
        for (Animal pet : pets) {
            if (pet.name.equals(name)) {
                return pet;
            }
        }
        return null;
    }

}
