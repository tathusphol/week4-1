package com.example.week41;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class customercontroller{
    private ArrayList<customer> customers;
    private boolean sex;
    public  customercontroller(){
        customers = new ArrayList<customer>();
        customers.add(new customer("1010", "John", true, 25));
        customers.add(new customer("1018", "Peter", true, 24));
        customers.add(new customer("1019", "Sara", false, 23));
        customers.add(new customer("1110", "Rose", false, 23));
        customers.add(new customer("1001", "Emma", false, 30));
    }
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<customer> getCustomers(){
        return this.customers;
    }
    @RequestMapping(value = "/customerbyid/{id}", method = RequestMethod.GET)
    public customer getCustomerByID(@PathVariable("id") String ID) {
        for (int i=0; i < this.customers.size(); i++)
        {
            if(this.customers.get(i).getID().equals(ID)){
                return this.customers.get(i);
            }
        }
        return customers.get(0);
    }
    @RequestMapping(value = "/customerbyname/{name}", method = RequestMethod.GET)
    public customer getCustomerByName(@PathVariable("name") String n){
        for (int i=0; i < this.customers.size(); i++)
        {
            if(this.customers.get(i).getName().equals(n)){
                return this.customers.get(i);
            }
        }
        return customers.get(0);
    }
    @RequestMapping(value = "/customerDelbyId/{id}", method = RequestMethod.DELETE)
    public boolean delCustomerID(@PathVariable("id") String ID){
        for (int i=0; i < this.customers.size(); i++)
        {
            if(this.customers.get(i).getID().equals(ID)){
                this.customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/customerDelbyName/{name}", method = RequestMethod.DELETE)
    public boolean delCustomerByName(@PathVariable("name") String n){
        for (int i=0; i < this.customers.size(); i++)
        {
            if(this.customers.get(i).getName().equals(n)){
                this.customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("id") String ID, @RequestParam("name") String n, @RequestParam("sex") String s, @RequestParam("age") int a){
        if(s.equals("Male") || s.equals("male")){
            this.sex = true;
        }
        else{
            this.sex = false;
        }
        if(a < 0){
            a = 0;
        }
        this.customers.add(new customer(ID, n, this.sex, a));
        return true;
    }
    @RequestMapping(value = "/addCustomer2", method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam("id") String ID, @RequestParam("name") String n, @RequestParam("sex") String s, @RequestParam("age") int a){
        if(s.equals("Male") || s.equals("male")){
            this.sex = true;
        }
        else{
            this.sex = false;
        }
        if(a < 0){
            a = 0;
        }
        this.customers.add(new customer(ID, n, this.sex, a));
        return true;
    }
}
