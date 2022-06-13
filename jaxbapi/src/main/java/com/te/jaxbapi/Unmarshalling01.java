package com.te.jaxbapi;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.jaxbapi.beans.Employee;

public class Unmarshalling01 {
	public static void main(String[] args) {
		String xmlCode = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n" + "<employee>\r\n"
				+ "    <address>\r\n" + "        <addressLine01>Line01</addressLine01>\r\n"
				+ "        <addressLine02>Line02</addressLine02>\r\n" + "    </address>\r\n"
				+ "    <employee_age>22</employee_age>\r\n" + "    <employee_id>1</employee_id>\r\n"
				+ "    <employee_name>Name01</employee_name>\r\n" + "</employee>";

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(xmlCode);
			Employee employee = (Employee) unmarshaller.unmarshal(reader);

			System.out.println("Java : \n" + employee);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
