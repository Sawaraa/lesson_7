package kotlar;

import java.util.Random;

public class RealizationPlane extends Plane{

  Random random = new Random();

  public RealizationPlane(int lenght, int width, int weight) {
    super(lenght,width, weight);
  }

  ///// включення двигунів, виводить скільки часу до готовності
  @Override
  void StartingTheEngines() {
    int time = random.nextInt(20,88);
    System.out.println("Time to ready: " + time);
  }

  ////// відстань літака з повним баком
  @Override
  void takeOff() {
    double distance = random.nextDouble(0,1000);
    System.out.println("Distance on a full tank of fuel: " + distance + " km");
  }

  @Override
  void landingThePlane() {
    System.out.println("The plane is going to land");
  }
}
