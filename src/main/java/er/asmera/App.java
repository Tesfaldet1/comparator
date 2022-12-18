package er.asmera;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Account> accountList = new ArrayList <Account>();
        Account myAccount = new  Account();
        myAccount.addAccount("BC");
        myAccount.numberOfBestMovies = 3;
        myAccount.numberOfOkMovies= 2;
        accountList.add(myAccount);

        Account myAccount2 = new  Account();
        myAccount2.addAccount("CB");
        myAccount2.numberOfBestMovies = 4;
        myAccount2.numberOfOkMovies= 1;
        accountList.add(myAccount2);

        Account myAccount3= new  Account();
        myAccount3.addAccount("CB");
        myAccount3.numberOfBestMovies = 2;
        myAccount3.numberOfOkMovies= 2;
        accountList.add(myAccount3);

        for(Account acc: accountList){
            System.out.println("line27-"+ acc.ownerName + " monthlyCost = " +acc.monthlyCost() + " " + acc.compareTo(myAccount2) );
        }
    }
}
