package az.ingress.ms30.L19.timer.task.example;

import static java.lang.Thread.sleep;

import java.util.Date;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

  private int index;

  @Override
  public void run() {
    String message = "Hello world!";
    if (index < message.length()) {
      System.out.println("Letter: " + message.charAt(index) + "," +
              " Running on thread: " + Thread.currentThread().getName() + "," +
              " Time: " + new Date()); //always the same thread
      index++;
      try { //simulate long-running task
        sleep(20000L);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    } else {
      System.out.println("All letters processed");
      this.cancel(); //that will stop the task but not the thread
    }
  }

}
