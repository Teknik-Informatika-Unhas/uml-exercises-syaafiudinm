public class Students2 {
    private String NIM;
    private String Name;

    public Students2(String NIM, String Name){
        this.NIM  = NIM;
        this.Name = Name;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getNIM(){
        return NIM;
    }
    public String getName(){
        return Name;
    }
}
