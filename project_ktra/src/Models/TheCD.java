package Models;

public class TheCD {
    private int id;
    private String name;
    private String date_create;
    private float price;
    private float number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_create() {
        return date_create;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public TheCD(int id, String name, String date_create, float price, float number) {
        this.id = id;
        this.name = name;
        this.date_create = date_create;
        this.price = price;
        this.number = number;
    }

    public void infoThongtin() {
        System.out.println("Id CD: "+ id);
        System.out.println("Tên CD: "+ name);
        System.out.println("Số lượng bài há: "+ date_create);
        System.out.println("Giá bài hát: "+ price);
        System.out.println("Số lượng bài há: "+ number);
    }
}
