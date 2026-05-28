package by.lessons.practics.class4.task1;

public class Vilage {
    /*1. Класс Деревня. Деревня будет состоять из построек.
    К постройкам относятся промышленные здания и гражданские.
    К промышленным зданиям будут относится заводы и фермы.
    К гражданским будут относится: административные здания, жилые здания. */
    private Building[] builds = new Building[0];


    /*2.5 Реализовать метод по подсчету общего количества зданий в деревне.*/
    public void addBuild(Building build) {
        Building[] newBuild = new Building[builds.length + 1];
        int i = 0;
        for (Building b : this.builds) {
            newBuild[i] = b;
            i++;
        }
        newBuild[newBuild.length - 1] = build;
        this.builds = newBuild;
    }

    public Building[] getBuilds() {
        Building[] getArray = new Building[builds.length];
        int i = 0;
        for (Building b : builds) {
            if (b != null) {
                getArray[i] = b;
                i++;
            }
        }
        return getArray;
    }

    public int countBuild() {
        int count = 0;
        for (Building b : builds) {
            if (b != null) {
                count++;
            }
        }
        return count;
    }

    public int countIndustrial() {
        int countIn = 0;
        for (Building b : builds) {
            if (b != null &&
                    (b.getClass().getSimpleName().equals("IndustrialBuilding") ||
                            b.getClass().getSimpleName().equals("Factory"))
            ) {
                countIn++;
            }
        }
        return countIn;
    }
}
