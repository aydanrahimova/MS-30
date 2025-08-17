package az.ingress.ms30.L19;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import az.ingress.ms30.L19.schedulerexecutor.task.example.MyTask;
import az.ingress.ms30.L19.timer.task.example.MyTimerTask;

public class Main {

  public static void main(String[] args) {

    //TimerTask example - with single non-daemon thread

    // Although we set it to run every 10 seconds,
// each task takes 20 seconds to finish.
// Since Timer uses only one thread,
// new tasks have to wait until the previous one is done.
// So tasks are queued up instead of running every 10 seconds.

//    System.out.println(Thread.currentThread().getName());
//    Timer timer = new Timer();
//    timer.scheduleAtFixedRate(new MyTimerTask(), 0, 10000L);
////    timer.cancel(); //that will kill the thread and all scheduled tasks


//    //ScheduledExecutorService example
//    ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
//    executor.scheduleAtFixedRate(new MyTask(), 0, 1, TimeUnit.SECONDS);

  }

}
