public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println(" Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println(" Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println(" Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println(" Задача 4");
        var friend = 19;
        friend = friend * 2;
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println(" Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        frog = frog / 3.5;
    }

    public static void task6() {
        System.out.println(" Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println(boxer1Weight);
        System.out.println(boxer2Weight);
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух бойцов" + totalWeight);
        var differenceBetweenWeights = boxer2Weight - boxer1Weight;
        System.out.println("Разница между весами бойцов" + differenceBetweenWeights);
    }

    public static void task7() {
        System.out.println(" Задача 7");
        var athleteWeight = 82.7 / 78.2;
        System.out.println("Остаток веса" + athleteWeight + "кг !");
    }

    public static void task8() {
        System.out.println(" Задача 8");
        var timeAll = 640;
        var time = 8;
        var All = timeAll / time;
        var All2 = All + 94;
        System.out.println("Всего работников в компании - " + All + " человек");
        var time2 = timeAll / All2;
        System.out.println("Если в компании работает " + All2 + " человека, то всего" + All + "часа работы может быть поделено между сотрудниками");
    }

}
