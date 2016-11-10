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
public class BattleIntroView extends View{
    
    public BattleIntroView() {
        super("\n"
                    +"\n HEADS UP!!!!!!!!!!!!!!!"
                    + "\n A group of bandits is chasing after you and they will rob "
                    + "\n you blind!! You have a few option to take...Choose wisely!!!"
                    +"\n----------------------------------"
                    +"\nR - Run!!"
                    +"\nF - Turn and Fight!"
                    +"\nS - Surrender"
                    +"\nH - Help"
                    +"\nQ - Quit"
                    +"\n----------------------------------"
                    +"\nPlease select an option: ");
        
         
    }

    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      switch(value){
          case "R":
              this.runFromBandits();
              break;
          case "F":
              this.fightBandits();
              break;              
          case "S":
              this.surrenderToBandits();
              break;
          case "H":
              this.battleHelpMenu();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }

    private void runFromBandits() {
     System.out.println("call runFromBandits");
       
    }
    private void fightBandits() {
        System.out.println("call fightBandits");
       
    }    
    private void surrenderToBandits() {
        System.out.println("call surrenderToBandits");
       
    }

    private void battleHelpMenu() {
        System.out.println("Call battleHelpMenu");
    }
    
}
