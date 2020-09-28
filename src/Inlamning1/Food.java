package Inlamning1;

public interface Food {
    public int amountOfFood();
    public enum Kind {DOG(100),CAT(150),SNAKE(20);
    public final int foodIndex;
    Kind(int index){foodIndex=index;}
    }

}
