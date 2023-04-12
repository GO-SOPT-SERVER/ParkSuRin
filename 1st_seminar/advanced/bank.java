import java.util.Scanner;

public class bank {
    public static void deposit(int money) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("계좌에 입금할 금액을 입력해주세요: ");
        money += scanner.nextInt();

        System.out.println("입금이 완료되었습니다!");
        System.out.println("잔액은 "+money+"원입니다.");
    }

    public static void withdraw(int money) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("계좌에서 출금할 금액을 입력해주세요: ");
        int cash = scanner.nextInt();

        if (cash>money) {
            System.out.print("잔액이 부족합니다.");
        } else {
            money -= cash;
            System.out.println("출금이 완료되었습니다!");
            System.out.println("잔액은 "+money+"원입니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 10000;

        System.out.print("동작을 입력해주세요(deposit, withdraw): ");
        String action = scanner.next();

        switch (action) {
            case "deposit":
                deposit(money);
                break;

            case "withdraw":
                withdraw(money);
                break;

            default:
                System.out.println("올바른 동작을 입력해주세요");
                break;
        }
    }
}
