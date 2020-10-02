package FraserHughpart3;

/**
 * CM2100 Coursework Part 3 Starting point
 * Class to store details of a User that will be associated with a MediaList
 * @author David
 */
public class User {
    
    private final String username;
    private int wallet;

    public User(String name, int pence) {
        this.username = name;
        this.wallet = pence;
    }

    public String getUsername() {
        return username;
    }
    
    public void topUp(int pence){
        wallet += pence;
    }
    
    public int getWallet(){
        return wallet;
    }
    
    public boolean purchase(Media m){
        if(wallet >= m.costInPence()){
            wallet -= m.costInPence();
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return username + " £" + wallet/100 + "." + wallet%100;
    }   
        
}
