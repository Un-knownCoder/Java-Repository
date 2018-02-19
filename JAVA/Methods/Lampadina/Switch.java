package Lampadina;

public class Switch {
  private Lampadina lamp;
  
  public Switch(mLClicks) {
    lamp = new Lampadina(mLClicks);
  }
  
  public void changeState(){
    lamp.click();
    int st = lamp.getState();
    
    String state = s < 1 ? "spenta" : s > 1 ? "rotta" : "accesa";
    System.out.println(state);
  }
}	
