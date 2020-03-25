public class Korova
        extends HomeAnimal
        implements CanBeEaten, CanRes {
    //static  final  type = "korova";

    public Korova(int hp, int v) {
        super(hp, v);
        this.type = "korova";
    }
}
