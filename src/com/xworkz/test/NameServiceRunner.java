package com.xworkz.test;

import com.xworkz.test.event.NameService;
import com.xworkz.test.exception.InValidNameException;

public class NameServiceRunner {

	public static void main(String[] args) {
		

	NameService nameService= new NameService();
	try 
	{
	nameService.add("Kasturi");
	nameService.add("Kavya");
	nameService.add("Shilpa");
	nameService.add("@Shashi");
	nameService.add("#Prithvi");
	nameService.add("Sachin");
	
	}
	catch (InValidNameException e)
	{
		e.printStackTrace();
		
	}


	}
}