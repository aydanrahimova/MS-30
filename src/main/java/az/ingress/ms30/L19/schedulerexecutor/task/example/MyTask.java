package az.ingress.ms30.L19.schedulerexecutor.task.example;

import static java.lang.Thread.sleep;

import java.util.Date;

public class MyTask implements Runnable {
  private int index;

  @Override
  public void run() {
    String message = "Hello world!";
    if (index < message.length()) {
      System.out.println("Letter: " + message.charAt(index) + "," +
              " Running on thread: " + Thread.currentThread().getName() + "," +
              " Time: " + new Date());
      index++;
      try { //simulate long-running task
        sleep(2000L);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    } else {
      System.out.println("All letters processed");
    }
  }
}
