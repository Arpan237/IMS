package constructor.IMS;


public class DriverCode {
    public static void main (String [] args){

            Product appleMacBookAir =
                    new Product("Apple MacBook Air", "Laptop",
                            80000f, 60000f, 1000, true);

            Customer customer =
                    new Customer("2nd street", "Bengaluru",
                            "Karnataka", "Adrish Gupta",
                            "9090909090", "Adrish.gupta@gmail.com", 10);

            Vendor lenVenInfoHub = new Vendor("8th street", "Bengaluru",
                    "Karnataka", "Arpan", "1234567890",
                    "ah@gmail.com", "LenVen InfoHub");

            Order order1 = new Order(1, lenVenInfoHub, "26/10/2020", appleMacBookAir,
                    10, 10000);

            System.out.println(lenVenInfoHub.checkDue());
            System.out.println(lenVenInfoHub.getAddressDetails());
            System.out.println(customer.getAddressDetails());
        }
    }
