package com.spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class books {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column
private int price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column
private String bookname;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
}
