package assignment;


class Customer extends User {
    

    public Customer(String name, int id) {
        super(name, id);
        
    }

   

 

    @Override
    public void getDetails() {
        System.out.println("Customer Name: " + getName() + ", ID: " + getId());
    }

    @Override
    public void setDetails(String name, int id) {
        setName(name);
        setId(id);
    }
}
