public class WildAnimal {
    String name;
    int ves;
    int v;
    int sila;
    int hp = 3;

    public WildAnimal(String name, int v) {
        this.name = name;
        this.v = v;
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

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + name + '\'' +
                ", ves=" + ves +
                ", v=" + v +
                ", sila=" + sila +
                ", hp=" + hp +
                '}';
    }
}
