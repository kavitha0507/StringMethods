public class concat {
    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = " My name is";
        System.out.println(s1 +s2);
         String s3 = " kavi";
        System.out.println(s2.concat(s3) );
        String s4 = "Hello";
        System.out.println(s4.concat(s2).concat(s3));
    }
}
