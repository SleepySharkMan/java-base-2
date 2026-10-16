public class Visitor {
    private static int totalVisitors = 0;

    public Visitor(){
        totalVisitors += 1;
    }

    public int getTotalVisitors() {
        return totalVisitors;
    }
}
