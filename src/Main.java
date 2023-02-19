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

    public static void task1 () {
        System.out.println("Задача 1");

        int a = 2_147_483_647;
        System.out.println("Значение переменной a с типом int равно " + a);

        byte b = -128;
        System.out.println("Значение переменной b с типом byte равно " + b);

        short c = 32_767;
        System.out.println("Значение переменной c с типом short равно " + c);

        long d = -9_223_372_036_854_775_808L;
        System.out.println("Значение переменной d с типом long равно " + d);

        float e = 3.4F;
        System.out.println("Значение переменной e с типом float равно " + e);

        double f = -1.758_965_896_576_55;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        float a = 27.12F;
        long b = 987_678_965_549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int classOfLyudmilaPavlovna = 23;
        int classOfAnnaSergeevna = 27;
        int classOfEkaterinaAndreevna = 30;
        int totalPaper = 480;

        int totalNumberOfStudents = classOfLyudmilaPavlovna + classOfAnnaSergeevna + classOfEkaterinaAndreevna;
        int paperForStudent = totalPaper / totalNumberOfStudents;

        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

    }

    public static void task4 () {
        System.out.println("Задача 4");

        int machinePerfomanceIn2Min = 16;
        int machinePerfomanceIn1Min = machinePerfomanceIn2Min / 2;
        int minutesInAnHour = 60;
        int hoursInADay = 24;
        int daysInAMonth = 30;

        int machinePerfomanceIn20Min = machinePerfomanceIn1Min * 20;
        System.out.println("За 20 минут машина произвела " + machinePerfomanceIn20Min + " штук бутылок");

        int machinePerfomancePerDay = hoursInADay * minutesInAnHour * machinePerfomanceIn1Min;
        System.out.println("За сутки машина произвела " + machinePerfomancePerDay + " штук бутылок");

        int machinePerfomanceIn3Days = 3 * hoursInADay * minutesInAnHour * machinePerfomanceIn1Min;
        System.out.println("За 3 дня машина произвела " + machinePerfomanceIn3Days + " штук бутылок");

        int machinePerfomanceForMonth = daysInAMonth * hoursInADay * minutesInAnHour * machinePerfomanceIn1Min;
        System.out.println("За месяц машина произвела " + machinePerfomanceForMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int totalCansOfPaint = 120;
        int cansOfWhitePaintFor1Class = 2;
        int cansOfBrownPaintFor1Class = 4;
        int totalCansOfPaintFor1Class = cansOfWhitePaintFor1Class + cansOfBrownPaintFor1Class;
        int totalClasses = totalCansOfPaint / totalCansOfPaintFor1Class;
        int totalCansOfWhitePaint = cansOfWhitePaintFor1Class * totalClasses;
        int totalCansOfBrownPaint = cansOfBrownPaintFor1Class * totalClasses;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalCansOfWhitePaint
                + " банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");

        double weightOfBananasInGrams = 5 * 80; // Бананы — 5 штук (1 банан — 80 грамм).
        double weightOfMilkInGrams = 2 * 105; // Молоко — 200 мл (100 мл = 105 грамм).
        double weightOfIceCreamInGrams = 2 * 100; // Мороженое-пломбир — 2 брикета по 100 грамм.
        double weightOfEggInGrams = 4 * 70; // Яйца сырые – 4 яйца (1 яйцо — 70 грамм)
        double breakfastWeightInGrams = weightOfBananasInGrams + weightOfMilkInGrams + weightOfIceCreamInGrams + weightOfEggInGrams;
        double breakfastWeightInKilograms = breakfastWeightInGrams / 1000;

        System.out.println("Вес спортзавтрака в граммах - " + breakfastWeightInGrams + "г");
        System.out.println("Вес спортзавтрака в килограммах - " + breakfastWeightInKilograms + "кг");
    }

    public static void task7 () {
        System.out.println("Задача 7");

        double weightToBeLostInGrams = 7000;
        double weightLossOption1 = 250;
        double weightLossOption2 = 500;
        double averageWeightLoss = (weightLossOption1 + weightLossOption2) / 2;

        double daysWeightLossOption1 = weightToBeLostInGrams / weightLossOption1;
        System.out.println("Если спортсмен будет терять каждый день по " + weightLossOption1 + " грамм, то на похудение" +
                " потребуется " + daysWeightLossOption1 + " дней");

        double daysWeightLossOption2 = weightToBeLostInGrams / weightLossOption2;
        System.out.println("Если спортсмен будет терять каждый день по " + weightLossOption2 + " грамм, то на похудение" +
                " потребуется " + daysWeightLossOption2 + " дней");

        double daysOnAerageWeightLoss = weightToBeLostInGrams / averageWeightLoss;
        System.out.println("Если спортсмен будет терять каждый день в среднем по " + averageWeightLoss + " грамм," +
                " то на похудение потребуется " + daysOnAerageWeightLoss + " дней");
    }

    public static void task8 () {
        System.out.println("Задача 8");

        double mashaCurrentSalary = 67760;
        double mashaSalaryAfterPromotion = mashaCurrentSalary + ((mashaCurrentSalary / 100) * 10);
        double mashaCurrentAnnualIncome = mashaCurrentSalary * 12;
        double mashaAnnualIncomeAfterPromotion = mashaSalaryAfterPromotion * 12;
        double mashaDifferenceInAnnualIncome = mashaAnnualIncomeAfterPromotion - mashaCurrentAnnualIncome;
        System.out.println("Маша теперь получает " + mashaSalaryAfterPromotion + " рублей. Годовой доход вырос на " +
                mashaDifferenceInAnnualIncome + " рублей");

        double denisCurrentSalary = 83690;
        double denisSalaryAfterPromotion = denisCurrentSalary + ((denisCurrentSalary / 100) * 10);
        double denisCurrentAnnualIncome = denisCurrentSalary * 12;
        double denisAnnualIncomeAfterPromotion = denisSalaryAfterPromotion * 12;
        double denisDifferenceInAnnualIncome = denisAnnualIncomeAfterPromotion - denisCurrentAnnualIncome;
        System.out.println("Денис теперь получает " + denisSalaryAfterPromotion + " рублей. Годовой доход вырос на " +
                denisDifferenceInAnnualIncome + " рублей");

        double kristinaCurrentSalary = 76230;
        double kristinaSalaryAfterPromotion = kristinaCurrentSalary + ((kristinaCurrentSalary / 100) * 10);
        double kristinaCurrentAnnualIncome = kristinaCurrentSalary * 12;
        double kristinaAnnualIncomeAfterPromotion = kristinaSalaryAfterPromotion * 12;
        double kristinaDifferenceInAnnualIncome = kristinaAnnualIncomeAfterPromotion - kristinaCurrentAnnualIncome;
        System.out.println("Кристина теперь получает " + kristinaSalaryAfterPromotion + " рублей. Годовой доход вырос на " +
                kristinaDifferenceInAnnualIncome + " рублей");
    }
}