package module7.task3;

import module7.task1.Order;
import module7.task1.User;

import java.util.Currency;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet. You should create 8 unique and
 * two duplicated Orders
 * <p>
 * - check if set contain Order where User’s lastName is - “Petrov”
 * - print Order with largest price using only one set method - get
 * - delete orders where currency is USD using Iterator
 */
public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User(0, "Rayford", "Wegener", "London", 1000),
                new User(1, "Alexandr", "Petrov", "Kyiv", 2000),
                new User(2, "Dannie", "Poteete", "Kyiv", 1000),
                new User(3, "Dannie", "Poteete", "Kyiv", 1000),
                new User(4, "Charlette", "Delancey", "London", 2000),
                new User(5, "Kurtis", "Jessop", "Paris", 3000),
                new User(6, "Stewart", "Sobus", "Berlin", 4000),
                new User(7, "Kurtis", "Judy", "Amsterdam", 500),
                new User(8, "Sebrina", "Weatherall", "London", 1000),
                new User(9, "Sebrina", "Weatherall", "Kyiv", 1000)};

        //printList(userList);

        TreeSet<Order> orderSet = new TreeSet<>();
        orderSet.add(new Order(0, 1000, Currency.getInstance("USD"), "Pencil", "Golden pen", users[0]));
        orderSet.add(new Order(1, 2000, Currency.getInstance("UAH"), "Pencil", "Golden pen", users[1]));
        orderSet.add(new Order(2, 3000, Currency.getInstance("UAH"), "Pencil", "Silver pen", users[2]));
        orderSet.add(new Order(3, 400, Currency.getInstance("UAH"), "Drill", "Prof-tools", users[3]));
        orderSet.add(new Order(4, 400, Currency.getInstance("USD"), "Cutters", "Prof-tools", users[4]));
        orderSet.add(new Order(5, 600, Currency.getInstance("USD"), "Screw driver", "Prof-tools", users[5]));
        orderSet.add(new Order(6, 1700, Currency.getInstance("UAH"), "Potato", "GreenTree", users[6]));
        orderSet.add(new Order(7, 1700, Currency.getInstance("USD"), "Tomato", "GreenTree", users[7]));
        orderSet.add(new Order(8, 1700, Currency.getInstance("USD"), "Cucumber", "GreenTree", users[8]));
        orderSet.add(new Order(8, 1700, Currency.getInstance("USD"), "Cucumber", "GreenTree", users[8]));

        System.out.println("\nInitialised set:");
        printSet(orderSet);

        //getting order with largest prise
        System.out.println("\nOrder with largest prise:\n" + getLargestOrder(orderSet).toString());

        //deleting orders with USD currency
        System.out.println("\nOrders with USD currency were deleted\nSet after deleting:");
        printSet(deletingUSDOrders(orderSet));

    }

    /**
     * Finding Order with largest price using only one Set method - get(???)
     */
    private static Order getLargestOrder(TreeSet<Order> set) {

        //return set.last();

        return set.stream()
                .max((a, b) -> Integer.compare(a.getPrice(), b.getPrice()))
                .get();
    }

    /**
     * Deleting orders where currency is USD using Iterator
     */
    private static Set<Order> deletingUSDOrders(TreeSet<Order> set) {
/*        Set<Order> result = new TreeSet(set);
        Iterator iterator = result.iterator();
        while (iterator.hasNext()) {
            Order nextOrder = (Order) iterator.next();
            if (nextOrder.getCurrency() == Currency.getInstance("USD")) {
                iterator.remove();
            }
        }

        return result;*/

        return set.stream()
                .filter(order -> order.getCurrency() != Currency.getInstance("USD"))
                .collect(Collectors.toSet());
    }

    /**
     * Printing sets in console
     */
    private static void printSet(Set set) {
/*        for (Object o : set) {
            System.out.println(o);
        }*/
        System.out.println(set.stream()
                .reduce("", (a, b) -> a + "\n" + b));
    }
}
