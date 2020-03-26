public class Kura
        extends HomeAnimal
        implements CanRes, CanBeEaten {
    public Kura(int hp, int v) {
        super(hp, v);
        this.type = "kura";
    }

    @Override
    public void farmRes(Fermer fermer) {
        fermer.resurs = fermer.resurs + (int) (Math.random()*2+4);
    }
}
