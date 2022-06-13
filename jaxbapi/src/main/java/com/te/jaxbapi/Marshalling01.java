package com.te.jaxbapi;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.jaxbapi.beans.Address;
import com.te.jaxbapi.beans.Employee;

public class Marshalling01 {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Employee employee = new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("Name01");
		employee.setEmployeeAge(22);
		
		Address address = new Address();
		address.setAddressLine01("Line01");
		address.setAddressLine02("Line02");
		
		employee.setAddress(address);

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter handler = new StringWriter();
			marshaller.marshal(employee, handler);

			System.out.println("XML: \n" + handler);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
