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

    public static SecureRandom getSecureRandomInstance()
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



    public static long getSecureRandomLongValue()
    {
        return secureRandom.nextLong();
    }

    public static long getSecureRandomPositiveLongValue()
    {
        long secureRandomLongValue=getSecureRandomLongValue();
        return secureRandomLongValue < 0L ? -secureRandomLongValue : secureRandomLongValue;
    }

    public static int getSecureRandomIntegerValue()
    {
        return secureRandom.nextInt();
    }

    public static int getSecureRandomPositiveIntegerValue()
    {
        int secureIntegerValue=getSecureRandomIntegerValue();
        return secureIntegerValue < 0 ? -secureIntegerValue : secureIntegerValue;
    }

    public static String generateSecureRandomAlphanumericString()
    {
        return RandomStringUtils.random(DEF_COUNT, 0, 0, true, true, null, secureRandom);
    }
}
