package by.lessons.practics.class4.task1;

public class MainBuilding {
    public static void main(String[] args) {
        /*2.1  Создать спортсооружение, исполком, 2 жилых дома, 2 фабрики Значения придумать самим.
        Добавить эти объекты в деревню (реализовать метод по добавлению постройки в деревню)
        (должны придумать,как это сделать)*/

        AdminBuilding sport = new AdminBuilding("Главная", "кирпич", 1975, "спорт", 2, "спортсооружение", 30);
        AdminBuilding ispolkom = new AdminBuilding("Последняя", "солома", 1905, "неизвестно", -1, "офисное", 0);

        CivilBuilding liveHome1 = new CivilBuilding("Лесная", "дерево", 2010, "жилое", 20);
        CivilBuilding liveHome2 = new CivilBuilding("Луговая", "камень", 2015, "жилое", 15);

        Factory factory1 = new Factory("Промышленная", "железобетон", 1953, "легкая", 100, "ткань");
        Factory factory2 = new Factory("Портовая", "железобетон", 1984, "тяжёлая", 300, "сталь");

        Vilage pvt = new Vilage();
        pvt.addBuild(sport);
        pvt.addBuild(ispolkom);
        pvt.addBuild(liveHome1);
        pvt.addBuild(liveHome2);
        pvt.addBuild(factory1);
        pvt.addBuild(factory2);

        /*2.2 Получить значение количества людей, которые могут находится в спортсооружении, созданном выше и вывести это в консоль (метод getter)*/
        System.out.println("На спорте " + sport.getNumberOfPeople() + " человек");

        /*2.3 Изменить количество людей, которые могут находится в спорртсооружении и вывести их в консоль после изменения (методы setter и getter) */
        sport.setNumberOfPeople(56);
        System.out.println("Теперь на спорте " + sport.getNumberOfPeople() + " человек");

        /*2.4 Реализовать метод по выводу информации о каждой постройке. */
        for (Building b : pvt.getBuilds()) {
            if (b != null) {
                System.out.println("\nЗдание " + b.getClass().getSimpleName() + " : " + b.toString());
            }
        }

        /*2.5 Реализовать метод по подсчету общего количества зданий в деревне.*/
        System.out.println("\nКоличество построек в деревне: " + pvt.countBuild());

        /*2.6 Посчитать количество промышленных зданий в деревне. И вывести информацию о этих зданиях.*/
        System.out.println("\nКоличество промышленных зданий: " + pvt.countIndustrial());
    }
}
