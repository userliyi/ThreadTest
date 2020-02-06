package com.liyi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(2,2,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                int m=0;
                String ms="https://www.cnblogs.com/KingJack/p/9595621.html";
                System.out.println("线程池核心方法测试"+m);
                m++;
            }
        });
    }

}
