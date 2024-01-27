public class Contador {
    static int count = 0;

    public Contador() {
        count++;
    }
    public static int incrementador(){
        return count++;
    }
    public static int zerarContador(){
        return count = 0;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Contador.count = count;
    }
}

