/*
  TODO: Expected output from the program for size = 10
             *
            ***
           *****
          *******
         *********
        ***********
       *************
      ***************
     *****************
    *******************
*/
public class PrintTriangle {
    public static void main(String[] args) {
        int size = 10;
        int i = 0;

        while(i < size) {
            printChars(size - i - 2, ' ');
            printChars(1 * (i + 1), '*');
            System.out.println();
        }
    }

    private static final void printChars(int length, char c) {
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}
