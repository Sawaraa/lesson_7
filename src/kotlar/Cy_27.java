package kotlar;

import java.util.Random;

public class Cy_27 extends RealizationPlane implements SpecialOportunities {

  Random random = new Random();

  int maxSpeed;
  String color;
  private AircraftControl aircraftControl;
  public Cy_27(int lenght, int width, int weightint, int maxSpeed, String color) {
    super(lenght,width,weightint);
    this.maxSpeed = maxSpeed;
    this.color = color;
    aircraftControl = new AircraftControl();
  }

  public void moveUp(){
    aircraftControl.moveUp();
  }

  public void moveDown(){
    aircraftControl.moveDown();
  }

  public void moveLeft(){
    aircraftControl.moveLeft();
  }

  public void moveRight(){
    aircraftControl.moveRight();
  }

  @Override
  public void turboAcceleration() {
    int randomNumber = random.nextInt();
    int speed = Math.abs(randomNumber) + maxSpeed;
    if(speed > maxSpeed){
      System.out.println("Turbo Acceleration have: " + speed + " speed");
    }
  }

  /////// невидимість або стелс технології
  @Override
  public void stealthTechnology() {
    int randomNumber = random.nextInt();
    int stealth = Math.abs(randomNumber);
    System.out.println("Plane not visible for: " + stealth + " time");
  }

  //////  ядерний удар
  @Override
  public void nuclearStrike() {
    int number = random.nextInt(0,10);
    System.out.println("Number of nuclear warheads: " + number);
  }
}
