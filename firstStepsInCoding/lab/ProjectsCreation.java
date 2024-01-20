import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());

        int neededHoursPerProject = 3;
        int totalHours = projectsCount * neededHoursPerProject;

        System.out.printf(
                "The architect %s will need %d hours to complete %d project/s.",
                architectName,
                totalHours,
                projectsCount
        );
    }
}
