public class ArrayCopy {
    public static void main(String[] args) {
        int[] copyFrom = {0, 1, 3, 4, 7, 10, 65, 79, 10, 12};
        int[] copyTo = new int[7];
        System.arraycopy(copyFrom, 3, copyTo, 6, 3);


    }
}
$