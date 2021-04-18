package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.dao.AllDetails;
import com.dao.CustomerDAO;
import com.dao.ExportBillDAO;
import com.dao.InvoiceDAO;
import com.dao.ItemDAO;
import com.dao.ItemtransactionDAO;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.model.Customer;
import com.model.Invoice;
import com.model.Item;
import com.model.Itemtransaction;

import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Service
@Transactional
public class ShopServiceImpl implements ShopService{

	@Autowired
	private ItemDAO itemDAO;
	
	@Autowired
	private InvoiceDAO invoiceDAO;
	
	@Autowired
	private ItemtransactionDAO itemtransactionDAO;
	
	@Autowired
	private CustomerDAO customerDAO;	
	
	@Autowired
	private ExportBillDAO exportBillDAO;
	
	

	public final ExportBillDAO getExportBillDAO() {
		return exportBillDAO;
	}

	public final void setExportBillDAO(ExportBillDAO exportBillDAO) {
		this.exportBillDAO = exportBillDAO;
	}

	public final CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public final void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public final ItemtransactionDAO getItemtransactionDAO() {
		return itemtransactionDAO;
	}

	public final void setItemtransactionDAO(ItemtransactionDAO itemtransactionDAO) {
		this.itemtransactionDAO = itemtransactionDAO;
	}

	public final InvoiceDAO getInvoiceDAO() {
		return invoiceDAO;
	}

	public final void setInvoiceDAO(InvoiceDAO invoiceDAO) {
		this.invoiceDAO = invoiceDAO;
	}

	public final ItemDAO getItemDAO() {
		return itemDAO;
	}

	public final void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

	@Override
	public List<Item> selectItemsByCategory(String category) {
		return itemDAO.selectItemsByCategory(category);
	}

	@Override
	public AllDetails createInvoice(int uid, HashMap<Integer,Integer> hm) {
		LocalDate myObj = LocalDate.now();
	    String strDate = myObj.toString(); 
	    
        System.out.println("Converted String: " + strDate);
        Invoice invoice = new Invoice();
        invoice.setCustomerno(uid);
        invoice.setInvdate(strDate);
        int invno = invoiceDAO.createInvoice(invoice);
        Itemtransaction itemtransaction;
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
            itemtransaction = new Itemtransaction();
            itemtransaction.setInvno(invno);
            itemtransaction.setItemno(entry.getKey());
            itemtransaction.setItemqty(entry.getValue());
            itemtransactionDAO.createItemtransaction(itemtransaction);
        }
        AllDetails allDetails = new AllDetails();
        HashMap<Item,Integer> itemhm = new HashMap<Item,Integer>();
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
        	Item item = itemDAO.getItemByID(entry.getKey());
        	itemhm.put(item, entry.getValue());
        }
        allDetails.setHm(itemhm);
        Customer customer=customerDAO.getcustomer(uid);
        allDetails.setCustomer(customer);
        
        allDetails.setDate(strDate);
        allDetails.setInvno(invno);
        return allDetails;
	}

	@Override
	public void createPDF(AllDetails allDetails) {
		int invno = allDetails.getInvno();
		String date = allDetails.getDate();
		exportBillDAO.createXML(invno, allDetails);
		exportBillDAO.createPDF(invno, date);
	}

	@Override
	public void createExcel(AllDetails allDetails) {
		int invno = allDetails.getInvno();
		String date = allDetails.getDate();
		exportBillDAO.createXML(invno, allDetails);
		exportBillDAO.createExcel(invno, date);
	}

	@Override
	public void sendMail(AllDetails allDetails) {
		int invno = allDetails.getInvno();
		String date = allDetails.getDate();
		String name = allDetails.getCustomer().getCustomerName();
		String email = allDetails.getCustomer().getCustomerEmail();
		exportBillDAO.createXML(invno, allDetails);
		exportBillDAO.sendMail(name,email,invno);
		
		
	}

	@Override
	public void sendSMS(AllDetails allDetails) {
		int invno = allDetails.getInvno();
		String date = allDetails.getDate();
		String phone = allDetails.getCustomer().getCustomerPhone();
		exportBillDAO.createXML(invno, allDetails);
		exportBillDAO.sendSMS(phone, allDetails);
		
	}

	

			
	
	
	
	
}
