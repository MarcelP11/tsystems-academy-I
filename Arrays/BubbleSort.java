import persons.ArraySort;
/*
TODO:zmerat cas
  */
import java.util.Arrays;

public class BubbleSort {
    private static long startTime;  //public premenne
    private static long endTime;
    public static void bubble(int x[]) {   //parameter je pole
        int counter = x.length;  //do novej premennej ulozim hodnotu dlzky pola

        for (int k = 0; k < counter; counter--) {   //slucka for pre posuvanie limitu
            for (int i = 0, j = 1; j < counter; i++, j++) {  //slucka for pre porovnavanie susednych hodnot
                int a = x[i];   //do premennych ukladam hodnoty zo susednych poli
                int b = x[j];    //staci len jedna premenna
                if (x[i] > x[j]) {    //ak je lava strana vacsia ako prava tak sa hodnoty v poliach vymenia
                    x[i] = b;
                    x[j] = a;
                }
            }
        }
    }

    public static void recordStart() {  //spustenie casu
        startTime = System.currentTimeMillis();
    }
    public static void recordAndWriteEnd(){  //koniec casu + vypis hodnoty v ms
        endTime = System.currentTimeMillis();
        System.out.println("Duration: "+(endTime-startTime) + " miliseconds");
    }

    public static void printValues(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int src[] = {5, 7, 1, 3, 4, 8, 9, 0, 3, 7};
        int src2[] = {5, 7, 1, 3, 4, 8, 9, 0, 3, 7};
        printValues(src);
        recordStart();
        bubble(src);
        recordAndWriteEnd();
        printValues(src);
        Arrays.sort(src2);
        printValues(src2);








    }
}
