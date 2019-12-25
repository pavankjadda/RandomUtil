package com.pj;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomUtilApplicationTest
{
    @Test
    public void contextLoads()
    {
        Assert.assertNotNull(RandomUtil.getSecureRandomInstance());
        System.out.println("Random String: "+RandomUtil.getSecureRandomAlphanumericString());
        System.out.println("Random getSecureRandomPositiveIntegerValue: "+RandomUtil.getSecureRandomPositiveIntegerValue());
        System.out.println("Random getSecureRandomPositiveLongValue: "+RandomUtil.getSecureRandomPositiveLongValue());
    }
}
