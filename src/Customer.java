public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phone;

   public Customer(int customerId , String name , String email, String phone){
        this.customerId=customerId;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public int getId(){ // get id

        return customerId;
    }
    public void setName(String name){ // Set Name

        this.name=name;
    }
    public String getName(){ // Get Name
        return name;
    }

    public String getEmail() { // Get email
        return email;
    }

    public void setEmail(String email) { // set Email

        this.email = email;
    }

    public String getPhone() { // Get Phone

        return phone;
    }

    public void setPhone(String phone) {
        // Set Phone
        this.phone = phone;
    }

    void customerInformation(){
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
