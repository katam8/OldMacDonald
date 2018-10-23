class NamedCow extends Cow {
  private String myName, myType, mySound; 
  public NamedCow(String type, String name, String sound) {
    myName = name;
    myType = type;
    mySound = sound;
  }
  public NamedCow() {  
    myName = "unknown";
    myType = "unknown";         
    mySound = "unknown";     
  }
  public String getType() {
    return myType;
  }
  public String getSound() {
    return mySound;
  }
  public String getName() {
    return myName;
  }
}
