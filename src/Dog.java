public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age, "Dog");
    }

    @Override
    public void voice() {
        System.out.println(name + " says Woof!");
    }

    public String bark() {
        return "Woof!";
    }
}
