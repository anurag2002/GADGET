package mp3_class;

import gadget_class.gadget;

public class mp3 extends gadget 
{
    float price_m;
    int weight_m;
    String model_m, size_m;
    int memory;
    public mp3(float price_inp, int weight_inp, String model_inp, String size_inp, int memory_inp)
    {
        super(price, weight, model, size);
        this.price_m = price_inp;
        this.weight_m = weight_inp;
        this.model_m = model_inp;
        this.size_m = size_inp;
        this.memory = memory_inp;
    }

    public void download_music(int memory_req)
    {
        if(memory_req > memory)
        {
            System.out.println("\n********************************************\n");
            System.out.println("Not Enough Memory");
        }
        else
        {
            this.memory = this.memory - memory_req;
        }
    }

    public void delete_music(int memory_req)
    {
        this.memory = this.memory + memory_req;
    }

    public void display()
    {
        new gadget(price_m, weight_m, model_m, size_m).display();
        System.out.println("Available Memory: " + memory);
    }
    
}