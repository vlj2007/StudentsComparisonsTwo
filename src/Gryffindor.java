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
}
