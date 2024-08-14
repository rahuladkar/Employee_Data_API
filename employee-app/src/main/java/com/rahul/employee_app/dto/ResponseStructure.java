package com.rahul.employee_app.dto;

public class ResponseStructure<T> {

	private int statusCode;
	private String mesage;
	private T data;
	
	// getter() and setter()

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
