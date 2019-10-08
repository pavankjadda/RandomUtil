package com.pj.randomutil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.SecureRandom;

@SpringBootApplication
public class RandomUtilApplication
{
    private static Logger logger= LoggerFactory.getLogger(RandomUtilApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(RandomUtilApplication.class, args);
        logger.info("Random Long: {}", RandomUtil.getSecureRandomInstance().nextLong());

        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[64];
        random.nextBytes(bytes);
        random.setSeed(bytes);
        logger.info("NextBytes Random Long: {}", random.nextLong());

        logger.info(" Random String: {}", RandomUtil.generateRandomAlphanumericString());
    }
}
