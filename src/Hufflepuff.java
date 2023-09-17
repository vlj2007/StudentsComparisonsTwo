public class Hufflepuff extends Hogwarts {
    private int industrious;
    private int faithful;
    private int honest;

    public Hufflepuff(String name, String surName, int transgress, int powerOfMagic, int industrious, int faithful, int honest) {
        super(name, surName, transgress, powerOfMagic);
        this.industrious = industrious;
        this.faithful = faithful;
        this.honest = honest;
        this.facultyName = "Пуффендуй";
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
        return getTransgress() - getPowerOfMagic() + getIndustrious() + getFaithful() + getHonest();
    }


    public String toString() {
        return super.toString() + ", Трудолюбие = " + industrious +
                ", Верность = " + faithful +
                ", Честность = " + honest + ".";
    }

    private void studentEquals(Hufflepuff a1) {
        if (a1.getClass() == this.getClass()) {
            studentEqualsOnMagicProperties(a1, this);
        } else {
            studentEqualsOnMagicProperties(a1, this);
        }
    }

    protected void compareStudents(Hufflepuff a1) {
        if (a1.getSumPersonalProperties() > this.getSumPersonalProperties()) {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    a1.getName(), a1.getSumPersonalProperties(), a1.facultyName, this.getName(), this.getSumPersonalProperties());
        } else {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    this.getName(), this.getSumPersonalProperties(), this.facultyName, a1.getName(), a1.getSumPersonalProperties());
        }
    }


}
