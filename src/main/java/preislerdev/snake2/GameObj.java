package preislerdev.snake2;

public interface GameObj {
    public int getX();
    public void setX(int x);
    public int getY();
    public void setY(int y);
    public int getW();
    public void setW(int w);
    public int getH();
    public void setH(int h);
    public void setXY(int x, int y);
    public void setWH(int w, int h);
}
