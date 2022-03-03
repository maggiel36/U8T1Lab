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

        int[][] test = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(test));
        int[][] test2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(FunWith2DArrays.totalElements(test2));
        int[][] test3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.totalElements(test3));
        int[][] test4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.totalElements(test4));
        int[][] test5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(FunWith2DArrays.totalElements(test5));
        int[][] test6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(FunWith2DArrays.totalElements(test6));
        int[][] test7 = {{4}, {7,}, {8}, {2}};
        System.out.println(FunWith2DArrays.totalElements(test7));
        int[][] test8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(test8));
        int[][] test9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(test9));

        String[][] words = {{"hi", "bye", "stuff", "go"},
                            {"time", "up", "you", "good"},
                            {"map", "low", "bow", "mom"}};
        FunWith2DArrays.fourCorners(words);

        String[][] words2 = {{"time", "up", "bye"},
                             {"hi", "hit", "up"},
                             {"map", "bam", "low"},
                             {"bow", "mom", "joy"}};
        FunWith2DArrays.fourCorners(words2);

        String[][] words3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(words3);

        String[][] words4 = {{"cat"},
                             {"dog"},
                             {"hamster"},
                             {"bird"}};
        FunWith2DArrays.fourCorners(words4);

        String[][] words5 = {{"time"}};
        FunWith2DArrays.fourCorners(words5);

    }
}
