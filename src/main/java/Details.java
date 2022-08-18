public class Details {
    private String name;
    private String model;
    private String no;
    private int cost;

    public Details() {
    }

    public Details(String name, String model, String no, int cost) {
        this.name = name;
        this.model = model;
        this.no = no;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}