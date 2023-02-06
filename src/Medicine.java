

import java.util.ArrayList;

public class Medicine {
    private String name;
    private String price;
    private String dateOfExpiring;

    ArrayList<Medicine> medicines = new ArrayList<>();
    public Medicine(){
        this.name = "Paracetamol";
        this.price = "12.50";
        this.dateOfExpiring = "12/2/2023";
    }

    public Medicine(String name, String price, String dateOfExpiring) {
        this.name = name;
        this.price = price;
        this.dateOfExpiring = dateOfExpiring;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateOfExpiring() {
        return dateOfExpiring;
    }

    public void setDateOfExpiring(String dateOfExpiring) {
        this.dateOfExpiring = dateOfExpiring;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", dateOfExpiring='" + dateOfExpiring + '\'' +
                '}';
    }
}
