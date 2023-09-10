public class RevStr {
    public static void main(String[] args) {
        //concatanation
        String str = "Hello";
        String rev ="";

        for(int i=str.length()-1; i>=0;i-- ){
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
    }
}
