package Day5_과제.Nation;

public class Nation {
    // private String name;
    public String name;
    public int area;
    public int population;
    static String planet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Nation [area=" + area + "ha, name=" + name + ", population=" + population + "명]";
    }
}

class KOREA extends Nation {
    String food = "kimchi";

    void setFood(String food) {
        this.food = food;
    }

}

class USA extends Nation {
    String sports = "baseball";

    void Usa(String sports) {
        this.sports = sports;
    }

}

class England extends Nation {
    String sports = "soccer";

    void England(String sports) {
        this.sports = sports;
    }

}