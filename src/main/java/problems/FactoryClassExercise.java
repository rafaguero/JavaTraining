package problems;
class Food {
    public Food(){};
}
class PizzaFood extends Food {}
class MexicanFood extends Food {}

class FoodFactory {
    public FoodFactory (){}

    public Food getFoodFactory(String foodType){
        if (foodType.equals("Pizza"))
            return new PizzaFood();
        else
            return new MexicanFood();
    }
}

public class FactoryClassExercise {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Food pizzaFood = foodFactory.getFoodFactory("Pizza");
        Food mexicanFood = foodFactory.getFoodFactory("Mexican");
        System.out.println(pizzaFood.getClass().getSimpleName());
        System.out.println(mexicanFood.getClass().getSimpleName());
    }
}
