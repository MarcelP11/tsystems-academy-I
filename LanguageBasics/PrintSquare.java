public class PrintSquare {
    public static void main(String[] args) {
        int size = 5;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print("*");  //vypisu sa znaky do riadku
            }
            System.out.println();  //prejde sa na novy riadok a cyklus sa opakuje
        }
    }
}
