package com.ja.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
//@WebListener
public class TestListener implements ServletContextListener {


    public TestListener() {
        // TODO Auto-generated constructor stub
    }


    public void contextDestroyed(ServletContextEvent sce)  { 

      	System.out.println("11111");
    }


    public void contextInitialized(ServletContextEvent sce)  { 

    	System.out.println("22222");
    }
	
}