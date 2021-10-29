package com.company;

public class Main {

    public static void main(String[] args) {
        int N = 5;
        Employee[] emplArray = new Employee[N];
        emplArray[0] = new Employee("Semenov Grigoriy Aleksandrovich", "Programmer", "fsf3@gmail.com",
                "89466435221", 120000, 26, false);
        emplArray[1] = new Employee("Gabidullin Dmitriy Grigorevich", "Programmer", "sgez5@gmail.com",
                "89443466271", 100000, 29, true);
        emplArray[2] = new Employee("Kuznecov Anatoliy Vladimirovich", "Manager", "gsew3@gmail.com",
                "89234784331", 80000, 32, true);
        emplArray[3] = new Employee("Borisova Darya Alekseevna", "Programmer", "jtjr45@gmail.com",
                "89534535781", 90000, 34, false);
        emplArray[4] = new Employee("Samigullina Alina  Timurovna", "Programmer", "jtyygxf7@gmail.com",
                "89487634321", 120000, 45, true);

        for (int i=0; i<N; i++){
            if (emplArray[i].vaccine)
            {
                emplArray[i].displayInfo();
            }
        }

    }

}
