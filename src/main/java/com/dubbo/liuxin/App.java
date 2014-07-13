package com.dubbo.liuxin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application_consumer.xml"});
    	
    	DataProvider dataProvider = (DataProvider) context.getBean("dataProvider");
    	
    	System.out.println(dataProvider.getData(2));
			
    }
}
