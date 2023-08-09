package com.chb.gulimallware;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {

    @Test
    void contextLoads() {

    }
    public static void main(String[] args) {
        // 创建JavaFaker对象
        Faker faker = new Faker();

        // 生成身份证号码
        // 生成虚构的身份证号码
        String idNumber = faker.numerify("##############");
        System.out.println(idNumber);
    }
}
