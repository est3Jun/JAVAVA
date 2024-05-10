public class MethodDemo5 {
 
    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(1, 5);
    }
    //복수로 사용할땐 , 뒤에 파라메터 정의해주기.
 
}