import java.util.Scanner;

public class switchcase_Enum {

    enum FoodItems {
        BURGER, PIZZA, DRINKS, PASTA;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();        
        FoodItems choice = FoodItems.BURGER;
        switch (choice) {
            case BURGER:
                System.out.println("Rs 100");
                break;
            case PIZZA:
                System.out.println("Rs 200");
                break;
            case DRINKS:
                System.out.println("Rs 300");
                break;
            case PASTA:
                System.out.println("Rs 400");
                break;
            default:
                System.out.println("Wrong Choice...");
                break;
            }
        }
    }
