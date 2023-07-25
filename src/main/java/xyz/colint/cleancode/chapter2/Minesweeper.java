package xyz.colint.cleancode.chapter2;

import java.util.ArrayList;
import java.util.List;


/**
 * minesweeper 扫雷游戏
 *
 * @author 丁浩
 * @date 2023年07月23日 15:49
 */

public class Minesweeper {

    private final List<Cell> gameBoard = new ArrayList<>();






//    private static final int STATUS_VALUE = 0;

    private static final int FLAGGED = 4;


    private Minesweeper() {

    }

    private Minesweeper(int x, int y) {
        // 初始化 x*y 扫雷棋盘，4表示已标记，标记位在索引0上
        for (int index = 0; index < x*y; index++) {
            // 随机一个 0-81 的数
            int random = (int) (Math.random() * 81);
            Cell cell = new Cell();
            if (index < random) {
                cell.setStatusValue(FLAGGED);
            }
            cell.setX(index%x);
            cell.setY(index/y);
            gameBoard.add(cell);
        }
    }

    public static Minesweeper initGameBoard(int x, int y){
        return new Minesweeper(x, y);
    }

    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }

}
