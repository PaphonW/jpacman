package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {
    /**
     * Creates a new board.
     */
    private final Square[][] grid = new Square[1][1];
    private Board board;

    /**
     * Sets up the board.
     */
    @BeforeEach
    void setBoard() {
        this.grid[0][0] = new BasicSquare();
        this.board = new Board(grid);
    }
    /**
     * Check height of the board
     */
    @Test
    void checkHeightWidth() {
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }
    /**
     * Test a square.
     */
    @Test
    void testSquareAt() {
        // this.grid[0][0] = null;
        assertThat(board.squareAt(0, 0)).isNotNull();
    }
}
