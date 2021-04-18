package com.dao;


public interface ExportBillDAO {
	public void createXML(int invno,AllDetails alldetails);
	public void createPDF(int invno,String invdate);
	public void createExcel(int invno,String invdate);
	public void sendMail(String name,String email,int invno);
	public void sendSMS(String phone,AllDetails alldetails);
}
