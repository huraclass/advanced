package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.code.strategy.ContextV1;
import hello.advanced.trace.strategy.code.strategy.Strategy;
import hello.advanced.trace.template.code.AbstractTemplate;
import hello.advanced.trace.template.code.SubClassLogic1;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV1Test {
    void strategy() {
        logic1();
        logic2();
    }

    void templateMethodV1() {
        AbstractTemplate template = new SubClassLogic1();
//        template.execute();
    }


    private void logic1() {
        long startTime = System.currentTimeMillis();

        log.info("비즈니스 로직1 실행");

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }
    private void logic2() {
        long startTime = System.currentTimeMillis();

        log.info("비즈니스 로직2 실행");

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }

    @Test
    void StrategyTest() {
        ContextV1 contextV1 = new ContextV1(() -> log.info("hello world"));
        contextV1.execute();
    }

    @Test
    void strategyTest() {
        ContextV1 contextV1 = new ContextV1();
        contextV1.execute(() -> log.info("메서드 주입"));

    }

    @Test
    void strategyV2() {

    }
}
