package Practice1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Cell[] board = new Cell[20];

        // 1️⃣ Initialize cells
        for (int i = 0; i < board.length; i++) {
            board[i] = new Cell(i);
        }

        // 2️⃣ Place 2 ladders
        for (int i = 0; i < 2; i++) {
            int start = rand.nextInt(15); // pick start 0–14
            int end = start + 1 + rand.nextInt(4); // length 1–5
            boolean valid;
            // TODO: Check if start or end already has ladder/snake
            // 2️⃣ Place 2 ladders

                do {
                    valid = true;
                    start = rand.nextInt(15); // 0–14
                    end = start + 1 + rand.nextInt(4); // length 1–5

                    if (board[start].hasLadder() || board[start].hasSnake() ||
                            board[end].hasLadder() || board[end].hasSnake()) {
                        valid = false; // invalid, try again
                    }
                } while (!valid);

                board[start].ladder = new Ladder(start, end);
            }


        // 3️⃣ Place 2 snakes


    // 3️⃣ Place 2 snakes
      for (int i = 0; i < 2; i++) {
        boolean valid;
        int head = 0, tail = 0;
        do {
            valid = true;
            head = 5 + rand.nextInt(15); // 5–19
            tail = head - 1 - rand.nextInt(4); // length 1–5

            if (board[head].hasLadder() || board[head].hasSnake() ||
                    board[tail].hasLadder() || board[tail].hasSnake()) {
                valid = false; // invalid, try again
            }
        } while (!valid);

        board[head].snake = new Snake(head, tail);
    }

        // 4️⃣ Ppackage Practice1;
        //
        //import java.util.Random;
        //
        //public class Main {
        //    public static void main(String[] args) {
        //        Random rand = new Random();
        //        Cell[] board = new Cell[20];
        //
        //        // 1️⃣ Initialize cells
        //        for (int i = 0; i < board.length; i++) {
        //            board[i] = new Cell(i);
        //        }
        //
        //        // 2️⃣ Place 2 ladders
        //        for (int i = 0; i < 2; i++) {
        //            int start = rand.nextInt(15); // pick start 0–14
        //            int end = start + 1 + rand.nextInt(4); // length 1–5
        //            boolean valid;
        //            // TODO: Check if start or end already has ladder/snake
        //            // 2️⃣ Place 2 ladders
        //
        //                do {
        //                    valid = true;
        //                    start = rand.nextInt(15); // 0–14
        //                    end = start + 1 + rand.nextInt(4); // length 1–5
        //
        //                    if (board[start].hasLadder() || board[start].hasSnake() ||
        //                            board[end].hasLadder() || board[end].hasSnake()) {
        //                        valid = false; // invalid, try again
        //                    }
        //                } while (!valid);
        //
        //                board[start].ladder = new Ladder(start, end);
        //            }
        //
        //
        //        // 3️⃣ Place 2 snakes
        //
        //
        //    // 3️⃣ Place 2 snakes
        //      for (int i = 0; i < 2; i++) {
        //        boolean valid;
        //        int head = 0, tail = 0;
        //        do {
        //            valid = true;
        //            head = 5 + rand.nextInt(15); // 5–19
        //            tail = head - 1 - rand.nextInt(4); // length 1–5
        //
        //            if (board[head].hasLadder() || board[head].hasSnake() ||
        //                    board[tail].hasLadder() || board[tail].hasSnake()) {
        //                valid = false; // invalid, try again
        //            }
        //        } while (!valid);
        //
        //        board[head].snake = new Snake(head, tail);
        //    }
        //
        //        // 4️⃣ Print board info
        //        for (Cell c : board) {
        //            if (c.ladder != null) {
        //                System.out.println("Ladder: " + c.ladder.start + " -> " + c.ladder.end);
        //            }
        //            if (c.snake != null) {
        //                System.out.println("Snake: " + c.snake.head + " -> " + c.snake.tail);
        //            }
        //        }
        //    }
        //}
        //class Cell {
        //    int position;
        //    Snake snake;
        //    Ladder ladder;
        //
        //    public Cell(int position) {
        //        this.position = position;
        //    }
        //
        //    // TODO: Add hasSnake() and hasLadder() methods
        //
        //    public boolean hasSnake(){
        //        return snake !=null;
        //    }
        //
        //    public boolean hasLadder(){
        //        return ladder !=null;
        //    }
        //}
        //
        //class Snake {
        //    int head, tail;
        //    public Snake(int head, int tail) {
        //        this.head = head;
        //        this.tail = tail;
        //    }
        //}
        //
        //class Ladder {
        //    int start, end;
        //    public Ladder(int start, int end) {
        //        this.start = start;
        //        this.end = end;
        //    }
        //}rint board info
        for (Cell c : board) {
            if (c.ladder != null) {
                System.out.println("Ladder: " + c.ladder.start + " -> " + c.ladder.end);
            }
            if (c.snake != null) {
                System.out.println("Snake: " + c.snake.head + " -> " + c.snake.tail);
            }
        }
    }
}
class Cell {
    int position;
    Snake snake;
    Ladder ladder;

    public Cell(int position) {
        this.position = position;
    }

    // TODO: Add hasSnake() and hasLadder() methods

    public boolean hasSnake(){
        return snake !=null;
    }

    public boolean hasLadder(){
        return ladder !=null;
    }
}

class Snake {
    int head, tail;
    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }
}

class Ladder {
    int start, end;
    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

