package Inlamning1;

public interface Food {
    int amountOfFood();

    String foodType();

    enum Kind {
        DOG(100, "hundmat"), CAT(150, "kattmat"), SNAKE(20, "ormpellets");
        public final int foodIndex;
        public final String foodType;

        Kind(int index, String Type) {
            foodIndex = index;
            foodType = Type;
        }
    }

}
