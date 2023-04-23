package Project;

public class Question9 {
    public static void main(String[] args) {
        int highet=0;
        int secondHighest=0;
        int[] array={17,19,5,29,20};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highet) {
                secondHighest = highet;
                highet = array[i];

            } else if (array[i] > secondHighest) {
                secondHighest = array[i];
            }
        }
        System.out.println("Second highest number"+" "+secondHighest);

            }
        }



