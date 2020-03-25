public class Kura
        extends HomeAnimal
        implements CanRes, CanBeEaten {
    public Kura(int hp, int v) {
        super(hp, v);
        this.type = "kura";
    }
}
