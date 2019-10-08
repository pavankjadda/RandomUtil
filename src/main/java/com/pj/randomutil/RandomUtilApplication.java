package com.pj.randomutil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.SecureRandom;

@SpringBootApplication
public class RandomUtilApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(RandomUtilApplication.class, args);

        System.out.println("Random Long: "+RandomUtil.getSecureRandomInstance().nextLong());

        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[64];
        random.nextBytes(bytes);
        random.setSeed(bytes);

        System.out.println("NextBytes Random Long: "+random.nextLong());

        System.out.println(" Random String: "+RandomUtil.generateRandomAlphanumericString());
    }
}
