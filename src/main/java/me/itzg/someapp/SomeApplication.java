package me.itzg.someapp;

import me.itzg.somelib.EnableExtraJpa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableExtraJpa
public class SomeApplication {

  public static void main(String[] args) {
    SpringApplication.run(SomeApplication.class, args);
  }

}
