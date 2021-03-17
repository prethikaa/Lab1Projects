package day22;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		CustomerMasterDTO customermasterdto=new CustomerMasterDTO();
		customermasterdto.setCustomerno(3);
		customermasterdto.setCustomeraddress("tiruvallur");
		customermasterdto.setCustomeremail("drvrohith11@gmail.com");
		customermasterdto.setCustomername("rohith");
		customermasterdto.setCustomerphone("9080268964");
		CustomerMasterDAOImpl customermasterdaoimpl=new CustomerMasterDAOImpl(DBUtility.getConnection());
		customermasterdaoimpl.insertCustomer(customermasterdto);
		Set<CustomerMasterDTO> customerdetails=new HashSet<CustomerMasterDTO>();
		customerdetails=customermasterdaoimpl.getCustomerMasterAll();
		System.out.println(customerdetails);
		System.out.println(customermasterdaoimpl.getCustomerMaster(1));
		CustomerMasterDTO customermasterdtoupdate=new CustomerMasterDTO();
		customermasterdtoupdate.setCustomerno(3);
		customermasterdtoupdate.setCustomeraddress("tiruvallur");
		customermasterdtoupdate.setCustomeremail("drvrohith11@gmail.com");
		customermasterdtoupdate.setCustomername("roh");
		customermasterdtoupdate.setCustomerphone("9");
		customermasterdaoimpl.updateCustomer(customermasterdtoupdate);
		customermasterdaoimpl.deleteCustomer(3);
	}
}