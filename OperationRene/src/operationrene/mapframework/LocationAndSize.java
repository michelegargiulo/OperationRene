package operationrene.mapframework;

// Class used to describe 2 parameters of an object: 
// Location and Size expressed with ints. X,Y refers to the Top-Left corner
public class LocationAndSize {
    
    private int xLocation;
    private int yLocation;
    private int width;
    private int height;

    public LocationAndSize(int xLocation, int yLocation, int width, int height) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.width = width;
        this.height = height;
    }

    public int getxLocation() {
        return xLocation;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}