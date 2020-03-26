public class HomeAnimal {
    protected String name;
    protected int ves;
    protected int hp;
    protected int v;
    protected int resurs = 0;
    protected String type;


    public HomeAnimal(int hp, int v, int ves) {
        this.hp = hp;
        this.v = v;
        this.ves = ves;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getRes() {
        return resurs;
    }

    public void setRes(int res) {
        this.resurs = res;
    }


}
