package gadget_class;

public class gadget
{
    protected static float price;
    protected static int weight;
    protected static String model;
    protected static String size;
    public gadget(float price_inp, int weight_inp, String model_inp, String size_inp)
    {
        gadget.price = price_inp;
        gadget.weight = weight_inp;
        gadget.model = model_inp;
        gadget.size = size_inp;
    }

    public void display()
    {
        System.out.println("\n********************************************\n");
        System.out.println("Model of Mobile: " + model);
        System.out.println("Size of Mobile: " + size);
        System.out.println("Weight of Mobile: " + weight);
        System.out.println("Price of Mobile: " + price);
    }
}