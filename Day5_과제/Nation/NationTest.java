package Day5_과제.Nation;

public class NationTest {
    public static void main(String[] args) {
        KOREA k = new KOREA();
        USA u = new USA();
        England e = new England();

        k.area = 10040129;
        k.name = "Korea";
        k.population = 51821669;
        System.out.println(k.toString());
        System.out.println("한국에서 유명한 음식 : " + k.food);

        u.area = 983151000;
        u.name = "USA";
        u.population = 332915074;
        System.out.println(u.toString()); 
        System.out.println("미국에서 인기있는 스포츠 : " + u.sports);

        e.area = 24361000;
        e.name = "England";
        e.population = 68207114;
        System.out.println(e.toString());
        System.out.println("영국에서 인기있는 스포츠 : " + e.sports);

    }
}
