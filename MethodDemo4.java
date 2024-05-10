public class MethodDemo4 {
    

    public static void numbering(int limit) {
        int i = 0;
        //여기에서 limit이 parameter(매개변수)다.
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(10);
    }
    //호출할때 로직에 인자로 입력받은 값을 때려박음
    //10은 인자 argument라고도 함.
}

