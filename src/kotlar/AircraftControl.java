package kotlar;

import java.util.Random;

public class AircraftControl  {

  Random random = new Random();

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


}
