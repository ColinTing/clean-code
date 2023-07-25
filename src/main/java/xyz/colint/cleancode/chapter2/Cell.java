package xyz.colint.cleancode.chapter2;

import lombok.Data;

/**
 * 单元格
 *
 * @author 丁浩
 * @date 2023年07月23日 16:26
 */
@Data
public class Cell {

    private static final int FLAGGED = 4;

    private int statusValue;

    private int x;

    private int y;
    public boolean isFlagged() {
        return statusValue == FLAGGED;
    }
}
