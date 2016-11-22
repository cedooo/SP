package com.dhcc.ywp.po;

/**
 * Created by Administrator on 2016/11/19.
 * 国家
 */
public class Country {
    private String code;
    private String name;
    private String Continent;
    private String region;
    private String surfaceArea;
    private String indepYear;
    private String population;
    private String lifeExpectancy;
    private String GNP;
    private String GNPOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private String capital;
    private String code2;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public String getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(String indepYear) {
        this.indepYear = indepYear;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(String lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getGNP() {
        return GNP;
    }

    public void setGNP(String GNP) {
        this.GNP = GNP;
    }

    public String getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(String GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }


    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea='" + surfaceArea + '\'' +
                ", indepYear='" + indepYear + '\'' +
                ", population='" + population + '\'' +
                ", lifeExpectancy='" + lifeExpectancy + '\'' +
                ", GNP='" + GNP + '\'' +
                ", GNPOld='" + GNPOld + '\'' +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital='" + capital + '\'' +
                ", code2='" + code2 + '\'' +
                '}';
    }
}
