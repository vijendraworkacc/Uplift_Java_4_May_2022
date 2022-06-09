package com.te.hibernatewithjpa.a.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeName;
	private int employeeAge;
	private long employeePn;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "s_fk")
	private SecoundryInfo secoundryInfo;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "b_fk")
	private Batch batch;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "map_e_t", joinColumns = @JoinColumn(name = "e_fk"), inverseJoinColumns = @JoinColumn(name = "t_fk"))
	private List<Technology> technologies = new ArrayList<>();
}
