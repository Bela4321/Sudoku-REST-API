package com.sudokuSolve.restservice;

import com.sudokuSolve.solver.Sudoku;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SudokuSolveController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/sudokuSolve")
    public Solution sudokuSolve(@RequestParam(value = "sudoku", defaultValue = "0") String sudoku) {
        if (sudoku.length() != 9*9) {
            return new Solution(counter.incrementAndGet(), false, null, true);
        }
        int[][] initialMatrix = Util.StringToMatrix(sudoku);
        Long timer = System.nanoTime();
        int[][] solvedMatrix = Sudoku.solve(initialMatrix);
        timer = System.nanoTime() - timer;
        System.out.println("Solved in " + timer/1000000 + "ms");

        return new Solution(counter.incrementAndGet(), solvedMatrix != null, solvedMatrix, false);
    }

}
