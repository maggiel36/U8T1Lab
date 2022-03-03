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
}
