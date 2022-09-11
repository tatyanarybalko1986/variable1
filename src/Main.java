public class Main {
    public static void main(String[] args) {
        System.out.println ("Задание 1");
        var dog = 8.0;
        System.out.println (dog);
        dog = dog + 4;
        System.out.println (dog);
        dog = dog - 3.5;
        System.out.println (dog);

var cat = 3.6;
        System.out.println (cat);
        cat = cat + 4;
        System.out.println (cat);
       cat = cat - 1.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);
        paper = paper + 4;
        System.out.println (paper);
        paper = paper - 7639;
        System.out.println (paper);
        System.out.println ("Задание 2");
var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend/7;
        System.out.println (friend);
        var frog = 3.5;
        System.out.println (frog);
        frog = frog*10;
        System.out.println (frog);
        frog = frog/3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);
        System.out.println ("Задание 3");
        var boxer1Wight = 78.2;
        var boxer2Wight = 82.7;
        System.out.println ("Общий вес двух боксеров: " + (boxer1Wight + boxer2Wight));
        System.out.println ("Разница в весе боксеров: " + (boxer2Wight - boxer1Wight));
        System.out.println ("Разница в весе боксеров (1 способ): " + (boxer2Wight - boxer1Wight));
        System.out.println ("Разница в весе боксеров (2 способ): " + (boxer2Wight % boxer1Wight));
var totalWorkingHours = 640;
var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println ("Всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками");

    }

}