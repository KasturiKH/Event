package com.xworkz.test.event;

import com.xworkz.test.exception.InValidNameException;

public class NameService {
	
	private String[] names = new String[10];
	private int nameIndex = 0;
	
	public NameService()
	{
		System.out.println("Created ".concat(this.getClass().getSimpleName()));
		
	}
	
	public boolean add(String name) throws InValidNameException
	{
		if(name != null) {
			if(!(name.length() > 3 && name.length() <= 50) || !name.matches("[A-z]"))
		System.out.println("Name is invalid " + name);
			throw new InValidNameException();
		}
		if (nameIndex < names.length)
		{
			this.names[this.nameIndex] = name;
			System.out.println("Name is present " + name);
			this.nameIndex++;
			return true;
		}
		System.out.println("Name not present " + name);
		return false;
	}
	

}
