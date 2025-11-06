package pack;

public class Arr5 {
    int pdno;
    String pdname;
    int price;

    Arr5[] items = new Arr5[5];
    int count = 0;

    void add(int no, String name, int pr) {
        items[count] = new Arr5();
        items[count].pdno = no;
        items[count].pdname = name;
        items[count].price = pr;
        count++;
    }

    void delete(int no) {
        for (int i = 0; i < count; i++) {
            if (items[i].pdno == no) {
                items[i] = items[count - 1];
                count--;
                break;
            }
        }
    }

    void update(int no, String name, int pr) {
        for (int i = 0; i < count; i++) {
            if (items[i].pdno == no) {
                items[i].pdname = name;
                items[i].price = pr;
                break;
            }
        }
    }

    void show() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].pdno + " " + items[i].pdname + " " + items[i].price);
        }
    }

    public static void main(String[] args) {
        Arr5 a = new Arr5();
        a.add(1, "Pen", 10);
        a.add(2, "Book", 50);
        a.show();
        System.out.println("After updation!");
        a.update(1, "Marker", 15);
        a.delete(2);
        a.show();
    }
}