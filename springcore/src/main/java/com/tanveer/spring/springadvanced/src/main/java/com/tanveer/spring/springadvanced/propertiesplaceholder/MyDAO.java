package com.tanveer.spring.springadvanced.propertiesplaceholder;

public class MyDAO {
 private String dbServer;
 @Override
public String toString() {
	return "MyDAO [dbServer=" + dbServer + "]";
}
MyDAO(String dbServer){
	 this.dbServer = dbServer;
	 
 }
 
}
