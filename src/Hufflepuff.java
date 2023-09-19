public class Hufflepuff extends Hogwarts {
    private int industrious;
    private int faithful;
    private int honest;

    public Hufflepuff(String name, String surName, int transgress, int powerOfMagic, int industrious, int faithful, int honest) {
        super(name, surName, transgress, powerOfMagic, "Пуффендуй");
        this.industrious = industrious;
        this.faithful = faithful;
        this.honest = honest;
    }

    public int getIndustrious() {
        return industrious;
    }

    public int getFaithful() {
        return faithful;
    }

    public int getHonest() {
        return honest;
    }

    public int getSumPersonalProperties() {
        return getIndustrious() + getFaithful() + getHonest();
    }

    public String toString() {
        return super.toString() + ", Трудолюбие = " + industrious +
                ", Верность = " + faithful +
                ", Честность = " + honest + ".";
    }
}
