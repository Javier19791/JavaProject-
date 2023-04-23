package Project;

public class Question10 {
    public static void main(String[] args) {
        String[] names = {"Javier", "Eily", "Hazel", "Belen",};

        for (int i = 0; i <names.length; i++){

            for (int j = i + 1; j < names.length; j++) {

                if (names[i] == names[j]) {

                    System.out.println("Duplicate element is" + " " + names[i]);
                }
            }
        }
    }
}

