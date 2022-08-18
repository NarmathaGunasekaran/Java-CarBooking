public class Menu {
    private int id;
    private String places;

    public Menu() {
    }

    public Menu(int id, String places) {
        this.id = id;
        this.places = places;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }
}
