public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age, "Cat");
    }

    @Override
    public void voice() {
        System.out.println(name + " says Meow!");
    }

    public String meow() {
        return "Meow!";
    }
}
