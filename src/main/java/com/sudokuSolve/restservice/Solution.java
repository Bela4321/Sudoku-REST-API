package com.sudokuSolve.restservice;

public record Solution(long id, boolean solvable, int[][] content, boolean encounteredError) {
}
