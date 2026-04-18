package Patterns;

public class Diamond {
    public static void main(String[] args) {

        int size = 7;  

        for (int i = size; i > 0; i -= 2) 
        {

            for (int j = 0; j < ((size - i) / 2)*2; j++) {
                System.out.print(" ");
            }

            for (int star = 0; star < i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
