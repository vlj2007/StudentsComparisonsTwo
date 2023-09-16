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

}
