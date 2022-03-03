public class FunWith2DArrays
{
    public static int totalElements(int[][] array)
    {
        return array.length * array[0].length;
    }

    public static void fourCorners(String[][] array)
    {
        System.out.println(array[0][0]);
        System.out.println(array[0][array[0].length - 1]);
        System.out.println(array[array.length - 1][0]);
        System.out.println(array[array.length - 1][array[0].length - 1]);
    }

    public static double average(int[][] array)
    {
        double sum = 0;

        for (int[] row : array)
        {
            for (int value : row)
            {
                sum += value;
            }
        }
        return sum / (array.length * array[0].length);
    }

    public static int[] indexFound(String[][] array, String target)
    {
        int[] found = new int[2];
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[0].length; col++)
            {
                if (array[row][col].equals(target))
                {
                    found[0] = row;
                    found[1] = col;
                    return found;
                }
            }
        }
        found[0] = -1;
        found[1] = -1;
        return found;
    }
}
