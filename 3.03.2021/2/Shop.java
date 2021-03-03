package pl.Skalinski;

public class Shop {
    protected String address;
    protected String size;

    public String info(){
        return "Size " + size + "Address" + address;
    }
    public Shop getInformation(){
        return new Shop();
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
}
