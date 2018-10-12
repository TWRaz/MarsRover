/**
 * Created by mali on 10/12/18.
 */
public class RoverController {
    int boardX;
    int boardY;
    int currRovX;
    int currRovY;
    private Coordinates roverCoordinates;


    public RoverController(int boardX, int boardY){
        this.boardX = boardX;
        this.boardY = boardY;
    }


    public void setRoverPosition(int x, int y, char direction) {
        this.roverCoordinates = new Coordinates(x,y, direction);
    }


    public Coordinates getRoverCoordinates() {
        return roverCoordinates;
    }

    public void rotateLeft() {
        switch (roverCoordinates.direction) {
            case 'N':
                roverCoordinates.direction = 'W';
                break;
            case 'W':
                roverCoordinates.direction = 'S';
                break;
            case 'S':
                roverCoordinates.direction = 'E';
                break;
            case 'E':
                roverCoordinates.direction = 'N';
                break;
        }

    }

    public void rotateRight() {
        rotateLeft();
        rotateLeft();
        rotateLeft();
    }

    public static class Coordinates {
        public int x;
        public int y;
        public char direction;

        public Coordinates(int x, int y, char direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
    }


    public static enum Directions {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }
}
