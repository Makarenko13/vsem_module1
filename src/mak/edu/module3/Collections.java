package mak.edu;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module3
  @class  Collections
  @version  1.0.0
  @since 07.04.2021 - 17.12
*/

import mak.edu.collectionss.CafeOrdering;
import mak.edu.collectionss.CafeStandartLunch;
import mak.edu.collectionss.Interfaces.IAccounting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    List<IAccounting> list = new ArrayList<>(


            Arrays.asList(
                    new CafeStandartLunch("LunchEconom", 120, 2, 20),
                    new CafeStandartLunch("LunchStandart", 150, 2, 35),
                    new CafeStandartLunch("LunchStandart++", 180, 3, 100),
                    new CafeStandartLunch("LunchFamily", 175, 5, 75),
                    new CafeStandartLunch("BusinessLunch", 210, 2, 120),

                    new CafeOrdering("Soup", 100, 2, 25),
                    new CafeOrdering("Cheesecake", 120, 3, 50),
                    new CafeOrdering("Shrimps", 150, 1, 100),
                    new CafeOrdering("Coffee", 56, 2,25),
                    new CafeOrdering("Mash Potato", 25, 3, 20)
            )
    );


    double totalIncome = list.stream().mapToDouble(IAccounting::getUltimatePrice).sum();

    double mostExpensive = list.stream().mapToDouble(IAccounting::getUltimatePrice).max().getAsDouble();

    double cheapest = list.stream().mapToDouble(IAccounting::getUltimatePrice).min().getAsDouble();

    double average = list.stream().mapToDouble(IAccounting::getUltimatePrice).average().getAsDouble();

}

