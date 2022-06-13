package com.te.jacksonapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.jacksonapi.beans.Employee;

public class Unmarshalling {
	public static void main(String[] args) {
		String jsonCode = "{\r\n" + "  \"address\" : {\r\n" + "    \"addressLine01\" : \"Line01\",\r\n"
				+ "    \"addressLine02\" : \"Line02\"\r\n" + "  },\r\n" + "  \"employeeId\" : 1,\r\n"
				+ "  \"employeeAge\" : 22,\r\n" + "  \"employeeName\" : \"Name01\"\r\n" + "}";

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Employee employee = objectMapper.readValue(jsonCode, Employee.class);
			System.out.println("Java : \n" + employee);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
