package preislerdev.snake2;

import java.util.List;
import java.util.Map;

public class Snake implements GameObj {
    private int x;
    private int y;
    private int w;
    private int h;
    private List<Map<Integer, Map<Integer, Integer>>> body;
    private int direction;

    public Snake(int x, int y, int direction) {
        this.x = x;
        this.y = y;
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
    public void setDirection(int direction) {
        this.direction = direction;
    }
    public void addNewBodyPart(int x, int y) {
        body.add(Map.of(getLength(), Map.of(x, y)));
    }

    public void move() {
        switch (direction) {
            case 0:
                y--;
                body.forEach(part -> {
                    part.forEach((index, pos) -> {
                        if (index == 0) {
                            pos.put(x, y);
                        } else {
                            pos.put((Integer) part.get(index - 1).keySet().toArray()[0], (Integer) part.get(index - 1).values().toArray()[0]);
                        }
                    });
                });
            case 1:
                x++;
                break;
            case 2:
                y++;
                break;
            case 3:
                x--;
                break;
        }
    }
}
