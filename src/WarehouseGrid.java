import java.util.Random;

class Cell {
    private Shelf shelf;
    private Product product;

    public Cell() {
        this.shelf = null;
        this.product = null;
    }

    public boolean isEmpty() {
        return shelf == null && product == null;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean hasShelf() {
        return shelf != null;
    }

    public boolean hasProduct() {
        return product != null;
    }
}

class Shelf {
    private int startCell;
    private int endCell;

    public Shelf(int startCell, int endCell) {
        this.startCell = startCell;
        this.endCell = endCell;
    }

    public int getStartCell() {
        return startCell;
    }

    public int getEndCell() {
        return endCell;
    }
}

class Product {
    private int cellIndex;

    public Product(int cellIndex) {
        this.cellIndex = cellIndex;
    }

    public int getCellIndex() {
        return cellIndex;
    }
}

class WarehouseGrid {
    private static final int TOTAL_CELLS = 51;
    private static final int TOTAL_SHELVES = 5;
    private static final int TOTAL_PRODUCTS = 5;
    private static final int MIN_SHELF_LENGTH = 4;

    private Cell[] cells;
    private Shelf[] shelves;
    private Product[] products;

    public WarehouseGrid() {
        cells = new Cell[TOTAL_CELLS];
        shelves = new Shelf[TOTAL_SHELVES];
        products = new Product[TOTAL_PRODUCTS];
        Random rand = new Random();

        // 1. Create cells
        for (int i = 0; i < TOTAL_CELLS; i++) {
            cells[i] = new Cell();
        }

        // 2. Place shelves
        for (int i = 0; i < TOTAL_SHELVES; i++) {
            boolean placed = false;
            while (!placed) {
                int start = rand.nextInt(TOTAL_CELLS - MIN_SHELF_LENGTH - 1); // exclude last cell for start
                int maxEnd = Math.min(start + MIN_SHELF_LENGTH + rand.nextInt(5), TOTAL_CELLS - 2); // random shelf length 4+
                int end = maxEnd;

                // check if all cells are empty
                boolean canPlace = true;
                for (int j = start; j <= end; j++) {
                    if (!cells[j].isEmpty()) {
                        canPlace = false;
                        break;
                    }
                }

                if (canPlace) {
                    Shelf shelf = new Shelf(start, end);
                    shelves[i] = shelf;
                    for (int j = start; j <= end; j++) {
                        cells[j].setShelf(shelf);
                    }
                    placed = true;
                }
            }
        }

        // 3. Place products
        for (int i = 0; i < TOTAL_PRODUCTS; i++) {
            boolean placed = false;
            while (!placed) {
                int index = rand.nextInt(TOTAL_CELLS);
                if (cells[index].isEmpty()) {
                    Product product = new Product(index);
                    products[i] = product;
                    cells[index].setProduct(product);
                    placed = true;
                }
            }
        }
    }

    public Shelf[] getShelves() {
        return shelves;
    }

    public Product[] getProducts() {
        return products;
    }

    public Cell[] getCells() {
        return cells;
    }
}