package ml.wonwoo.javafeatures;

public class NullPoint {

    public static void main(String[] args) {
        String str = null;
        //Null Point Exception
        lowerCase(str);
    }

    private static void lowerCase(String str) {
        System.out.println(str.toLowerCase());
    }
}
