public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;

    public Slytherin(String name, String surName, int transgress, int powerOfMagic, int cunning, int determination, int ambition, int resourcefulness, int desireForPower) {
        super(name, surName, transgress, powerOfMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
        this.facultyName = "Слизерин";
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }

    public int getSumPersonalProperties() {
        return getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getDesireForPower() + (getTransgress() - getPowerOfMagic());
    }

    public String toString() {
        return super.toString() + " Хитрость = " + cunning +
                ", Решительность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + desireForPower + ".";
    }

    private void studentEquals(Slytherin a1) {
        if (a1.getClass() == this.getClass()) {
            studentEqualsOnMagicProperties(a1, this);
        } else {
            studentEqualsOnMagicProperties(a1, this);
        }
    }

    protected void compareStudents(Slytherin a1) {
        if (a1.getSumPersonalProperties() > this.getSumPersonalProperties()) {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    a1.getName(), a1.getSumPersonalProperties(), a1.facultyName, this.getName(), this.getSumPersonalProperties());
        } else {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    this.getName(), this.getSumPersonalProperties(), this.facultyName, a1.getName(), a1.getSumPersonalProperties());
        }
    }


}
