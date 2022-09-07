public class Cat extends Animal{
    String purr;
    @Override
    public void makeNoise() {
        System.out.println("Meow-meow");
    }

    @Override
    public void eat() {
        System.out.println("eat fish");
    }
}
