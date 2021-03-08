import java.util.Arrays;

public class homework2 {

    public static void main(String[] args) {

        int[] array1 = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0};
        System.out.println("1. var1:\t" + Arrays.toString(array1));
        change(array1);
        System.out.println("1. var2:\t" + Arrays.toString(array1));

        int[] arr222 = new int[8];
        fillIn(arr222);
        System.out.println("2. arr2y:\t" + Arrays.toString(arr222));

        int[] massive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3. task3-1:\t" + Arrays.toString(massive));
        doubling(massive);
        System.out.println("3. task3-2:\t" + Arrays.toString(massive));

        int side = 5;
        int[][] trtd = new int[side][side];
        crossFill(trtd);
        for (int i = 0; i < trtd.length; i++) {
            for (int j = 0; j < trtd[i].length; j++) {
                System.out.print(trtd[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (array[i] == 1) ? 0 : 1;
    }

    private static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i * 3 + 1;
    }

    private static void doubling(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
    }

    private static void crossFill(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }
}
