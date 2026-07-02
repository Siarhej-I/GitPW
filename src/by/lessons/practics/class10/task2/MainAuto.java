package by.lessons.practics.class10.task2;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1, "audi", 90000, 2020, 150, 14000);
        Auto auto2 = new Auto(2, "ford", 50000, 2023, 120, 16000);
        Auto auto3 = new Auto(3, "vw", 80000, 1999, 130, 13000);
        Auto auto4 = new Auto(4, "maz", 300000, 2015, 80, 15000);
        Auto auto5 = new Auto(5, "mercedes", 500000, 2000, 90, 1500);

        List<Auto> autoList = List.of(auto1, auto2, auto3, auto4, auto5);
        Optional<Auto> autoMaxSpeed = autoList.stream().max(Comparator.comparing(auto -> auto.getSpeed()));
        System.out.println("--------------\nМаксимальная скорость " + autoMaxSpeed.get().getSpeed() + " у машины " + autoMaxSpeed.get().getMark());

        Optional<Auto> autoMinSpeed = autoList.stream().min(Comparator.comparing(auto -> auto.getSpeed()));
        System.out.println("--------------\nМинимальная скорость " + autoMinSpeed.get().getSpeed() + " у машины " + autoMinSpeed.get().getMark());

        Optional<Auto> autoMaxOld = autoList.stream().min(Comparator.comparing(auto -> auto.getYear()));
        System.out.println("--------------\nСамая старая машина " + autoMaxOld.get().getMark() + " с " + autoMaxOld.get().getYear() + " года");

        Optional<Auto> autoMinOld = autoList.stream().max(Comparator.comparing(auto -> auto.getYear()));
        System.out.println("--------------\nСамая новая машина " + autoMinOld.get().getMark() + " с " + autoMinOld.get().getYear() + " года");

        List<Auto> betweenMile = autoList.stream().filter((auto) -> auto.getMile() > 50000 && auto.getMile() < 100000).toList();
        System.out.println("--------------\nВ диапозоне >50k и <100k пробега: \n" + betweenMile);

        Optional<Auto> autoMaxPrice = autoList.stream().max(Comparator.comparing(auto -> auto.getPrice()));
        System.out.println("--------------\nСамая дорогая машина " + autoMaxPrice.get().getMark() + " по цене " + autoMaxPrice.get().getPrice() + "$");

        Optional<Auto> autoMinPrice = autoList.stream().min(Comparator.comparing(auto -> auto.getPrice()));
        System.out.println("--------------\nСамая дешевая машина " + autoMinPrice.get().getMark() + " по цене " + autoMinPrice.get().getPrice() + "$");

        List<Auto> fromMinToMaxMile = autoList.stream().sorted(Comparator.comparing(auto -> auto.getMile())).toList();
        System.out.println("--------------\nСортировка по возрастанию пробега: \n" + fromMinToMaxMile);

        List<Auto> fromMaxToMinMile = autoList.stream().sorted(Comparator.comparing(auto -> auto.getMile())).toList().reversed();
        System.out.println("--------------\nСортировка по убыванию пробега: \n" + fromMaxToMinMile);

        List<Auto> fromMinToMaxPrice = autoList.stream().sorted(Comparator.comparing(auto -> auto.getPrice())).toList();
        System.out.println("--------------\nСортировка по возрастанию цены: \n" + fromMinToMaxPrice);

        List<Auto> fromMaxToMinPrice = autoList.stream().sorted((a1, a2) -> Integer.compare(a2.getPrice(), a1.getPrice())).toList();
        System.out.println("--------------\nСортировка по убыванию цены: \n" + fromMaxToMinPrice);

        List<Auto> betweenMileAndPrice = autoList.stream().filter((auto) -> (auto.getMile() > 50000 && auto.getMile() < 100000)
                && (auto.getPrice() > 10000 && auto.getPrice() < 20000)).toList();
        System.out.println("--------------\nВ диапозоне >50k и <100k пробега и >10k и 20k $: \n" + betweenMileAndPrice);

        List<Auto> uniqueAuto = autoList.stream().distinct().toList();
        System.out.println("--------------\nУникальные машины: \n" + uniqueAuto);

        System.out.println("Авто с множеством условий: \n" + between(autoList, 5000, 20000, "ford", 20000, 200000, 2000, 2015));
    }

    public static List<Auto> between(List<Auto> auto,
                                     int priceMin, int priceMax,
                                     String thisMark,
                                     int minMile, int maxMile,
                                     int minYear, int maxYear) {
        List<Auto> superAuto = auto.stream().filter((autoVal) ->
                (
                        (autoVal.getPrice() > priceMin && autoVal.getPrice() < priceMax) &&
                        autoVal.getMark().equals(thisMark) &&
                        (autoVal.getMile() > minMile && autoVal.getMile() < maxMile) &&
                        (autoVal.getYear() > minYear && autoVal.getYear() < maxYear))
                ).toList();
        if (superAuto.isEmpty()) {
            throw new RuntimeException("Авто не найдено!\n");
        }
        return superAuto;
    }
}



/*1.1 Создать коллекцию из авто.
1.2 Найти самую быструю машину.
1.3 Найти самую медленную машину.
1.4 Найти самую старую
1.5 Найти самую новую
1.6 Найти машины, у которых пробег от 50000 до 100000.
1.7 Найти самую дорогую машину.
1.8 Найти самую дешёвую машину.
1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000.
1.12 Получить не повторяющиеся значения марок авто (distinct).
1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега,
в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.*/