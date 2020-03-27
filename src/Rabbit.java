public class Rabbit
        extends HomeAnimal
        implements CanBeEaten {
    //int hpmax = 5;
    public Rabbit(int v, int ves, int hpmax) {
        super(v, ves, hpmax);
        this.type = "krolik";
        this.hp = hpmax;
    }
}
