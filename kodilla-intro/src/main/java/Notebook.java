public class Notebook {

    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 500) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 1000 && this.price < 1500) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight == "600g") {
            System.out.println("This unit is light!");
        } else if (this.weight == "1600g") {
            System.out.println("This unit is in standard weight!");
        } else if (this.weight == "2000g") {
            System.out.println("This unit is heavy!");
        } else {
            System.out.println("There aren't any notebooks in that weigh");
        }
    }

    public void checkYear() {
        if (this.year < 2006 && this.price < 501) {
            System.out.println("This notebook is old and cheap!");
        } else if (this.year > 2005 && this.price > 500 && this.year < 2015 && this.price < 1500) {
            System.out.println("This notebook is in good price and not old");
        } else if (this.year > 2014 && this.price > 1499) {
            System.out.println("This notebook is new and expensive");
        } else {
            System.out.println("This notebook is unique!");
        }
    }
}