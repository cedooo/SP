package com.dhcc.ywp.service;

import static com.dhcc.ywp.TestContext.helloXXXContextByAnnotation;
import static com.dhcc.ywp.TestContext.helloXXXContextByXml;

import org.junit.Test;

/**
 * Created by cedo on 2016/11/7.
 * test com.dhcc.ywp.service.HelloXXXServiceImpl
 */
public class HelloXXXServiceImplTest {

    //static public HelloXXXService helloXXXService = new HelloXXXServiceImpl();

    @Test
    public void testHello() {
        System.out.println(
                helloXXXContextByAnnotation.getBean(HelloXXXService.class).hello("cedo")
        );
    }

    @Test
    public void testHelloByXMLConfig() {
        System.out.println(
                helloXXXContextByXml.getBean(HelloXXXService.class).hello("cd")
        );
    }
}
