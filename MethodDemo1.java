
public class MethodDemo1 {
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    //아래 주석과 같은 코드
    public static void main(String[] args) {
        numbering();
    }

    /*
     public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
     */
}