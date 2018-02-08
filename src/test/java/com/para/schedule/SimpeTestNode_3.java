/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.para.schedule;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author para
 */
public class SimpeTestNode_3 {

	public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Thread.sleep(Long.MAX_VALUE);
    }

}
