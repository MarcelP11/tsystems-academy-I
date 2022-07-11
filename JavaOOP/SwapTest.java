public class SwapTest {
    public static void main(String[] args) {
        int a = 4;
        int b= 5;
        swap(a,b);
        System.out.println("a: "+a + ", b: " + b);
    }

    private static void swap(int a, int b){
        int c = a;
        a=b;  //neda sa to pre primitivne datove typy takato vymena
        b=c;
    }
}
