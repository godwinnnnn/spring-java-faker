package com.vastik.spring.data.faker.enums;

public enum Address{
    
    BUILDING_NUMBER("address.buildingNumber"),
    CITY("address.city"),
    CITY_NAME("address.cityName"),
    CITY_PREFIX("address.cityPrefix"),
    CITY_SUFFIX("address.citySuffix"),
    COUNTRY("address.country"),
    COUNTRY_CODE("address.countyCode");
    Address(String s) {
    }
    public static void setPrefixName(String name){

    }

}
