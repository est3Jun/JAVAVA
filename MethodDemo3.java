public class MethodDemo3 {
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
        //2랑 다르게 numbering을 여러번 호출 하여 같은로직 여러번 반복시킴.
    }
}
