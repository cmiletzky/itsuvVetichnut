package exer5;




      import static java.lang.Integer.parseInt;
      import static java.lang.Long.parseLong;

public class Customer {
    private long id;
    private String name;
    private int tier;

    public Customer(String customerInfo)
    {

        var linedata = customerInfo.split(" ");

        id = Long.parseLong(linedata[1]);
        name = linedata[3];
        tier = Integer.parseInt( linedata[5]);

    }

    public Customer(long Cid,String Cname, int Ctier)
    {
        setId(Cid);
        setName(Cname);
        setTier(Ctier);
    }

    public String toString()
    {
        return "customer: "+ getId() + " name: "+ getName() +" tier: "+ getTier()+"\n";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}