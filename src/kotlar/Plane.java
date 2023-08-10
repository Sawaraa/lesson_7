package kotlar;

public abstract class Plane {

  int lenght;
  int width;
  int weight;

  public Plane(int lenght, int width, int weight) {
    this.lenght = lenght;
    this.width = width;
    this.weight = weight;
  }

  abstract void StartingTheEngines();

  abstract void takeOff();

  abstract void landingThePlane();
}
