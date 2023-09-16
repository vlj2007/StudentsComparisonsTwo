public class Hogwarts {
    private String name;
    private String surName;
    protected String facultyName;
    private int transgress;
    private int powerOfMagic;

    public Hogwarts(String name, String surName, int transgress, int powerOfMagic) {
        this.name = name;
        this.surName = surName;
        this.transgress = transgress;
        this.powerOfMagic = powerOfMagic;
    }

    public Hogwarts() {

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getTransgress() {
        return transgress;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    @Override
    public String toString() {
        return "Имя = '" + name + '\'' +
                ", Фамилия = '" + surName + '\'' +
                ", Трансгрессирование = " + transgress +
                ", Сила магии = " + powerOfMagic;
    }

    public int getSumPersonalProperties() {
        return 0;
    }

    public void showStudents() {
        System.out.println(toString());
    }

    private void studentEqualsOnMagicProperties(Hogwarts a1, Hogwarts a2) {
        if (a1.getSumPersonalProperties() > a2.getSumPersonalProperties()) {
            System.out.printf("\n %s(%d) обладает большей мощностью, чем %s(%d)",
                    a1.getName(), a1.getSumPersonalProperties(), a2.getName(), a2.getSumPersonalProperties());
        } else {
            System.out.printf("\n %s(%d) обладает большей мощностью, чем %s(%d)",
                    a2.getName(), a2.getSumPersonalProperties(), a1.getName(), a1.getSumPersonalProperties());
        }
    }

    public void studentEquals(Hogwarts a1) {
        if (a1.getClass() == this.getClass()) {
            studentEqualsOnMagicProperties(a1, this);
        } else {
            studentEqualsOnMagicProperties(a1, this);
        }
    }

    protected void compareStudents(Hogwarts a1) {
        if (a1.getSumPersonalProperties() > this.getSumPersonalProperties()) {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    a1.getName(), a1.getSumPersonalProperties(), a1.facultyName, this.getName(), this.getSumPersonalProperties());
        } else {
            System.out.printf("\n %s(%d) лучший студент %s, чем %s(%d)",
                    this.getName(), this.getSumPersonalProperties(), this.facultyName, a1.getName(), a1.getSumPersonalProperties());
        }
    }





}
