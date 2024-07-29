import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("****************************************");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        JuniorDeveloper emp1 = new JuniorDeveloper(123456, "Şevval", 50000);
        JuniorDeveloper emp2 = new JuniorDeveloper((123457), "Melih", 60000);
        System.out.println(emp2);
        emp1.work();
        emp2.work();
        MidDeveloper emp3 = new MidDeveloper(123458, "Metin", 90000);
        System.out.println(emp3);
        emp3.work();
        SeniorDeveloper emp4 = new SeniorDeveloper(123459, "Aysel", 120000);
        System.out.println(emp4);
        emp4.work();
        HRManager emp5 = new HRManager(123455, "Bülent", 45000,
                new JuniorDeveloper[5], new MidDeveloper[4], new SeniorDeveloper[2] );
        System.out.println(emp5);
        emp5.work();
        emp5.addEmployee(emp1,0);
        emp5.addEmployee(emp2,1);
        emp5.addEmployee(emp3,0);
        emp5.addEmployee(emp4,0);
        System.out.println(emp5);
    }
}