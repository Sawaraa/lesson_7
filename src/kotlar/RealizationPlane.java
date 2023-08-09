package kotlar;

import java.util.Random;

public class RealizationPlane extends Plane{

  Random random = new Random();

  ///// включення двигунів, вивиодить скільки часу до готовності
  @Override
  void StartingTheEngines() {
    int time = random.nextInt(20,88);
    System.out.println("Time to ready: " + time);
  }

  ////// відстань літака з повним баком
  @Override
  void takeOff() {
    double distance = random.nextDouble(0,1000);
    System.out.println("distance on a full tank of fuel: " + distance + " km");
  }

  @Override
  void landingThePlane() {
    System.out.println("The plane is going to land");
  }
}
