package document_3_novikova;

public class Room {
    private double length;
    private double width;
    private double height;

    public Room(){
        length = 10.5;
        width = 6.4;
        height = 3.1;
    }

    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Room(double length) {
        this.length = length;
        width = length;
        height = 3.1;
    }

    public double totalArea() {
        return length * height + width * height;
    }

    public double onlyWallsArea(){
        double door = 2 * 15;
        double window = 2 * 8;
        return  totalArea() - door - window;
    }

    public void getInfo() {
        System.out.printf("Длина: %.2f м\nШирина: %.2f м\n" +
                        "Высота: %.2f м\nПлощадь стен (вместе с окнами и дверьми): %.2f м^2\nПлощадь стен без окна и двери: %.2f м^2\n\n",
                length, width, height, totalArea(), onlyWallsArea());
    }

    public static void makeRooms() {
        Room r = new Room(17,8, 3);
        r.getInfo();
    }
}
