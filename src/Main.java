public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 1 - задача 1:");
        var dog=8;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("ДЗ 1 - задача 2:");
        dog+=4;
        cat+=4;
        paper+=4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("ДЗ 1 - задача 3:");
        var dog1=8.0;
        dog1-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("ДЗ 2 - задача 4:");
        var friend=19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);
        System.out.println("ДЗ 2 - задача 5:");
        var frog=3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);
        System.out.println("ДЗ 3 - задача 6:");
        var fighter1Weight=78.2;
        var fighter2Weight=82.7;
        var totalWeight=fighter1Weight+fighter2Weight;
        System.out.println("Общий вес двух бойцов: "+totalWeight);
        var differenceWeight=fighter2Weight-fighter1Weight;
        System.out.println("Разница между весами двух бойцов: "+differenceWeight);
        System.out.println("ДЗ 3 - задача 7:");
        System.out.println("1.Разница между весами двух бойцов: "+(fighter2Weight-fighter1Weight));
        System.out.println("2.Разница между весами двух бойцов: "+(fighter2Weight%fighter1Weight));
        System.out.println("ДЗ 3 - задача 8:");
        var generalWorkingTime=640;
        var workingTimePerPerson=8;
        var totalNymberOfPeople=generalWorkingTime/workingTimePerPerson;
        System.out.println("1.Всего работников в компании - "+totalNymberOfPeople+" человек");
        totalNymberOfPeople+=94;
        var newGeneralWorkingTime=totalNymberOfPeople*workingTimePerPerson;
        System.out.println("2.Если в компании работает "+totalNymberOfPeople+" человека, то всего "+newGeneralWorkingTime+" часа работы может быть поделено между сотрудниками");


    }
}