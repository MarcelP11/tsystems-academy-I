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
            printChars(size - i - 1, ' ');
            printChars(2 * (i +1)-1, '*');
            System.out.println();
            i++;
        }
    }

    private static final void printChars(int length, char c) {  //vytvorime si funkciu na vypis znakov privatnu a nemmennu teda final
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}
