package xyz.colint.cleancode;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.colint.cleancode.chapter2.GuessStatisticsMessage;
import xyz.colint.cleancode.chapter2.Minesweeper;

@SpringBootApplication
public class CleanCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanCodeApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Minesweeper minesweeper = Minesweeper.initGameBoard(9, 9);
        System.out.println(minesweeper.getFlaggedCells());

        GuessStatisticsMessage guessStatisticsMessage = GuessStatisticsMessage.getInstance();
        System.out.println(guessStatisticsMessage.make('s', 2));
    }

}
