class Customer {
  // class prototyping
  constructor(id, customerNumber) {
    this.id = id;
    this.customerNumber = customerNumber;
  }
}

class Individualcustomer extends Customer {
  constructor(firstName, id, customerNumber) {
    super(id, customerNumber);
    this.firstName = firstName;
  }
}

class CorporateCustomer extends Customer {
  constructor(companyName, id, customerNumber) {
    super(id, customerNumber);
    this.companyName = companyName;
  }
}

let customer = new Customer(1, 13123);
//instance prototyping
customer.name = "Enes";
console.log(customer.customerNumber);

// map, filter, reduce
