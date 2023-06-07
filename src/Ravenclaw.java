public class Ravenclaw extends Hogwarts {
    private int intellect; // Ум
    private int wisdom; // Мудрость
    private int wit; // Остроумие
    private int creation; // Творчество

    // Конструктор с заполнением полей рандомными значениями
    public Ravenclaw(String fullName) {
        super(fullName);
        this.intellect = random.nextInt(100);
        this.wisdom = random.nextInt(100);
        this.wit = random.nextInt(100);
        this.creation = random.nextInt(100);
    }

    // Конструктор с заполнением полей в ручную
    public Ravenclaw(String fullName, int magicPower, int travelDistance, int intellect, int wisdom, int wit, int creation) {
        super(fullName, magicPower, travelDistance);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return String.format("%s: мощность магии - %d, расстояние трансгрессии - %d, ум - %d, мудрость - %d, остроумие - %d, творчество - %d",
                super.getFullName(), super.getMagicPower(), super.getTravelDistance(), intellect, wisdom, wit, creation);
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    // Сравнение двух учеников Когтеврана
    public void compareWithRavenclawStudent(Ravenclaw otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = intellect + wisdom + wit + creation;
            int otherStudentPoints = otherStudent.getIntellect() + otherStudent.getWisdom() + otherStudent.getWit() + otherStudent.getCreation();

            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший когтевранец, чем %s\n", getFullName(), otherStudent.getFullName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший когтевранец, чем %s\n", otherStudent.getFullName(), getFullName());
            } else System.out.println("Одинаковые когтевранцы");
        }
    }
}
