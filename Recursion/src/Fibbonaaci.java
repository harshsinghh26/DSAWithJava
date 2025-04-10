public class Fibbonaaci {
    public static void main(String[] args) {
//        fibb(6);
        System.out.println(fibb(3));
    }
    static int fibb(int n){
        if (n < 2){
            return  n;
        }
        return fibb(n - 1) + fibb(n -2);
    }
}
