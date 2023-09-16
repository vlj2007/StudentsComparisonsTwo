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
}
