public class FunctionTest3_overloading {
    public static void main(String[] args) {
        byte b1=3;
        byte b2=3;
        System.out.println("byte " + compare(b1, b2));

        int value1=3;
        int value2=3;
        System.out.println("int" + compare(value1, value2));

        short value3=3;
        short value4=3;
        System.out.println("short " + compare(value3, value4));

    }

    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }
    
    public static boolean compare(short a, short b)  {
        System.out.println("short");
        return a == b;
    }
}
