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
}
