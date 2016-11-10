/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;


/**
 *
 * @author Kameron
 */
public class MainMenuView extends View {

    
public MainMenuView() {
              super("\n"
                    +"\n----------------------------------"
                    +"\n| Main Menu                      |"
                    +"\n----------------------------------"
                    +"\nN - Start new game"
                    +"\nL - Load saved game"
                    +"\nH - Help"
                    +"\nS - Save game"
                    +"\nQ - Quit"
                    +"\n----------------------------------"
                    +"\nPlease select an option: ");
        
    }

   

 /* public void displayMainMenuView() {
       
      boolean done = false;
      do {
          String menuOption =this.getMenuOption();
          if (menuOption.toUpperCase().equals("Q"))
              return;
          
          done = this.doAction(menuOption);
          
      }while(!done);
    }*/

   /* private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.promptMessage +this.menu);
           
            value = keyboard.nextLine();
            value = value.trim();
            
           
            if(value.length() <1) {
                System.out.println("\nInvalid vaule: value can not be blank");
                continue;    
                
            }
            break;
       
        }
        return value;
    }*/
@Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      switch(value){
          case "N":
              this.startNewGame();
              break;
          case "L":
              this.startExistingGame();
              break;
          case "H":
              this.displayHelpMenu();
              break;
          case "S":
              this.saveGame();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }

    private void startNewGame() {
     //GameControl.createNewGame(CIT260Game.getPlayer());
     GameMenuView gameMenu = new GameMenuView();
     gameMenu.displayGameMenuView();
       
    }

    private void startExistingGame() {
       // System.out.println("startExistingGame calld");
       TreasureChestView treasureChest = new TreasureChestView();
       treasureChest.displayTreasurchestView();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        BattleIntroView battleMenu = new BattleIntroView();
        battleMenu.display();
    }
    
}
