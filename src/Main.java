public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindorStudents = {
                new Gryffindor("Гарри Поттер"),
                new Gryffindor("Гермиона Грейнжер"),
                new Gryffindor("Рон Уизли")
        };

        Slytherin[] slytherinStudents = {
                new Slytherin("Драко Малфой"),
                new Slytherin("Грэхэм Монтегю"),
                new Slytherin("Грегри Гойл")
        };

        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff("Захария Смит"),
                new Hufflepuff("Седриг Диггори"),
                new Hufflepuff("Джастин Финч-Флетчли")
        };

        Ravenclaw[] ravenclawStudents = {
                new Ravenclaw("Чжоу Чанг"),
                new Ravenclaw("Падма Патил"),
                new Ravenclaw("Маркус Белби")
        };

        System.out.println(gryffindorStudents[0]);
        System.out.println(gryffindorStudents[1]);
        System.out.println(hufflepuffStudents[1]);
        System.out.println(hufflepuffStudents[2]);
        System.out.println(ravenclawStudents[2]);
        System.out.println(ravenclawStudents[0]);
        System.out.println(slytherinStudents[0]);
        System.out.println(slytherinStudents[1]);

        System.out.println();

        gryffindorStudents[0].compareWithGryffindorStudent(gryffindorStudents[1]);
        hufflepuffStudents[1].compareWithHufflepuffStudent(hufflepuffStudents[2]);
        ravenclawStudents[2].compareWithRavenclawStudent(ravenclawStudents[0]);
        slytherinStudents[0].compareWithSlytherinStudent(slytherinStudents[1]);

        System.out.println();

        gryffindorStudents[0].compareWithAllStudents(hufflepuffStudents[1]);
        hufflepuffStudents[2].compareWithAllStudents(ravenclawStudents[0]);
        ravenclawStudents[1].compareWithAllStudents(slytherinStudents[2]);
        slytherinStudents[0].compareWithAllStudents(gryffindorStudents[1]);
    }
}