package com.pj;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;

/**
 *     @author Pavan K Jadda
 *     RandomUtil class generates secure and unsecured random string, integer, long and boolean values
 */
public class RandomUtil
{
    private static SecureRandom secureRandom;
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
        //Default constructor to hide public constructor
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

    public static boolean getSecureRandomBooleanValue()
    {
        return secureRandom.nextBoolean();
    }

    public static int getSecureRandomPositiveIntegerValue()
    {
        int secureIntegerValue=getSecureRandomIntegerValue();
        return secureIntegerValue < 0 ? -secureIntegerValue : secureIntegerValue;
    }

    public static String getSecureRandomAlphanumericString()
    {
        return RandomStringUtils.random(DEF_COUNT, 0, 0, true, true, null, secureRandom);
    }
}
