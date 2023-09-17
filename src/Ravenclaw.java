public class Ravenclaw extends Hogwarts {
    private int intelligent;
    private int wise;
    private int witty;
    private int fullOfCreativity;


    public Ravenclaw(String name, String surName, int transgress, int powerOfMagic, int intelligent, int wise, int witty, int fullOfCreativity) {
        super(name, surName, transgress, powerOfMagic);
        this.intelligent = intelligent;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
        this.facultyName = "Когтевран";
    }

    public int getIntelligent() {
        return intelligent;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public int getSumPersonalProperties() {
        return getTransgress() - getPowerOfMagic() + getIntelligent() + getWise() + getWitty() + getFullOfCreativity();
    }


    public String toString() {
        return super.toString() + " Ум = " + intelligent +
                ", Мудрость = " + wise +
                ", Остроумие = " + witty +
                ", Творчество = " + fullOfCreativity + ".";
    }

    private void studentEquals(Ravenclaw a1) {
        if (a1.getClass() == this.getClass()) {
            studentEqualsOnMagicProperties(a1, this);
        } else {
            studentEqualsOnMagicProperties(a1, this);
        }
    }

    protected void compareStudents(Ravenclaw a1) {
        if (a1.getSumPersonalProperties() > this.getSumPersonalProperties()) {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    a1.getName(), a1.getSumPersonalProperties(), a1.facultyName, this.getName(), this.getSumPersonalProperties());
        } else {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    this.getName(), this.getSumPersonalProperties(), this.facultyName, a1.getName(), a1.getSumPersonalProperties());
        }
    }

}
