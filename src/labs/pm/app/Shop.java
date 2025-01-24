/*
 * Copyright (c) 2025.
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/>
 */

package labs.pm.app;

import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

import java.math.BigDecimal;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @author bilal
 * @version 4.0
 */

public class Shop {
    public static void main(String[] args) {

        ProductManager pm = new ProductManager();

        Product p1 = pm.createProduct(101, "Tea",
                BigDecimal.valueOf(1.99), Rating.NOT_RATED);

        pm.printProductReport();

        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");

        pm.printProductReport();

//        Product p2 = pm.createProduct(102, "Coffee",
//                BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake",
//                BigDecimal.valueOf(3.99), Rating.FIVE_STAR,
//                LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99),
//                Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.TWO_STAR);
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p8);
//        System.out.println(p9);
//        Product p6 = pm.createProduct(104, "Chocolate",
//                BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        Product p7 =
//                pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99),
//                        Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        System.out.println(p6.equals(p7));
//        System.out.println(p3.getBestBefore());
//        System.out.println(p1.getBestBefore());
    }
}