import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Координаты первой точки:");
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        System.out.print("z: ");
        double z = scanner.nextDouble();

        Point3d point1 = new Point3d(x, y, z);

        System.out.println("Координаты второй точки:");
        System.out.print("x: ");
        x = scanner.nextDouble();
        System.out.print("y: ");
        y = scanner.nextDouble();
        System.out.print("z: ");
        z = scanner.nextDouble();

        Point3d point2 = new Point3d(x, y, z);

        System.out.println("Координаты третьей точки:");
        System.out.print("x: ");
        x = scanner.nextDouble();
        System.out.print("y: ");
        y = scanner.nextDouble();
        System.out.print("z: ");
        z = scanner.nextDouble();

        Point3d point3 = new Point3d(x, y, z);

        if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3)) {
            System.out.println("Точки совпадают");
        } else {
            System.out.println("Площадь треугольника: " + computeArea(point1, point2, point3));
        }

        System.out.println("Расстояние от 1 до 2 точки: "+point1.distanceTo(point2));
        System.out.println("Расстояние от 2 до 3 точки: "+point2.distanceTo(point3));
        System.out.println("Расстояние от 3 до 1 точки: "+point3.distanceTo(point1));
        System.out.println("Я починил");
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a = point1.distanceTo(point2);
        double b = point2.distanceTo(point3);
        double c = point3.distanceTo(point1);
        double p = (a + b + c) / 2;

        return Math.sqrt(Math.abs(p * (p - a) * (p - b) * (p - c)));
    }
}