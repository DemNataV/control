public interface CanBeEaten {
    default void eaten(HomeAnimal homeAnimal){
      homeAnimal.hp = 0;
    };
}
