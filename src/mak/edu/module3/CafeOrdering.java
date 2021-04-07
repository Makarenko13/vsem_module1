package mak.edu.collectionss;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module3
  @class  CafeOrdering
  @version  1.0.0
  @since 07.04.2021 - 17.03
*/

import mak.edu.collectionss.Interfaces.IAccounting;

import java.util.Objects;

public class CafeOrdering implements IAccounting {

    private String name;
    private int quantityOfDishes;
    private double priceForDish;
    private double tips;

    public CafeOrdering(String soup, int i, int i1, int i2) {
    }


    public CafeOrdering(String cheesecake) {
        this.name = name;
        this.quantityOfDishes = quantityOfDishes;
        this.priceForDish = priceForDish;
        this.tips = tips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityOfDishes() {
        return quantityOfDishes;
    }

    public void setQuantityOfDishes(int quantityOfDishes) {
        this.quantityOfDishes = quantityOfDishes;
    }

    public double getPriceForDish() {
        return priceForDish;
    }

    public void setPriceForDish(double priceForDish) {
        this.priceForDish = priceForDish;
    }

    public double getTips() {
        return tips;
    }

    public void setTips(double tips) {
        this.tips = tips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CafeOrdering that = (CafeOrdering) o;
        return getQuantityOfDishes() == that.getQuantityOfDishes()
                && Double.compare(that.getPriceForDish(), getPriceForDish())
                == 0 && Double.compare(that.getTips(), getTips())
                == 0 && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getQuantityOfDishes(), getPriceForDish(),
                getTips());
    }

    @Override
    public String toString() {
        return "CafeOrdering{" +
                "name='" + name + '\'' +
                ", quantityOfDishes=" + quantityOfDishes +
                ", priceForDish=" + priceForDish +
                ", tips=" + tips +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return this.getPriceForDish() * this.getQuantityOfDishes()
                + this.getTips();
    }
}
