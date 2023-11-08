public class Person {
    protected String Name;
    protected String address;

    protected Person(){

    }
    protected void setName(String Name){
        this.Name = Name;
    }
    protected void setAddress(String address){
        this.address = address;
    }
    protected String getName(){
        return Name;
    }
    protected String getAddress(){
        return address;
    }
}
