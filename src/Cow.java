public class Cow
        extends HomeAnimal
        implements CanBeEaten, CanRes {
        int hpmax = 12;
    //static  final  type = "korova";

    public Cow(int v, int ves) {
        super(v, ves);
        this.type = "korova";
        this.hp = hpmax;
    }

    @Override
    public void farmRes(Farmer farmer) {
        if (hp > 0){
        int var = (int) (Math.random()*2+5);
        farmer.resurs = farmer.resurs + var;
        System.out.println("Фермер забрал ресурсы с коровы " + var);
        }
    }
}
