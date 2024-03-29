package dev.jlcorradi.playgroundcreditunion;

import dev.jlcorradi.playgroundcreditunion.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  private static boolean shouldDoSomething() {
    return true;
  }
}