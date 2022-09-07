public class Dog extends Animal {
    String corgi;

    @Override
    public void makeNoise() {
        System.out.println("Gav-gav");
    }

    @Override
    public void eat() {
       System.out.println("eat meat");
    }
}
