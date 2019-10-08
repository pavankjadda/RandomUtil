package com.pj.randomutil;

import java.security.SecureRandom;
import org.apache.commons.lang3.RandomStringUtils;

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

    static Long getRandomLongValue()
    {
        return secureRandom.nextLong();
    }

    static String generateRandomAlphanumericString()
    {
        return RandomStringUtils.random(DEF_COUNT, 0, 0, true, true, null, secureRandom);
    }
}
