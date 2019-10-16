package com.pj.randomutil;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;

public class RandomUtil
{
    private static SecureRandom secureRandom=null;
    private static final int DEF_COUNT = 20;

    static
    {
        secureRandom=new SecureRandom();
        byte[] bytes = new byte[64];
        secureRandom.nextBytes(bytes);
        secureRandom.setSeed(bytes);
    }

    private RandomUtil()
    {
        //Singleton constructor
    }

    static SecureRandom getSecureRandomInstance()
    {
        if(secureRandom==null)
        {
            secureRandom=new SecureRandom();
            byte[] bytes = new byte[64];
            secureRandom.nextBytes(bytes);
            secureRandom.setSeed(bytes);
        }
        return secureRandom;
    }

    static long getSecureRandomLongValue()
    {
        return secureRandom.nextLong();
    }

    static long getSecureRandomPositiveLongValue()
    {
        return Math.abs(secureRandom.nextLong());
    }

    static int getSecureRandomIntegerValue()
    {
        return secureRandom.nextInt();
    }

    static int getSecureRandomPositiveIntegerValue()
    {
        return Math.abs(secureRandom.nextInt());
    }

    static String generateSecureRandomAlphanumericString()
    {
        return RandomStringUtils.random(DEF_COUNT, 0, 0, true, true, null, secureRandom);
    }
}
