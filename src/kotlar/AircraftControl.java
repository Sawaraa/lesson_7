package kotlar;

import java.util.Random;

public class AircraftControl extends RealizationPlane implements SpecialOportunities {

  Random random = new Random();

  int maxSpeed;
  String color;

  public AircraftControl(int maxSpeed, String color) {
    this.maxSpeed = maxSpeed;
    this.color = color;
  }

  void moveUp(){
    int distance = random.nextInt(500, 1000);
    System.out.println("Up : " + distance);
  }

  void moveDown(){
    int distance = random.nextInt(500, 1000);
    System.out.println("Down : " + distance);
  }

  void moveLeft(){
    int distance = random.nextInt(500, 1000);
    System.out.println("Left : " + distance);
  }

  void moveRight(){
    int distance = random.nextInt(500, 1000);
    System.out.println("Right : " + distance);
  }

  ///// турбо прискорення
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
