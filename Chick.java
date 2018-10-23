class Chick implements Animal {     
  //your code here
  private String mySound, myType;     
  public Chick(String type, String sound) {         
    myType = type;         
    mySound = sound;     
  }     
  public Chick() {         
    myType = "unknown";         
    mySound = "unknown";     
  }
  public Chick(String type, String baby, String adult) {
    myType = type;
    if(Math.random() < 0.5) {
      mySound = baby;  
    } else {
      mySound = adult;  
    }
  }
  public String getType() {
    return myType;
  }
  public String getSound() {
    return mySound;
  }
}
