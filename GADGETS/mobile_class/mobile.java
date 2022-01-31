package mobile_class;

import gadget_class.gadget;

public class mobile extends gadget 
{
    float price_m;
    int weight_m;
    String model_m, size_m;
    int calling_credit;
    public mobile(float price_inp, int weight_inp, String model_inp, String size_inp, int call_credit)
    {
        super(price, weight, model, size);
        this.price_m = price_inp;
        this.weight_m = weight_inp;
        this.model_m = model_inp;
        this.size_m = size_inp;
        this.calling_credit = call_credit;
    }
    
    public void add(int credit)
    {
        this.calling_credit = this.calling_credit + credit;
        System.out.println("\n********************************************\n");
        System.out.println("Credit Added");
    }
    
    public void make_call(String phn_no, int dur)
    {
        if(dur > calling_credit)
        {
            System.out.println("\n********************************************\n");
            System.out.println("Not Enough Credits to make a call");
        }
        else
        {
            this.calling_credit = this.calling_credit - dur;
            System.out.println("\n********************************************\n");
            System.out.println("Phone No: " + phn_no);
            System.out.println("Duration: " + dur);
        }
    }
        
    public void display()
    {
        new gadget(price_m,weight_m, model_m, size_m).display();
        System.out.println("Remaining Call Credits: " + calling_credit);
    }

}