package com.pluralsight.demo.tasksink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
