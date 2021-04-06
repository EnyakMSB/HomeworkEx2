public class AccountInterfaceMain
{
    public static void main(String s[])
    {
        AccountInterface account = new IngBank();

        System.out.println("Transacting using ING Account");
        transactOnAccount(account);
        System.out.println();

        account = new BrdBank();

        System.out.println("Transacting using BRD Account");
        transactOnAccount(account);

        account = new BtBank();

        System.out.println("Transacting using BT Account");
        transactOnAccount(account);

    }

    public static void transactOnAccount(AccountInterface account)
    {
        System.out.println("------------------------------");
        account.deposit(1000.0);
        printBalance("depositing 10,00.0", account);
        account.withdraw(250.0);
        printBalance("withdrawing 2,50.0", account);
        account.withdraw(410.0);
        printBalance("withdrawing 4,10.0", account);
        account.deposit(500.0);
        printBalance("depositing 5,00.0", account);
        System.out.println("------------------------------");
    }

    public static void printBalance(String message, AccountInterface account)
    {
        System.out.println("The balance after " + message + " is " + account.getBalance() +".");
    }

}

