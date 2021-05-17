package java_20210517;

public class ThrowDemo_5 {

	public static double withdraw(String account, int amount)
			throws InsufficientBalanceException_6, IncorrectAccountException_7 {
		double myBalance = 10000;
		String myAccount = "123-123-123456";
		if (myAccount.equals(account)) {
			if (myBalance - amount >= 0) {
				myBalance -= amount;
			} else {
				throw new InsufficientBalanceException_6("잔고가 부족합니다");
			}
		} else {
			throw new IncorrectAccountException_7("잘못된 계좌번호 입니다.");
		}
		return myBalance;
	}

	public static void main(String[] args) {
		double balance = 0;
		try {
			balance = withdraw("123-123-123456", 9000);
			System.out.printf("잔고 : %,.2f", balance);
		} catch (InsufficientBalanceException_6 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IncorrectAccountException_7 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
