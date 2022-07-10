public class ArrayCopy {
    public static void arrayCopy(int[] source, int srcIndex,
                                 int[] dest, int destIndex, int length) {

        // urobit podmienku pre pretecie a zmerat cas
        int a = srcIndex;
        int b = destIndex;

        for (int i = 0; i < length; i++) {
            dest[b++] = source[a++];
        }
    }

    public static void main(String[] args) {
        int[] src = {0, 1, 3, 4, 7, 10, 65, 79, 10, 12};
        int[] trg = new int[7];  //iba deklaracia

        arrayCopy(src, 3, trg, 2, 3);
        for (int i : trg) {
            System.out.print(i + ",");
        }

            /*
        System.arraycopy(source, 3, target, 2, 3);  //skopiruje prvky pola do druheho pola
        for (int i : target){
            System.out.print(i+",");
        }
*/


    }
}
/*
if (srcIndex + length <soruce.length || destIndex + length < dest.length) {
return false;
}

for (int i = 0; i<srcIndex + length; i++){
dest



 */