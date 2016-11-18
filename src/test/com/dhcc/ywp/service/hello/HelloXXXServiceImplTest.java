package com.dhcc.ywp.service.hello;

import static com.dhcc.ywp.TestContext.helloXXXContextByAnnotation;
import static com.dhcc.ywp.TestContext.helloXXXContextByXml;

import com.dhcc.ywp.service.hello.HelloXXXService;
import org.junit.Test;

/**
 * Created by cedo on 2016/11/7.
 * test com.dhcc.ywp.service.hello.HelloXXXServiceImpl
 */
public class HelloXXXServiceImplTest {

    //static public HelloXXXService helloXXXService = new HelloXXXServiceImpl();

    @Test
    public void testHello() {
        System.out.println(helloXXXContextByAnnotation.getBean(HelloXXXService.class).hello("cedo"));
        /**
         * with qualifiler
         */
        //out.println(((HelloXXXServiceImpl)(helloXXXContextByAnnotation.getBean("main"))).hello("cedo"));
    }

    @Test
    public void testHelloByXMLConfig() {
        System.out.println(
                helloXXXContextByXml.getBean(HelloXXXService.class).hello("cd")
        );

        //System.out.println(helloXXXContextByXml.getStartupDate());
    }
}
