package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterAmount = 400, milkAmount = 540, beansAmount = 120, cupsAmount = 9, money = 550;

        // infinite loop
        while(true) {
            System.out.println();
            System.out.println("Type an action to perform (buy, fill, take, remaining, exit):");
            String actionInput = scanner.next();
            String buy = "buy", fill = "fill", take = "take", remaining = "remaining", exit = "exit";
            System.out.println();


            if (actionInput.equals(buy)) {   // buy
                System.out.println("Pick an item to buy (1 - espresso, 2 - latte, 3 - cappuccino) or type back");
                String itemInput = scanner.next();
                switch (itemInput) {
                    case "1":
                        if (waterAmount < 250) {System.out.println("Sorry, not enough water in the machine"); break;}
                        else if (beansAmount < 16) {System.out.println("Sorry, not enough coffee beans in the machine"); break;}
                        else if (cupsAmount == 0) {System.out.println("Sorry, not enough cups in the machine"); break;}
                        else {
                            waterAmount -= 250; beansAmount -= 16; cupsAmount -= 1; money += 4;
                            System.out.println();
                            System.out.println("Making you an espresso");
                            break;
                        }
                    case "2":
                        if (waterAmount < 350) {System.out.println("Sorry, not enough water in the machine"); break;}
                        else if (milkAmount < 75) {System.out.println("Sorry, not enough milk in the machine"); break;}
                        else if (beansAmount < 20) {System.out.println("Sorry, not enough coffee beans in the machine"); break;}
                        else if (cupsAmount == 0) {System.out.println("Sorry, not enough cups in the machine"); break;}
                        else {
                            waterAmount -= 350; milkAmount -= 75; beansAmount -= 20; cupsAmount-= 1; money += 7;
                            System.out.println();
                            System.out.println("Making you a latte");
                            break;
                        }
                    case "3":
                        if (waterAmount < 200) {System.out.println("Sorry, not enough water in the machine"); break;}
                        else if (milkAmount < 100) {System.out.println("Sorry, not enough milk in the machine"); break;}
                        else if (beansAmount < 12) {System.out.println("Sorry, not enough coffee beans in the machine"); break;}
                        else if (cupsAmount == 0) {System.out.println("Sorry, not enough cups in the machine"); break;}
                        else {
                            waterAmount -= 200; milkAmount -= 100; beansAmount -= 12; cupsAmount -= 1; money += 6;
                            System.out.println();
                            System.out.println("Making you cappuccino");
                            break;
                        }
                    case "back":
                        continue;
                    default:
                        System.out.println("Invalid command");
                }
                System.out.println();
            } else if (actionInput.equals(fill)) {   // fill
                System.out.println("Write how many ml of water do you want to add:");
                int waterFill = scanner.nextInt();
                waterAmount += waterFill;

                System.out.println("Write how many ml of milk do you want to add:");
                int milkFill = scanner.nextInt();
                milkAmount += milkFill;

                System.out.println("Write how many grams of coffee beans do you want to add:");
                int beansFill = scanner.nextInt();
                beansAmount += beansFill;

                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int cupsFill = scanner.nextInt();
                cupsAmount += cupsFill;

                System.out.println();
            } else if (actionInput.equals(take)) {   // take
                System.out.println("I gave you $" + money);
                money = 0;
                System.out.println();
            } else if (actionInput.equals(remaining)) {    // remaining
                currentAmountsMethod(waterAmount, milkAmount, beansAmount, cupsAmount, money);
                System.out.println();
            } else if (actionInput.equals(exit)) {   // exit
                break;
            } else {
                System.out.println("Invalid command");
                System.out.println();
            }
        }



    }

    public static void currentAmountsMethod(int waterAmount, int milkAmount, int beansAmount, int cupsAmount, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(waterAmount + " of water");
        System.out.println(milkAmount + " of milk");
        System.out.println(beansAmount + " of coffee beans");
        System.out.println(cupsAmount + " of disposable cups");
        System.out.println(money + " of money");
    }
}