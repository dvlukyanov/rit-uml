public abstract class Animal {

    protected String name;
    protected int age;
    protected String species;

    protected Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public abstract void voice();

    public String getDetails() throws Exception {
        if (!isValid())
            throw new Exception();
        return "Name: " + name + ", Age (months): " + calculateAge() + ", Species: " + species;
    }

    private int calculateAge() {
        return age * 12;
    }

    private boolean isValid() {
        return name != null && !name.isEmpty() && age >= 0 && species != null && !species.isEmpty();
    }

}