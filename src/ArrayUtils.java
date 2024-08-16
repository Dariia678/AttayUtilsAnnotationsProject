public class ArrayUtils {

    @annotation.MethodInfo(
            name = "findMax",
            returnType = "int",
            description = "Finds the maximum value in an array of integers."
    )
    @annotation.Author(
            firstName = "John",
            lastName = "Doe"
    )
    public int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @annotation.MethodInfo(
            name = "findMin",
            returnType = "int",
            description = "Finds the minimum value in an array of integers."
    )
    @annotation.Author(
            firstName = "Jane",
            lastName = "Smith"
    )
    public int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
