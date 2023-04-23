package Project;

public class Question7 {
    public static void main(String[] args) {
        int first=8;
        int second=1;
        int third;

        for (int i = 0; i <=10; i++) {

            System.out.println(first+" ");
            third=first+second;
            first=second;
            second=third;
        }
    }
}
