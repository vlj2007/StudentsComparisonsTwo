public class Gryffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int bravery;


    public Gryffindor(String name, String surName, int transgress, int powerOfMagic, int nobleness, int honor, int bravery) {
        super(name, surName, transgress, powerOfMagic);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
        this.facultyName = "Гриффиндор";
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int getSumPersonalProperties() {
        return getTransgress() - getPowerOfMagic() + getNobleness() + getHonor() + getBravery();
    }


    public String toString() {
        return super.toString() + ", благородство = " + nobleness +
                ", честь = " + honor +
                ", храбрость = " + bravery + ".";
    }

    protected void studentEqualsOnMagicProperties(Gryffindor a1, Gryffindor gryffindor) {
        if (a1.getSumPersonalProperties() > this.getSumPersonalProperties()) {
            System.out.printf("\n %s(%d) обладает большей мощностью, чем %s(%d)",
                    a1.getName(), a1.getSumPersonalProperties(), this.getName(), this.getSumPersonalProperties());
        } else {
            System.out.printf("\n %s(%d) обладает большей мощностью, чем %s(%d)",
                    this.getName(), this.getSumPersonalProperties(), a1.getName(), a1.getSumPersonalProperties());
        }
    }

    private void studentEquals(Gryffindor a1) {
        if (a1.getClass() == this.getClass()) {
            studentEqualsOnMagicProperties(a1, this);
        } else {
            studentEqualsOnMagicProperties(a1, this);
        }
    }


    protected void compareStudents(Gryffindor a1) {
        if (a1.getSumPersonalProperties() > this.getSumPersonalProperties()) {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    a1.getName(), a1.getSumPersonalProperties(), a1.facultyName, this.getName(), this.getSumPersonalProperties());
        } else {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    this.getName(), this.getSumPersonalProperties(), this.facultyName, a1.getName(), a1.getSumPersonalProperties());
        }
    }


}
