public class Rabbit
        extends HomeAnimal
        implements CanBeEaten {
    int hpmax = 5;
    public Rabbit(int v, int ves) {
        super(v, ves);
        this.type = "krolik";
        this.hp = hpmax;
    }
}
