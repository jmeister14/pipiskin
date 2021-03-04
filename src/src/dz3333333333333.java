public class dz3333333333333 {
    public static void main(String[] args) {


        int varOne = 1;
        int varTwo = 2;
        int varThree = 3;
        int varFour = 4;

        float fOne = 1f;
        float fTwo = 2f;
        float fThree = 3f;
        float fFour = 4.0f;


        System.out.println("result1: " + calculate(varOne, varTwo, varThree, varFour));

        System.out.println("result2: " + checkNumbers(2, 11));

        if (isPositive(11)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        System.out.println("result4: " + welcome("Анонас"));

        System.out.println("result 5. Год викосоный? Ответ:" + isLeapYear(1984));

    }
    public static float calculate(int a, int b, int c, int d) {
        System.out.println(a * (b + ((float) c / d)));
        return a * (b + ((float) c / d));
    }
    public static boolean checkNumbers(int first, int second) {
        return (first + second <= 20) && (first + second >= 10);
    }

    public static boolean isPositive(int variable) {
        return variable >= 0;
    }

    public static String welcome(String name) {
        return "Привет, " + name + "!";
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
