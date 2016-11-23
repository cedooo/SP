package com.dhcc.ywp.service.world;

import com.dhcc.ywp.TestContext;
import com.dhcc.ywp.po.Country;
import org.junit.Test;

import java.util.List;

/**
 * Created by cedo on 2016/11/18.
 * 测试WorldCountryServiceImpl
 */
public class WorldCountryServiceTest {

    @Test
    public void countries(){
        List<Country> countryList = TestContext.testContextByXml.getBean(WorldCountryService.class)
                .allCountry();
        countryList.forEach(System.out::println);
    }
}
