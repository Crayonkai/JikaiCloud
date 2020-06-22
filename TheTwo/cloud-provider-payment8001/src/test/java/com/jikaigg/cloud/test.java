package com.jikaigg.cloud;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Random;

@Slf4j
public class test {
    @Test
    public void test1(){
        Random rand = new Random(47);
        log.info("rand is : {}",rand);
        double a = 2.12;
        double b = +a;
        log.info("b is : {}",b);
    }
}
