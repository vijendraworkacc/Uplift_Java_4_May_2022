package com.te.learnjava8.designpattern.prototype;

public class Complex implements Cloneable {
	private int dataFromSensor1;
	private int dataFromSensor2;
	private int dataFromSensor3;
	private int dataFromSensor4;
	private int dataFromSensor5;
	private int dataFromSensor6;

	public Complex() {
		super();
	}

	public Complex(int dataFromSensor1, int dataFromSensor2, int dataFromSensor3, int dataFromSensor4,
			int dataFromSensor5, int dataFromSensor6) {
		super();
		this.dataFromSensor1 = dataFromSensor1;
		this.dataFromSensor2 = dataFromSensor2;
		this.dataFromSensor3 = dataFromSensor3;
		this.dataFromSensor4 = dataFromSensor4;
		this.dataFromSensor5 = dataFromSensor5;
		this.dataFromSensor6 = dataFromSensor6;
	}

	public int getDataFromSensor1() {
		return dataFromSensor1;
	}

	public void setDataFromSensor1(int dataFromSensor1) {
		this.dataFromSensor1 = dataFromSensor1;
	}

	public int getDataFromSensor2() {
		return dataFromSensor2;
	}

	public void setDataFromSensor2(int dataFromSensor2) {
		this.dataFromSensor2 = dataFromSensor2;
	}

	public int getDataFromSensor3() {
		return dataFromSensor3;
	}

	public void setDataFromSensor3(int dataFromSensor3) {
		this.dataFromSensor3 = dataFromSensor3;
	}

	public int getDataFromSensor4() {
		return dataFromSensor4;
	}

	public void setDataFromSensor4(int dataFromSensor4) {
		this.dataFromSensor4 = dataFromSensor4;
	}

	public int getDataFromSensor5() {
		return dataFromSensor5;
	}

	public void setDataFromSensor5(int dataFromSensor5) {
		this.dataFromSensor5 = dataFromSensor5;
	}

	public int getDataFromSensor6() {
		return dataFromSensor6;
	}

	public void setDataFromSensor6(int dataFromSensor6) {
		this.dataFromSensor6 = dataFromSensor6;
	}

	@Override
	public String toString() {
		return "Complex [dataFromSensor1=" + dataFromSensor1 + ", dataFromSensor2=" + dataFromSensor2
				+ ", dataFromSensor3=" + dataFromSensor3 + ", dataFromSensor4=" + dataFromSensor4 + ", dataFromSensor5="
				+ dataFromSensor5 + ", dataFromSensor6=" + dataFromSensor6 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dataFromSensor1;
		result = prime * result + dataFromSensor2;
		result = prime * result + dataFromSensor3;
		result = prime * result + dataFromSensor4;
		result = prime * result + dataFromSensor5;
		result = prime * result + dataFromSensor6;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		if (dataFromSensor1 != other.dataFromSensor1)
			return false;
		if (dataFromSensor2 != other.dataFromSensor2)
			return false;
		if (dataFromSensor3 != other.dataFromSensor3)
			return false;
		if (dataFromSensor4 != other.dataFromSensor4)
			return false;
		if (dataFromSensor5 != other.dataFromSensor5)
			return false;
		if (dataFromSensor6 != other.dataFromSensor6)
			return false;
		return true;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
