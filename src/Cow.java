public class Cow
        extends HomeAnimal
        implements CanBeEaten, CanRes {
    //static  final  type = "korova";

    public Cow(int hp, int v, int ves) {
        super(hp, v, ves);
        this.type = "korova";
    }

    @Override
    public void farmRes(Farmer farmer) {
        int var = (int) (Math.random()*2+5);
        farmer.resurs = farmer.resurs + var;
        System.out.println("Фермер забрал ресурсы с коровы " + var);
    }
}
