package homework.homework24;

public class Monitor {

    private boolean loaderIsAlive;
    private boolean transportIsAlive;
    private boolean unloaderIsAlive;
    private boolean heapOneisEmpty;
    private boolean heapTwoisEmpty;
    private boolean barrowIsEmpty;


    public Monitor() {
        this.loaderIsAlive = true;
        this.transportIsAlive = true;
        this.unloaderIsAlive = true;
        this.heapOneisEmpty = false;
        this.heapTwoisEmpty = true;
        this.barrowIsEmpty = false;
    }

    public boolean isLoaderIsAlive() {
        return loaderIsAlive;
    }

    public void setLoaderIsAlive(boolean loaderIsAlive) {
        this.loaderIsAlive = loaderIsAlive;
    }

    public boolean isUnloaderIsAlive() {
        return unloaderIsAlive;
    }

    public void setUnloaderIsAlive(boolean unloaderIsAlive) {
        this.unloaderIsAlive = unloaderIsAlive;
    }

    public boolean isHeapOneisEmpty() {
        return heapOneisEmpty;
    }

    public void setHeapOneisEmpty(boolean heapOneisEmpty) {
        this.heapOneisEmpty = heapOneisEmpty;
    }

    public boolean isHeapTwoisEmpty() {
        return heapTwoisEmpty;
    }

    public void setHeapTwoisEmpty(boolean heapTwoisEmpty) {
        this.heapTwoisEmpty = heapTwoisEmpty;
    }

    public boolean isBarrowIsEmpty() {
        return barrowIsEmpty;
    }

    public void setBarrowIsEmpty(boolean barrowIsEmpty) {
        this.barrowIsEmpty = barrowIsEmpty;
    }

    public boolean isTransportIsAlive() {
        return transportIsAlive;
    }

    public void setTransportIsAlive(boolean transportIsAlive) {
        this.transportIsAlive = transportIsAlive;
    }
}
