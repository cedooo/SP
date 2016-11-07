package com.dhcc.ywp;

import com.dhcc.ywp.service.HelloXXXConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cedo on 2016/11/7.
 * test context for junit test
 */
public class TestContext {


    static public ApplicationContext helloXXXContextByAnnotation =
            new AnnotationConfigApplicationContext(HelloXXXConfig.class);

    static public ApplicationContext helloXXXContextByXml = new ClassPathXmlApplicationContext(
            new String[]{"helloContext.xml"}
    );

}
