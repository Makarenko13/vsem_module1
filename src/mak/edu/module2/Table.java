package mak.edu.module2;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  Table
  @version  1.0.0
  @since 23.03.2021 - 23.24
*/

/*import java.util.Objects;

public class Table extends Rectangle{
    private String material;
    private String color;
    public String isHavingDrawers;

    public Table() {
    }

    public Table(int length, int width) {
        super(length, width);
    }

    public Table(int length, int width, String material, String color,
                 String isHavingDrawers) {
        super(length, width);
        this.material = material;
        this.color = color;
        this.isHavingDrawers = isHavingDrawers;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsHavingDrawers() {
        return isHavingDrawers;
    }

    public void setIsHavingDrawers(String isHavingDrawers) {
        this.isHavingDrawers = isHavingDrawers;
    }

    public int getTablesPrice() {

        int priceMaterial = 0;
        if (this.material == "Oak") {
            priceMaterial = 40000;
        } else if (this.material == "Pine") {
            priceMaterial = 15000;
        } else if (this.material == "Sawdust") {
            priceMaterial = 1000;
        } else {
            System.out.println("The product is out of stock. Please try again later.");
        }

        int priceColor ()

        priceColor = 0;
        if (this.color == "Black") {
            priceColor = 500;
        } else if (this.color == "Brown") {
            priceColor = 450;
        } else if (this.color == "Natural") {
            priceColor = 0;
        } else {
            System.out.println("Choose a custom color.");
        }


        int priceOfTableWithDrawers = 0;
        if (this.isHavingDrawers == true) {
            priceOfTableWithDrawers = 3000;

            return super.getArea() * (priceColor + priceOfTableWithDrawers + priceMaterial);
        }

    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", isHavingDrawers='" + isHavingDrawers + '\'' +
                '}';


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Table table = (Table) o;
        return getMaterial().equals(table.getMaterial()) && getColor().equals(table.getColor()) && getIsHavingDrawers().equals(table.getIsHavingDrawers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaterial(), getColor(), getIsHavingDrawers());
    }
}
*/