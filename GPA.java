public class GPA {
    public static void main(String[] args) {
        System.out.println(gpaCalculator(new String[] {"A", "F", "C", "B"}));
    }

    public static double gpaPoints(String letter) {
        switch (letter) {
            case "A":
                return 4;
            case "A-":
                return 3.67;
            case "B+":
                return 3.33;
            case "B":
                return 3;
            case "B-":
                return 2.67;
            case "C+":
                return 2.33;
            case "C":
                return 2;
            case "C-":
                return 1.67;
            case "D+":
                return 1.33;
            case "D":
                return 1;
            case "F":
                return 0;
            default:
                break;
        }
        return 0;
    }
    
    public static double gpaCalculator(String[] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += gpaPoints(grades[i]);
        }
        return sum / grades.length;
    }
}