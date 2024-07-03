import java.util.Scanner;

public class DAY1_ATM {

    int balance = 88000;
    private static boolean isRunning = false; // Flag to control loop

    public static void main(String args[]) {
        isRunning = true;
        startOperations();
    }

    // user operations
    public static void startOperations() {
        DAY1_ATM _atm = new DAY1_ATM();
        Scanner sc = new Scanner(System.in);
        while (isRunning) {
            System.out.println(
                    "Welcome to your bank account. Please input one number among four : \n 1 - Display Balance \n 2 - Deposit amount \n 3 - Withdraw amount \n 4 - Exit ATM");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    _atm.checkBalance();
                    break;
                case 2:
                    System.out.print("\n Please enter an amount in format 100x or 500x : ");
                    try {
                        int deposit = sc.nextInt();
                        if (_atm.validAmount(String.valueOf(deposit)))
                            _atm.deposit(String.valueOf(deposit));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please input a valid integer amount.");
                        sc.nextLine(); // Clear the input buffer
                    } catch (Exception e) {
                        System.out.println("Please input valid amount");
                        sc.nextLine();
                        break;
                    }

                case 3:
                    try {
                        int deposit = sc.nextInt();
                        if (_atm.validAmount(String.valueOf(deposit)))
                            _atm.withdraw(String.valueOf(deposit));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please input a valid integer amount.");
                        sc.nextLine(); // Clear the input buffer
                    } catch (Exception e) {
                        System.out.println("Please input valid amount");
                        sc.nextLine();
                        break;
                    }
                case 4:
                    System.out.println("You may exit ATM safely, session closed");
                    sc.close();
                    isRunning = false;
                    break;
                default:
                    System.out.println(
                            "CODE : Ex000404 \nPlease enter a valid input to server you better or you may contact admin for further assistance if issue persists.");
                    break;
            }
        }
        sc.close();
    }

    // Check Balance
    public int checkBalance() {
        System.out.println("Your current balance is : " + this.balance);
        return this.balance;
    }

    // returns new balance
    public int deposit(String amount_str) {
        int amount = Integer.parseInt(amount_str);
        System.out.println("========== STARTING AMOUNT DEPOSIT SESSION ==========");
        try {
            if (amount % 100 != 0) {
                throw new Exception("Please enter a valid amount with 100x or 500x note combinations only");
            } else {
                balance += amount;
                System.out.println("Amount " + amount + " deposited successfully !! ");
                checkBalance();
            }
        } catch (Exception e) {
            System.out.println("Please input valid amount");
        }
        return balance;
    }

    public int withdraw(String amount_str) {
        int amount = Integer.parseInt(amount_str);
        System.out.println("========== STARTING AMOUNT WITHDRAW SESSION ==========");
        try {
            if (amount > balance) {
                throw new Exception("We can not give you our money !!");
            } else {
                System.out.println(" Withdrawing amount : " + amount + " from your account !!");
                int _500_x = _500_denominations(amount);
                int _100_x = _100_denominations(amount, _500_x);
                if (_500_x > 0) {
                    System.out.println(_500_x + "x500 rupee notes are dispatched, please collect ... ");
                }
                if (_100_x > 0) {
                    System.out.println(_100_x + "x100 rupee notes are dispatched, please collect ... ");
                }
                balance -= amount;
                checkBalance();
            }
        } catch (Exception e) {

        }
        return 0;
    }

    private boolean validAmount(String amount) {
        System.out.println("========== VALIDATING AMOUNT SESSION ===========");
        try {
            boolean valid = Integer.parseInt(amount) % 100 == 0;
            if (valid) {
                System.out.println(amount + " is a valid amount");
            } else {
                System.out.println("Amount Invalid, please try again !!");
            }
            return valid;
        } catch (NumberFormatException e) {
            System.out.println(amount + " is not a valid integer");
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private int _500_denominations(int amount) {
        return amount / 500;
    }

    private int _100_denominations(int amount, int _500_x) {
        return (amount - _500_x * 500) / 100;
    }
}
