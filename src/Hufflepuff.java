public class Hufflepuff extends Hogwarts {
    private int diligence; // Трудолюбие
    private int loyalty; // Верность
    private int honesty; // Честность

    // Конструктор с заполнением полей рандомными значениями
    public Hufflepuff(String fullName) {
        super(fullName);
        this.diligence = random.nextInt(100);
        this.loyalty = random.nextInt(100);
        this.honesty = random.nextInt(100);
    }

    // Конструктор с заполнением полей в ручную
    public Hufflepuff(String fullName, int magicPower, int travelDistance, int diligence, int loyalty, int honesty) {
        super(fullName, magicPower, travelDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return String.format("%s: мощность магии - %d, расстояние трансгрессии - %d, трудолюбие - %d, верность - %d, честность - %d",
                super.getFullName(), super.getMagicPower(), super.getTravelDistance(), diligence, loyalty, honesty);
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    // Сравнение двух учеников Пуффендуя
    public void compareWithHufflepuffStudent(Hufflepuff otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = diligence + loyalty + honesty;
            int otherStudentPoints = otherStudent.getDiligence() + otherStudent.getLoyalty() + otherStudent.getHonesty();

            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший пуффендуец, чем %s\n", getFullName(), otherStudent.getFullName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший пуффендуец, чем %s\n", otherStudent.getFullName(), getFullName());
            } else System.out.println("Одинаковые пуффендуйцы");
        }
    }
}
