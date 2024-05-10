public class ScopeDemo2 {
    static int i;
     
    static void a() {
        i = 0;
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
 
}
//무한반복됨.
//메소드 a의 변수 i와 for문의 변수 i가 동시에 클래스 변수 i를 사용하게 되서....