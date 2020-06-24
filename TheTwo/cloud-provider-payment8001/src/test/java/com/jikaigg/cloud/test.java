package com.jikaigg.cloud;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jikaigg.cloud.entity.Account;
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

    @Test
    public void test2(){
        Gson gson = new GsonBuilder().create();
        Account account = new Account("3150040907","yaojikai","1000");
        String s = gson.toJson(account);
        log.info("to json : {}" ,s);

        String json = "{\"uid\":\"6666666\",\"userName\":\"shimengyu\",\"telNumber\":\"5000\"}";
        Account account1 = gson.fromJson(json, Account.class);
        log.info("from json : {}",account1);
    }




}
