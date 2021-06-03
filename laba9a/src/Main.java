import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        int count = 1;

        if(input.length() != 0){
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цену одного слова");
        int num = in.nextInt();
        int cost = num*count;
        System.out.println("Итоговая цена "+cost);
    }
    }
