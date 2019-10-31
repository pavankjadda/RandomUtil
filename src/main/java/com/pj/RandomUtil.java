package com.pj;

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
        long secureRandomLongValue=getSecureRandomLongValue();
        return secureRandomLongValue < 0L ? -secureRandomLongValue : secureRandomLongValue;
    }

    static int getSecureRandomIntegerValue()
    {
        return secureRandom.nextInt();
    }

    static int getSecureRandomPositiveIntegerValue()
    {
        int secureIntegerValue=getSecureRandomIntegerValue();
        return secureIntegerValue < 0 ? -secureIntegerValue : secureIntegerValue;
    }

    static String generateSecureRandomAlphanumericString()
    {
        return RandomStringUtils.random(DEF_COUNT, 0, 0, true, true, null, secureRandom);
    }
}
