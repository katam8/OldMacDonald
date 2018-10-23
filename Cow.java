class Cow implements Animal {     
  //your code here
  private String myType, mySound;      
  public Cow(String type, String sound) {         
    myType = type;         
    mySound = sound;     
  }     
  public Cow() {         
    myType = "unknown";         
    mySound = "unknown";     
  }
  public String getType() {
    return myType;
  }
  public String getSound() {
    return mySound;
  }
}
