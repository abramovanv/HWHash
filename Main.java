import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Address, Integer> costPerAddress = new HashMap<>();
        Set<String> ss = new HashSet<>();
        int allPrice = 0;

        costPerAddress.put(new Address("Россия", "Москва"), 15);
        costPerAddress.put(new Address("Россия", "Хабаровск"), 2000);
        costPerAddress.put(new Address("Россия", "Хабаровск"), 3000);
        costPerAddress.put(new Address("Россия", "Новосибирск"), 1500);
        costPerAddress.put(new Address("США", "Нью-йорк"), 10000);

        for (Map.Entry<Address, Integer> cpa : costPerAddress.entrySet()) {
            System.out.println(cpa.getKey().getCountry() + " " + cpa.getKey().getCity() + " - " + cpa.getValue());
        }

        while (true) {

            System.out.println("Заполнение нового заказа.:");
            System.out.println("Введите страну:");
            String country = scanner.nextLine();
            if ("end".equals(country)) {
                break;
            }
            System.out.println("Введите город:");
            String city = scanner.nextLine();

            System.out.println("Введите вес (кг):");
            int weght = Integer.parseInt(scanner.nextLine());


            if (costPerAddress.get(new Address(country, city)) == null) {
                System.out.println("Доставки по этому адресу нет");
            } else {
                int priceDeliv = costPerAddress.get(new Address(country, city)) * weght;
                allPrice += priceDeliv;
                ss.add(country);
                System.out.println("Стоимость доставки составит: " + priceDeliv);
                System.out.println("Общая стоимость всех доставок: " + allPrice);
                System.out.println("Количество стран доставки: " + ss.size());
            }
        }
    }
}