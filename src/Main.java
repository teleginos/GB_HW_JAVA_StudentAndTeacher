import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", "Ivanovich", LocalDate.of(2000, 1, 1));
        Student student2 = new Student("Petr", "Petrov", "Petrovich", LocalDate.of(1999, 5, 15));
        Student student3 = new Student("Sergey", "Sergeev", "Sergeevich", LocalDate.of(2001, 10, 25));

        Teacher teacher1 = new Teacher("Anna", "Ananova", "Ananovna", LocalDate.of(1980, 6, 6));
        Teacher teacher2 = new Teacher("Maria", "Marieva", "Marievna", LocalDate.of(1985, 7, 7));

        // Creating student groups
        StudentGroup group1 = new StudentGroup(teacher1, Arrays.asList(student1, student2));
        StudentGroup group2 = new StudentGroup(teacher2, Arrays.asList(student3));

        // Creating streams
        Stream stream1 = new Stream(Arrays.asList(group1));
        Stream stream2 = new Stream(Arrays.asList(group1, group2));

        List<Stream> streams = Arrays.asList(stream1, stream2);

        UserController userController = new UserController();
        userController.sortStreams(streams);

        // Printing sorted streams
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getNumberOfGroups() + " groups.");
        }
    }
}
