import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};

        seatingChart[1][2] = "Paul";

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;

        for (String[] people : seatingChart)
        {
            System.out.println(Arrays.toString(people));
        }

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        for (int[] num : arr1)
        {
            System.out.println(Arrays.toString(num));
        }

        for (int[] num : arr2)
        {
            System.out.println(Arrays.toString(num));
        }

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for (int[] num : arr1)
        {
            System.out.println(Arrays.toString(num));
        }

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;

        for (int[] num : arr2)
        {
            System.out.println(Arrays.toString(num));
        }
    }
}
