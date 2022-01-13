package day33_Static;

public class Address {

    public String city,state;
    public String street;
    public int zipCode;

    public static String country = "Turkey ";
    public static String planet = "Earth ";

    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public Address(String city, String state, String street, int zipCode) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.zipCode = zipCode;
    }
}


/*
1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012


 */