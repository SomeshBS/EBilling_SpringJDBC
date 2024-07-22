package com.cts.handson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cts.handson.dao.EBillDAO;
import com.cts.handson.model.EBill;
import com.cts.handson.util.DateUtil;
@ComponentScan("com.cts.handson")
public class ElectricityBillApplication {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		//get dao bean
		//delete ebill
		System.out.format("%-5s %-15s %-10s %10s %5s %s\n", "Id","Consumer Id","Month","Reading","Unit","Amount");
		//display all bills
	}
}
