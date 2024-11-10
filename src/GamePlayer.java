public class GamePlayer {
    String playerId;
    String playerName;
    int coins;


    public GamePlayer(String playerId,String playerName,int coins){
        playerId=playerId ;
        playerName=playerName;
        coins=coins;
    }
        public void earnCoins(int amount) {
            coins += amount;
            System.out.println(playerName + " earned " + amount + " coins.");
        }

    public boolean spendCoins(int amount) {
        if (coins >= amount) {
            coins -= amount;
            System.out.println(playerName + " spent " + amount + " coins.");
            return true;
        } else {
            System.out.println("Not enough coins");
            return false;
        }
    }

    public boolean giftCoins(GamePlayer anotherPlayer, int amount) {
        if (spendCoins(amount)) {
            anotherPlayer.earnCoins(amount);
            System.out.println(playerName + " gifted " + amount + " coins to " + anotherPlayer.playerName + ".");
            return true;
        } else {
            return false;
        }
    }

    public String getPlayerId() {
        return playerId;
    }
    public String getplayerName() {
        return  playerName;
    }

    public int getCoins() {
        return coins;
    }
    public void setcoins(int coins){
        coins=coins;
    }
    public void displayplayerDatails(){
        System.out.print("playerID:" +playerId +"| playerName:"+ playerName+"|coins:" +coins);


    }
    public  static void main(String[]args){

    }
}
