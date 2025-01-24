package src.gr.aueb.cf.ch16.interfaces;

import src.gr.aueb.cf.ch16.interfaces.model.Customer;

public interface ICustomerDAO {
    void addCustomer(Customer customer);
    void updateCustomer(Long id, Customer customer);
    boolean removeCustomer(Long id);
    Customer getCustomerById(Long id);
    Customer getCustomerByPhoneNumber(String phoneNumber);
    Customer[] getCustomerByRegion(String region);
    Customer getCustomerByVat(String Vat);
}
