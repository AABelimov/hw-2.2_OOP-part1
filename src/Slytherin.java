public class Slytherin extends Hogwarts {
    private int cunning; // Хитрость
    private int determination; // Решительнсть
    private int ambition; // Амбициозность
    private int resourcefulness; // Находчивость
    private int lustOfPower; // Жажда власти

    // Конструктор с заполнением полей рандомными значениями
    public Slytherin(String fullName) {
        super(fullName);
        this.cunning = random.nextInt(100);
        this.determination = random.nextInt(100);
        this.ambition = random.nextInt(100);
        this.resourcefulness = random.nextInt(100);
        this.lustOfPower = random.nextInt(100);
    }

    // Конструктор с заполнением полей в ручную
    public Slytherin(String fullName, int magicPower, int travelDistance, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(fullName, magicPower, travelDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    @Override
    public String toString() {
        return String.format("%s: мощность магии - %d, расстояние трансгрессии - %d, хитрость - %d, решительность - %d, амбициозность - %d, находчивость - %d, жажда власти - %d",
                super.getFullName(), super.getMagicPower(), super.getTravelDistance(), cunning, determination, ambition, resourcefulness, lustOfPower);
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    // Сравнение двух учеников Слизерина
    public void compareWithSlytherinStudent(Slytherin otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = cunning + determination + ambition + resourcefulness + lustOfPower;
            int otherStudentPoints = otherStudent.getCunning() + otherStudent.getDetermination() + otherStudent.getAmbition() + otherStudent.getResourcefulness() + otherStudent.getLustOfPower();

            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший слизеринец, чем %s\n", getFullName(), otherStudent.getFullName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший слизеринец, чем %s\n", otherStudent.getFullName(), getFullName());
            } else System.out.println("Одинаковые слизеринцы");
        }
    }
}
