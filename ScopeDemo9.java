class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(this.v);
        //메소드 m에서 인스턴스 변수 v에 접근하기 위해 this를 쓴다.
    }
}
 
public class ScopeDemo9 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
 
}