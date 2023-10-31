public class Gryffindor extends Hogwarts {
    private int nobleness; // Благородство
    private int honor; // Честь
    private int bravery; // Храбрость

    // Конструктор с заполнением полей рандомными значениями
    public Gryffindor(String fullName) {
        super(fullName);
        this.nobleness = random.nextInt(100);
        this.honor = random.nextInt(100);
        this.bravery = random.nextInt(100);
    }

    // Конструктор с заполнением полей в ручную
    public Gryffindor(String fullName, int magicPower, int travelDistance, int nobleness, int honor, int bravery) {
        super(fullName, magicPower, travelDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return String.format("%s: мощность магии - %d, расстояние трансгрессии - %d, благородство - %d, честь - %d, храбрость - %d",
                getFullName(), getMagicPower(), getTravelDistance(), nobleness, honor, bravery);
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

    // Сравнение двух учеников Гриффиндора
    public void compareWithGryffindorStudent(Gryffindor otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = nobleness + honor + bravery;
            int otherStudentPoints = otherStudent.getNobleness() + otherStudent.getHonor() + otherStudent.getBravery();

            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший грфиндорец, чем %s\n", getFullName(), otherStudent.getFullName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший грфиндорец, чем %s\n", otherStudent.getFullName(), getFullName());
            } else System.out.println("Одинаковые грифиндорцы");
        }
    }
}
