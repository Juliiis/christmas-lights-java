package gradle.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasLightsTest {
    @Test
    void check_if_the_initial_grid_is_modified_as_expected_with_the_toggle_grid_method(){
        //arrange
        int [][] initialGrid = {{0,0,0}, {0,0,0}, {0,0,0}};
        //int [][] gridExpected = {{1,1,0}, {1,1,0},{0,0,0}};

        //act
        ChristmasLights christmasLights = new ChristmasLights();
        christmasLights.toggleGrid(0, 0, 2, 2);


        //assert
        //assertEquals(gridExpected, initialGrid);
    }

}
