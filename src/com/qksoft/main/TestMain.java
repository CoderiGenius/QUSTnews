package com.qksoft.main;

import java.util.Scanner;

import com.qksoft.entity.Customer;
import com.qksoft.service.CustomerService;
import com.qksoft.service.impl.CustomerServiceImpl;

public class TestMain {
	
	public static void main(String[] args) {
		
		System.out.println("��ӭ��½���ŷ���ϵͳ");
		
		System.out.println("������ͻ���");
		
		Scanner scanner=new Scanner(System.in);
		
		//1 �û�����ģ��
		
		String name=scanner.next();
		
		System.out.println("����������");
		
		String email=scanner.next();
		
		Customer customer=new Customer(name, email);
		
		
		CustomerService customerService=new CustomerServiceImpl();
		
		customerService.addCustomer(customer);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
