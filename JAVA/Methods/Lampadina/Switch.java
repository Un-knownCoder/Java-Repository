package Lampadina;

public class Switch {
  private Lampadina lamp;
  
  public Switch(mLClicks) {
    lamp = new Lampadina(mLClicks);
  }
  
  public void changeState(){
    lamp.click();
    int st = lamp.getState();
    
    String state;
    
    // String state = s < 1 ? "spenta" : s > 1 ? "rotta" : "accesa";
    
    if(st == 0)
      state = "spenta";
    else if(st == 1)
      state = "accesa";
    else
      state = "rotta";
    
    System.out.println(state);
  }
}	
