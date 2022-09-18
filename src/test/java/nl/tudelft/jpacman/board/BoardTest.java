package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {
    private final Square[][] grid = new Square[1][1];
    private Board board;


    @BeforeEach
    void setBoard() {
        this.grid[0][0] = new BasicSquare();
        this.board = new Board(grid);
    }

    @Test
    void checkHeightWidth() {
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }

    @Test
    void testSquareAt() {
        // this.grid[0][0] = null;
        assertThat(board.squareAt(0, 0)).isNotNull();
    }
}
