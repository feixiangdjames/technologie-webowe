package pl.javastart.paintcalc;

class Room {
    private int width;
    private int height;
    private int length;

    public Room(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int getWallArea() {
        return 2 * (width * height + length + height);
    }
}
