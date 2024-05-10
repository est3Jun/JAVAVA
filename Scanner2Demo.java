
import java.util.Scanner;
 
public class Scanner2Demo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }
 
}
//sc.hasNextInt()는 입력값이 생기기 전까지 실행을 늦춤.