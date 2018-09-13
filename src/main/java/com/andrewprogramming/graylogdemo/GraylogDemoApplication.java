package com.andrewprogramming.graylogdemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraylogDemoApplication {

  public static void main(String[] args) {
    Logger logger = LogManager.getLogger(GraylogDemoApplication.class);
    logger.info("Application Start Running...");
    logger.debug("Application Start Running...");
    logger.error("Application Start Running...");
    logger.warn("Application Start Running...");

    SpringApplication.run(GraylogDemoApplication.class, args);
  }
}
