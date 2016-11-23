package com.dhcc.ywp.service.hello;

//import static com.dhcc.ywp.TestContext.helloXXXContextByAnnotation;
import static com.dhcc.ywp.TestContext.testContextByXml;

import org.junit.Test;

/**
 * Created by cedo on 2016/11/7.
 * test com.dhcc.ywp.service.hello.impl.HelloXXXServiceImpl
 */
public class HelloXXXServiceImplTest {

    /*
    @Test
    public void testHello() {
        //System.out.println(helloXXXContextByAnnotation.getBean(HelloXXXService.class).hello("cedo"));

        //out.println(((HelloXXXServiceImpl)(helloXXXContextByAnnotation.getBean("main"))).hello("cedo"));
    }
    */
    @Test
    public void testHelloByXMLConfig() {
        System.out.println(
                testContextByXml.getBean(HelloXXXService.class).hello("cd")
        );
    }

}
