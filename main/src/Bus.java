public class Bus {
    private int busId;
    private String startPoint;
    private String endPoint;
    private boolean busAvailable;
    private int busSpaces = 30;

    public void check() {
        if (this.busSpaces == 0) {
            this.busAvailable = false;
        }
    }


}
