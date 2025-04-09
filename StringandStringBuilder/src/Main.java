public class Main {
    public static void main(String[] args) {
        String str = "abcdbcba";
        System.out.println(isPalindrom(str));
    }
    static boolean isPalindrom(String str){
        int s = 0;
        int e = str.length() - 1;
        while(s < e){
            if(str.charAt(s) == str.charAt(e)){
                s++;
                e--;
            }else{
                return false;
            }
        }
        return true;
    }
}