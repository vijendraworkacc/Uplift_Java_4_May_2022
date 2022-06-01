package com.te.springcore.springcorea.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.jws.HandlerChain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee implements InitializingBean, DisposableBean {
	private String employeeName;
	private Integer employeeId;
	private int employeeAge;
	private List<String> employeeCollegue;
	private Set<String> employeeManager;
	private Map<String, Integer> employeeTechRating;

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() called!");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() called!");

	}
}
