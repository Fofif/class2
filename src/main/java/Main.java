public class Main {
    public static void main(String[] args) {
            Veterinarian veterinarian = new Veterinarian();
            Animal animals = new Animal();
            animals.food = "apple";
            animals.location = "land";

            Dog dogs = new Dog();
            dogs.food = "bone";
            dogs.location = "forest";

            Cat cats = new Cat();
            cats.food = "milk";
            cats.location = "house";

            Horse horses = new Horse();
            horses.food = "carrot";
            horses.location = "garden";

            Animal[]all = {dogs, cats, horses, animals};

            for (int i = 0; i < all.length; i++){
              veterinarian.treatAnimal(all[i]);
            }
    }
}
