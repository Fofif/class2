public class Horse extends Animal{
    String hoof;
    @Override
    public void makeNoise() {
        System.out.println("Igogo-igogo");
    }

    @Override
    public void eat() {
        System.out.println("eat carrot");
    }
}
