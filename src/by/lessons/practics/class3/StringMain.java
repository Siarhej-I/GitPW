package by.lessons.practics.class3;

public class StringMain {
    public static void main(String[] args) {
        StringClass str1 = new StringClass();
        System.out.println(str1.stroka("I like Java!!!"));

        /*2. Распечатать последний символ строки. Используем метод String.charAt().*/
        String str2 = "I like Java!";
        char lastSym = str2.charAt(str2.length() - 1);
        System.out.println("Последний символ в строке '" + str2 + "' - '" + lastSym + "'");

        /*3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().*/
        System.out.println("Заканчивается ли строка '" + str2 + "' текстом 'java!' - " + str2.endsWith("java!"));

        /*4. Проверить, начинается ли ваша строка подстрокой “Добро пож”. Используем метод String.startsWith().*/
        String str4 = "Добро пожаловать или посторонним вход воспрещен!";
        System.out.println("Начинается ли строка '" + str4 + "' подстракой 'Добро пож' - " + str4.startsWith("Добро пож"));

        /*5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().*/
        System.out.println("Содержит ли строка '" + str2 + "' подстроку 'Java' - " + str2.contains("Java"));

        /*6. Найти позицию подстроки “Java” в строке “I like Java!!!”.*/
        System.out.println("Позиция подстроки 'Java' в строке '" + str2 + "' - " + str2.indexOf("Java"));

        /*7. Заменить все символы “о” на “а”. */
        System.out.println("В строке '" + str4 + "' заменяем все 'о' на 'а' - " + str4.replace("о", "а"));

        /*8. Преобразуйте строку к верхнему регистру.*/
        String str8 = str4.toUpperCase();
        System.out.println("Преобразуем строку '" + str4 + "' к верхнему регистру - " + str8);

        /*9. Преобразуйте строку к нижнему регистру.*/
        String str9 = str8.toLowerCase();
        System.out.println("Преобразуем строку '" + str8 + "' к нижнему регистру - " + str9);

        /* 10. Вырезать строку Java c помощью метода String.substring().*/
        String str10 = "I like Java!!!";
        String b = str10.substring(7, 11);
        System.out.println("Результат метода substring() - " + b);


    }
}
