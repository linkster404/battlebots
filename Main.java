import java.io.Console;

class Main {
  public static void main(String[] args) {
    print("welcome to battle bots.");
    print("here are the rules:");
    print("you fight your opponet until you give up or you defeat all of the enemeys");
    Player newPlayer = new Player();
    for(int i =0; i<5; i++){
      if(newPlayer.playerHealth <= 0){
        print("you have died");
        print("gameover");
        System.out.println();
        break;
      }
      Console console = System.console();
      print("wounld you like to fight:");
      String playerResponse = console.readLine();
      System.out.println();
      if(playerResponse.equals("no")){
        break;
      }
      PunchBot newBot = new PunchBot();
      while(1==1){
        if(newPlayer.playerHealth <= 0){
          print("you have died");
          print("game over");
          System.out.println();
          break;
        }
        if(newBot.botHealth <= 0){
          print("you have dystoryed the robot");
          System.out.println();
          break;
        }
        print("your health: "+newPlayer.playerHealth);
        print("bot health: "+newBot.botHealth);
        //player turn
        print("what wounld you like to do?");
        print("1. attack");
        print("2. heal");
        print("please enter a word:");
        Console console2 = System.console(); 
        String playerResponse2 = console2.readLine();
        if(playerResponse2.equals("heal")){
          if(newPlayer.playerHealth < 10){
            newPlayer.playerHealth += 3;
            print("your health:"+newPlayer.playerHealth);
          }
          }
        if(playerResponse2.equals("attack")){
          int turnAttack = (int)(Math.random()*newPlayer.playerAttack+1);
          System.out.println();
          newBot.botHealth -= turnAttack;
          System.out.println("you attack dealing :"+turnAttack);
          System.out.println();
        }
        //bot turn
        int botTurnAttack = (int)(Math.random()*newBot.botAttack+1);
        newPlayer.playerHealth -= botTurnAttack;
        print("the bot attacks dealing: "+botTurnAttack);
        System.out.println();
      }
      newPlayer.playerHealth =+ 2;
      if(i>=4){
        print("you have won the the game.");
      }
    }
    print("game finshed");
  }
  public static void print(String line){
        System.out.println(line);
  }
}