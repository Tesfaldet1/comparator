package er.asmera;


public class Account implements OnlineAccount, Comparable<AccountInterface> {
    String ownerName;
    int numberOfBestMovies =0;
    int numberOfOkMovies = 0;

    public  int monthlyCost(){
        return basePrice + numberOfOkMovies * OkMoviesPrice + numberOfBestMovies * bestMoviesPrice;
    }
    @Override
    public int compareTo(Account o) {
        if(this.ownerName.compareTo(o.ownerName)!=0){
            System.out.println("line 15 account class "+ this.ownerName.compareTo(o.ownerName));
            return this.monthlyCost()-o.monthlyCost();
        }
        return this.monthlyCost()-o.monthlyCost();
    }
    public void addAccount(String name){
        this.ownerName=name;

    }

    @Override
    public int compareTo(AccountInterface o) {
        return 0;
    }
}
