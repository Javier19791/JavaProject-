package Project;

public class Question1 {
    public static void main(String[] args) {
        int [] temp={68,71,75,87,89,83,67};
        int highest= temp[0];
        int lowest= temp [0];
        for (int j=0; j<7; j++ ) {
        if (highest> temp[j]) {
            highest= temp[j];
        }
        if (lowest> temp[j]){
            lowest = temp[j];
        }

        System.out.println("The highest temperature of the week is "+ highest);
        System.out.println("The lowest temperature of the week is "+ lowest);

    }

}}

