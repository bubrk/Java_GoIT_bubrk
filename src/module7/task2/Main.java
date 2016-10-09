package module7.task2;

import module7.task1.Order;
import module7.task1.User;

import java.util.*;

/**
 * Create Main class where you create 10 Orders with 10 Users and put it to the List
 * <p>
 * - sort list by Order price in decrease order
 * - sort list by Order price in increase order AND User city
 * - sort list by Order itemName AND ShopIdentificator AND User city
 * <p>
 * - delete duplicates from the list
 * - delete items where price less than 1500
 * - separate list for two list - orders in USD and UAH
 * - separate list for as many lists as many unique cities are in User
 */
public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User(0, "Rayford", "Wegener", "London", 1000),
                new User(1, "Garfield", "Kinslow", "Kyiv", 2000),
                new User(2, "Dannie", "Poteete", "Kyiv", 1000),
                new User(3, "Dannie", "Poteete", "Kyiv", 1000),
                new User(4, "Charlette", "Delancey", "London", 2000),
                new User(5, "Kurtis", "Jessop", "Paris", 3000),
                new User(6, "Stewart", "Sobus", "Berlin", 4000),
                new User(7, "Kurtis", "Judy", "Amsterdam", 500),
                new User(8, "Sebrina", "Weatherall", "London", 1000),
                new User(9, "Sebrina", "Weatherall", "Kyiv", 1000)};
        List<User> userList = Arrays.asList(users);

        printList(userList);

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(0, 1000, Currency.getInstance("USD"), "Pencil", "Golden pen", userList.get(0)));
        orderList.add(new Order(1, 2000, Currency.getInstance("UAH"), "Pencil", "Golden pen", userList.get(1)));
        orderList.add(new Order(2, 3000, Currency.getInstance("UAH"), "Pencil", "Silver pen", userList.get(2)));
        orderList.add(new Order(3, 400, Currency.getInstance("UAH"), "Drill", "Prof-tools", userList.get(3)));
        orderList.add(new Order(4, 400, Currency.getInstance("USD"), "Cutters", "Prof-tools", userList.get(4)));
        orderList.add(new Order(5, 600, Currency.getInstance("USD"), "Screw driver", "Prof-tools", userList.get(5)));
        orderList.add(new Order(6, 1700, Currency.getInstance("USD"), "Tomato", "GreenTree", userList.get(6)));
        orderList.add(new Order(7, 1700, Currency.getInstance("USD"), "Tomato", "GreenTree", userList.get(6)));
        orderList.add(new Order(8, 1700, Currency.getInstance("USD"), "Cucumber", "GreenTree", userList.get(7)));
        orderList.add(new Order(9, 1100, Currency.getInstance("UAH"), "Pepper", "GreenTree", userList.get(9)));

        printList(orderList);

        System.out.println("-----------\nSorted list by Order price in decrease order:");
        printList(sortByPriseDecrease(orderList));

        System.out.println("-----------\nSorted list by Order price in increase order AND User city:");
        printList(sortByPriseCityIncrease(orderList));

        System.out.println("-----------\nSorted list by Order itemName AND ShopIdentificator AND User city:");
        printList(sortByItemShopCityIncrease(orderList));

        System.out.println("-----------\nAfter deleting duplicates from the list:");
        printList(deleteOrderDuplicates(orderList));

        System.out.println("-----------\nAfter deleting items where price less than 1500:");
        printList(deleteOrdersPriseLessThan1500(orderList));

        System.out.println("-----------\nOrders in USD:");
        printList(separateOrderByCurrency(orderList).get(0));

        System.out.println("-----------\nOrders in UAH:");
        printList(separateOrderByCurrency(orderList).get(1));

        Map<String, List<Order>> ordersByCities = separateOrderByCities(orderList);
        Set<String> cities = ordersByCities.keySet();
        for (String city : cities) {
            System.out.println("-----------\nOrders from " + city + ":");
            printList(ordersByCities.get(city));
        }

    }

    /**
     * Sorting list by Order price in decrease order
     */
    private static List<Order> sortByPriseDecrease(List<Order> list) {
        List<Order> sortedList = new ArrayList<>(list);

        Collections.sort(sortedList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return (o1.getPrice() > o2.getPrice() ? -1 :
                        (o1.getPrice() == o2.getPrice() ? 0 : 1));
            }
        });
        return sortedList;
    }

    /**
     * Sorting list by Order price in increase order AND User city
     */
    private static List<Order> sortByPriseCityIncrease(List<Order> list) {
        List<Order> sortedList = new ArrayList<>(list);

        Collections.sort(sortedList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return (o1.getPrice() < o2.getPrice() ? -1 :
                        (o1.getPrice() > o2.getPrice() ? 1 :
                                o1.getUser().getCity().compareTo(o2.getUser().getCity())));
            }
        });
        return sortedList;
    }

    /**
     * Sorting list by Order itemName AND ShopIdentificator AND User city
     */
    private static List<Order> sortByItemShopCityIncrease(List<Order> list) {
        List<Order> sortedList = new ArrayList<>(list);

        Collections.sort(sortedList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().compareTo(o2.getItemName()) != 0) {
                    return o1.getItemName().compareTo(o2.getItemName());
                } else if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) != 0) {
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                } else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });
        return sortedList;
    }

    /**
     * Deleting duplicates from the list
     */
    private static List<Order> deleteOrderDuplicates(List<Order> list) {
        List<Order> newList = new ArrayList<>();
        for (Order o1 : list) {
            boolean isInNewList = false;
            for (Order o2 : newList) {
                if (o1.equals(o2)) {
                    isInNewList = true;
                    break;
                }
            }
            if (!isInNewList) {
                newList.add(o1);
            }
        }
        return newList;

        /*Set<Order> set = new HashSet<>(list);
        return new ArrayList<>(set);*/
    }

    /**
     * Deleting items where price less than 1500
     */
    private static List<Order> deleteOrdersPriseLessThan1500(List<Order> list) {
        List<Order> newList = new ArrayList<>();
        for (Order o : list) {
            if (o.getPrice() >= 1500) {
                newList.add(o);
            }
        }
        return newList;
    }

    /**
     * Separating list for two lists - orders in USD and UAH
     */
    private static List<List<Order>> separateOrderByCurrency(List<Order> list) {
        List<Order> ordersUSD = new ArrayList<>();
        List<Order> ordersUAH = new ArrayList<>();
        for (Order order : list) {
            if (order.getCurrency() == Currency.getInstance("USD")) {
                ordersUSD.add(order);
            } else if (order.getCurrency() == Currency.getInstance("UAH")) {
                ordersUAH.add(order);
            }
        }

        List<List<Order>> result = new ArrayList<>();
        result.add(ordersUSD);
        result.add(ordersUAH);

        return result;
    }

    /**
     * Separating list for as many lists as many unique cities are in User
     */
    private static Map<String, List<Order>> separateOrderByCities(List<Order> list) {
        Map<String, List<Order>> result = new HashMap<>();
        for (Order order : list) {
            if (result.containsKey(order.getUser().getCity())) {
                result.get(order.getUser().getCity()).add(order);
            } else {
                result.put(order.getUser().getCity(), new ArrayList<>());
                result.get(order.getUser().getCity()).add(order);
            }
        }
        return result;
    }

    /**
     * Printing lists in console
     */
    private static void printList(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
