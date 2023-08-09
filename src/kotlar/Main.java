package kotlar;

public class Main {

  public static void main(String[] args) {

    AircraftControl Cy_27 = new AircraftControl(50, "Black");
    Cy_27.StartingTheEngines();
    Cy_27.takeOff();
    Cy_27.moveUp();
    Cy_27.moveLeft();
    Cy_27.moveDown();
    Cy_27.moveRight();
    Cy_27.stealthTechnology();
    Cy_27.nuclearStrike();
    Cy_27.turboAcceleration();
    Cy_27.landingThePlane();

  }
}