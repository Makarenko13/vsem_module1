package mak.edu.collectionss;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module3
  @class  CafeStandartLunch
  @version  1.0.0
  @since 07.04.2021 - 16.56
*/

import mak.edu.collectionss.Interfaces.IAccounting;

import java.util.Objects;

public class CafeStandartLunch implements IAccounting {
    private String name;
    private double priceForLunch;
    private int amount;
    private double tips;

    public CafeStandartLunch() {
    }

    public CafeStandartLunch(String name, double priceForLunch,
                             int amount, double tips) {
        this.name = name;
        this.priceForLunch = priceForLunch;
        this.amount = amount;
        this.tips = tips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceForLunch() {
        return priceForLunch;
    }

    public void setPriceForLunch(double priceForLunch) {
        this.priceForLunch = priceForLunch;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
        CafeStandartLunch that = (CafeStandartLunch) o;
        return Double.compare(that.getPriceForLunch(), getPriceForLunch())
                == 0 && getAmount() == that.getAmount() && Double.compare(that.getTips(),
                getTips()) == 0 && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPriceForLunch(), getAmount(), getTips());
    }

    @Override
    public String toString() {
        return "CafeStandartLunch{" +
                "name='" + name + '\'' +
                ", priceForLunch=" + priceForLunch +
                ", amount=" + amount +
                ", tips=" + tips +
                '}';
    }

    @Override
    public double getUltimatePrice(){
        return this.getPriceForLunch() *
                this.getAmount() + this.getTips();
    }
}
