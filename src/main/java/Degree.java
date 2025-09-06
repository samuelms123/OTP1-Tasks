import java.util.Scanner;

public class Degree {

    public static int getSchoolLenght (String degreeType) {
        if (degreeType == null) {
            throw new IllegalArgumentException();
        }

        switch (degreeType.toLowerCase()) {
            case "bsc":
                return 4;
            case "msc":
                return 6;
            case "phd":
                return 3;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter school to get the school length: ");
            int lenght = getSchoolLenght(sc.nextLine());
            System.out.println(lenght);
        }
    }
}
