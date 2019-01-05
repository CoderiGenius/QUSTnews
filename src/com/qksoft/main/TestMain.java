package com.qksoft.main;

import java.util.Scanner;

import com.qksoft.entity.Customer;
import com.qksoft.service.CustomerService;
import com.qksoft.service.impl.CustomerServiceImpl;

public class TestMain {
	
	public static void main(String[] args) {
		
		System.out.println("欢迎登陆新闻发布系统");
		
		System.out.println("请输入客户名");
		
		Scanner scanner=new Scanner(System.in);
		
		//1 用户管理模块
		
		String name=scanner.next();
		
		System.out.println("请输入邮箱");
		
		String email=scanner.next();
		
		Customer customer=new Customer(name, email);
		
		
		CustomerService customerService=new CustomerServiceImpl();
		
		customerService.addCustomer(customer);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
