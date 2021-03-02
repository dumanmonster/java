public class Bus {
    private int busId;
    private String startPoint;
    private String endPoint;
    private boolean available;
    private int spaces = 30;

    public void check() {
        if (this.spaces == 0) {
            this.available = false;
        }
    }


}
