package hello.advanced.trace.template;

import hello.advanced.trace.template.code.AbstractTemplate;
import hello.advanced.trace.template.code.SubClassLogic1;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

@Slf4j
public class TemplateMethodTest {
    @Test
    void templateMethodV0() {
        logic1();
        logic2();
    }

    @Test
    void templateMethodV1() {
        AbstractTemplate template = new SubClassLogic1();
//        template.execute();
    }

    @Test
    void test(HttpServletRequest request1) {
        String name = "marin";
        AbstractTemplate template = new AbstractTemplate() {
            @Override
            protected void call() {
            }
        };
        template.execute();
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
}

