public class BubbleSort {
    public static void bubble(int x[]) {   //parameter je pole
        int counter = x.length;  //do novej premennej ulozim hodnotu dlzky pola

        for (int k = 0; k < counter; counter--) {   //slucka for pre posuvanie limitu
            for (int i = 0, j = 1; j < counter; i++, j++) {  //slucka for pre porovnavanie susednych hodnot
                int a = x[i];   //do premennych ukladam hodnoty zo susednych poli
                int b = x[j];
                if (x[i] > x[j]) {    //ak je lava strana vacsia ako prava tak sa hodnoty v poliach vymenia
                    x[i] = b;
                    x[j] = a;
                }
            }
        }
    }

    public static void printValues(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int src[] = {5, 7, 1, 3, 4, 8, 9, 0, 3, 7};
        printValues(src);
        bubble(src);
        printValues(src);
    }
}
