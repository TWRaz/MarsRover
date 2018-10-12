import apple.laf.JRSUIConstants;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by mali on 10/12/18.
 */
public class RoverControllerTest {

    @Test
    public void setRoverPosition_shouldAddRoverToGivenPosition() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'N');

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('N'));
    }

    //methodUnderTest_conditions_expectation

    @Test
    public void rotateLeft_whenRoverWasFacingNorth_shouldNowBeFacingWest() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'N');

        roverController.rotateLeft();

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        //assert
        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('W'));

    }

    @Test
    public void rotateLeft_whenRoverWasFacingWest_shouldNowBeSouth() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'W');

        roverController.rotateLeft();

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        //assert
        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('S'));

    }

    @Test
    public void rotateLeft_whenRoverWasFacingSouth_shouldNowBeEast() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'S');

        roverController.rotateLeft();

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        //assert
        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('E'));

    }

    @Test
    public void rotateLeft_whenRoverWasFacingEast_shouldNowBeNorth() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'E');

        roverController.rotateLeft();

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        //assert
        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('N'));

    }

    @Test
    public void rotateRight_whenRoverWasFacingNorth_shouldNowBeFacingEast() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'N');

        roverController.rotateRight();

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        //assert
        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('E'));

    }

    @Test
    public void rotateRight_whenRoverWasFacingWest_shouldNowBeNorth() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'W');

        roverController.rotateRight();

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        //assert
        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('N'));

    }

    @Test
    public void rotateRight_whenRoverWasFacingSouth_shouldNowBeWest() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'S');

        roverController.rotateRight();

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        //assert
        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('W'));

    }

    @Test
    public void rotateRight_whenRoverWasFacingEast_shouldNowBeSouth() throws Exception {
        RoverController roverController = new RoverController(10, 10);
        roverController.setRoverPosition(0,0, 'E');

        roverController.rotateRight();

        RoverController.Coordinates roverCoordinates = roverController.getRoverCoordinates();

        //assert
        assertThat(roverCoordinates.x, is(0));
        assertThat(roverCoordinates.y, is(0));
        assertThat(roverCoordinates.direction, is('S'));

    }




}