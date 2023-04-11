package preislerdev.snake2;

import java.util.List;
import java.util.Map;

public class Snake {
    private int x;
    private int y;
    private int w;
    private int h;
    private List<Map<Integer, Map<Integer, Integer>>> body;
    private int direction;

    public Snake(int x, int y, List<Map<Integer, Map<Integer, Integer>>> body, int direction) {
        this.x = x;
        this.y = y;
        this.body = body;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getDirection() {
        return direction;
    }
    public List<Map<Integer, Map<Integer, Integer>>> getBody() {
        return body;
    }
    public int getLength() {
        return body.size();
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void addNewBodyPart(int x, int y) {
        body.add(Map.of(getLength(), Map.of(x, y)));
    }
}
