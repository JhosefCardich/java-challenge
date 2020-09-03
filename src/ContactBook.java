import java.util.ArrayList;

public class ContactBook {
private ArrayList<Customer> customerList;


    public ContactBook() {
        this.customerList = new ArrayList<Customer>();
    }


    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    /***
     * Add a new contact to the agenda
     * @param newContact
     * @return
     */
    public boolean addContact(Customer newContact){
        return this.getCustomerList().add(newContact);
    }

    public boolean deleteContact(Customer contact){
        return this.getCustomerList().remove(contact);
    }

    public   ArrayList<Customer> searchContacts(String name){
        ArrayList<Customer> results = new ArrayList<Customer>();
        for (Customer contact : this.getCustomerList()){
            if(contact.getName().equals(name))
                results.add(contact);
        }
        return results;
    }

}
