public class Hogwarts {
    private String name;
    private String surName;
    protected String facultyName;
    private int transgress;
    private int powerOfMagic;

    public Hogwarts(String name, String surName, int transgress, int powerOfMagic, String faculty) {
        this.name = name;
        this.surName = surName;
        this.transgress = transgress;
        this.powerOfMagic = powerOfMagic;
        this.facultyName = faculty;

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

    public String getFacultyName() {
        return facultyName;
    }


    public String toString() {
        return "Имя = '" + name + '\'' +
                ", Фамилия = '" + surName + '\'' +
                ", Трансгрессирование = " + transgress +
                ", Сила магии = " + powerOfMagic;
    }

    public int getSumPersonalProperties() {
        return 0;
    }


    public int getSumProperties() {
        return getPowerOfMagic() + getTransgress();
    }


    public void showStudents() {
        System.out.println(toString());
    }


    private void studentEqualsOnMagicProperties(Hogwarts student) {
        if (student.getSumProperties() > this.getSumProperties()) {
            System.out.printf(("\n %s (%d) лучший студент, чем %s (%d)"), student.getName(), student.getSumProperties(), this.getName(), this.getSumProperties());

        } else {
            System.out.printf(("\n %s (%d) лучший студент, чем %s (%d)"), this.getName(), this.getSumProperties(), student.getName(), student.getSumProperties());
        }
    }

    public void studentEquals(Hogwarts student) {
        if (student.getFacultyName().equals(this.getFacultyName())) {
            compareStudents(student);
        } else {
            studentEqualsOnMagicProperties(student);
        }
    }

    private void compareStudents(Hogwarts student) {
        if (student.getSumPersonalProperties() > this.getSumPersonalProperties()) {
            System.out.printf("\n %s (%d) лучший студент %s, чем %s (%d)", student.getName(), student.getSumPersonalProperties(), student.getFacultyName(), this.getName(), this.getSumPersonalProperties());
        } else {
            System.out.printf("\n %s (%d) лучший студент %s, чем %s (%d)", this.getName(), this.getSumPersonalProperties(), this.getFacultyName(), student.getName(), student.getSumPersonalProperties());
        }
    }

}
