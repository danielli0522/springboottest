package com.learn.middleware.lambda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @author: DanielLi
 * @date: 2018/7/30
 * @description:
 */

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringBootTest.class)
public class LambdaTest {

    @Test
    public void runableTest(){
        List list = new ArrayList();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am running by runableTest");
            }
        };
        new Thread(runnable).start();
    }

    @Test
    public void runSomethingByLambda(){
        new Thread(()->System.out.println("I am running by runSomethingByLambda")).start();
    }

    @Test
    public void oldSort(){
        List<String> list = Arrays.asList("my","name","is","uber","and","uc");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(0) <= o2.charAt(0)){
                    return 1;
                }
                return -1;
            }
        });
    }

    @Test
    public void newSort(){
        List<String> list = Arrays.asList("my","name","is","uber","and","uc");
        Collections.sort(list,(a,b)->a.charAt(0) < b.charAt(0) ? 1 : -1);
    }

    @Test
    public void bindEvent(){

    }

}
