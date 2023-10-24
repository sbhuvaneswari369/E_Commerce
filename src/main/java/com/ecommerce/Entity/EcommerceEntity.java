package com.ecommerce.Entity;

import java.util.Date;

import com.ecommerce.Enum.Ecommerce;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ecommerce_Order_Table")
public class EcommerceEntity {
	@Id
	@GeneratedValue
	
	@Column(name = "Order_Id")
	private int orderId;
	
	@Column(name = "Customer_Name")
	private String customerName;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Order_Date")
	private Date orderDate;
	
	@Column(name = "Ecommerce_enum")
	@Enumerated(EnumType.STRING)
	private Ecommerce ecommerceProcess;
	
	@Column(name = "Total_Amount")
	private double totalAmount;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Ecommerce getEcommerceProcess() {
		return ecommerceProcess;
	}

	public void setEcommerceProcess(Ecommerce ecommerceProcess) {
		this.ecommerceProcess = ecommerceProcess;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	

	public EcommerceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EcommerceEntity(int orderId, String customerName, Date orderDate, Ecommerce ecommerceProcess,
			double totalAmount) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.ecommerceProcess = ecommerceProcess;
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "EcommerceEntity [orderId=" + orderId + ", customerName=" + customerName + ", orderDate=" + orderDate
				+ ", ecommerceProcess=" + ecommerceProcess + ", totalAmount=" + totalAmount + "]";
	}
	
	
	
	
	
	

}
