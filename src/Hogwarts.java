import java.util.Random;

public class Hogwarts {
    private String fullName; // Имя
    private int magicPower; // Сила магии
    private int travelDistance; // Растояние трансгрессии

    protected static Random random = new Random();

    // Конструктор с заполнением полей рандомными значениями
    public Hogwarts(String fullName) {
        this.fullName = fullName;
        this.magicPower = random.nextInt(100);
        this.travelDistance = random.nextInt(100);
    }

    // Конструктор с заполнением полей в ручную
    public Hogwarts(String fullName, int magicPower, int travelDistance) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.travelDistance = travelDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTravelDistance() {
        return travelDistance;
    }

    // Сравнение двух любых учеников Хогвартса
    public void compareWithAllStudents(Hogwarts otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = magicPower + travelDistance;
            int otherStudentPoints = otherStudent.getMagicPower() + otherStudent.getTravelDistance();

            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s по суммарной силе магии и способностям к трансгрессии сильней, чем %s\n", fullName, otherStudent.getFullName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s по суммарной силе магии и способностям к трансгрессии сильней, чем %s\n", otherStudent.getFullName(), fullName);
            } else System.out.println("Они равны по суммарной силе магии и способностям к трансгрессии");
        }
    }
}
