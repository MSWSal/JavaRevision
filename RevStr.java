public class RevStr {
    public static void main(String[] args) {
        String str = "Hello";
        String rev ="";
        //=========================concatanation
//
//
//
//        for(int i=str.length()-1; i>=0;i-- ){
//            rev = rev + str.charAt(i);
//        }

        //====================char[]
//        char rev[]= new char[0];
//        char arr[]= str.toCharArray();
//
//
//        for (int i=arr.length-1;i>=0;i--){
//            rev+= arr[i];
//
//        }
//
//
//        System.out.println(rev);

        //=================strbuffer
        StringBuffer strbf = new StringBuffer();
        strbf.append(str);


        System.out.println(strbf.reverse());


    }
}
