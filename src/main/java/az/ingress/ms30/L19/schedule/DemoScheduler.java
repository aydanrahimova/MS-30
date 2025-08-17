package az.ingress.ms30.L19.schedule;

import static java.lang.Thread.sleep;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoScheduler {

  @Scheduled(fixedDelayString = "PT10S")
  @SchedulerLock(name = "demoTask", lockAtLeastFor = "PT10S", lockAtMostFor = "PT30S")
  public void demoTask() {

    log.info("DemoTask started at {} ", LocalDateTime.now());
    try {
      sleep(15000L);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    log.info("DemoTask finished at {}", LocalDateTime.now());
  }
}
