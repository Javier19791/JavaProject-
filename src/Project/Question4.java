package Project;

public class Question4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5},
                {19, 17, 5, 29, 20}};
                int even = 0;
                int odd = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] % 2 == 0) {
                            even += array[i][j];
                        } else {
                            odd += array[i][j];

                        }
                    }
                }
                System.out.println(even);
                System.out.println(odd);
                        }
                    }

