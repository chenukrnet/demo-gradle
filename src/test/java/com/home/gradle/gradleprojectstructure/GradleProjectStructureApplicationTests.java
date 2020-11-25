package com.home.gradle.gradleprojectstructure;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@Slf4j
@SpringBootTest
class GradleProjectStructureApplicationTests {

    @Test
    void contextLoads() {
    }

    @Tag("integration")
    @Test
    void integrationTest(){
        fail();
    }

    @Disabled
    @Test
    void disabled(){
        fail();
    }
}
