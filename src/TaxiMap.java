import java.util.EmptyStackException;

/*public class TaxiMap {
    private static final int mapSize = 9;
    private static final char empty = '.';
    private static final char taxiBody = 'T';
    private static final char user = 'P';

     private Point taxi;
     private Point User;

     private char[][] map;
     private Direction direction;

     public void TaxiStart(){
         taxi = new Point(1,1);
         map = new char[mapSize][mapSize];
         direction = Direction.Right;

         InitializeBoard();
         SpawnTaxi();
         SpawnUser();

     }

     private void InitializeBoard(){
         for (int i = 0; i< mapSize; i++){
             for(int j =0; j<mapSize; j++){

                 map[i][j] = empty;
             }
         }
    }

    private void spawnTaxi(){
         taxi.clear();
         int startX = mapSize / 2;
         int startY = mapSize / 2;

         taxi.add(new Point(startX,startY));
         map[startX][startY] = taxiBody;



    }


    // Method to place the food on the board
    private void spawnFood() {
        Random random = new Random();
        int foodX, foodY;


        // Generate random coordinates for the food until an empty cell is found
        do {
            foodX = random.nextInt(mapSize);
            foodY = random.nextInt(mapSize);
        } while (map[foodX][foodY] != EMPTY);


        // Place the food on the board
        User = new Point(foodX, foodY);
        map[foodX][foodY] = user;
    }


    // Method to print the current state of the board
    private void printBoard() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                // Print each cell of the board
                System.out.print(map[i][j] + " ");
            }
            // Move to the next line for the next row
            System.out.println();
        }
        // Add an extra line for better visibility
        System.out.println();
    }


    // Method to handle the snake's movement
    private void move() {
        Point head = taxi.getFirst();
        Point newHead = new Point(head.x, head.y);


        // Update the new head position based on the current direction
        switch (direction) {
            case UP:
                newHead.x = (newHead.x - 1 + mapSize) % mapSize;
                break;
            case DOWN:
                newHead.x = (newHead.x + 1) % mapSize;
                break;
            case LEFT:
                newHead.y = (newHead.y - 1 + mapSize) % mapSize;
                break;
            case RIGHT:
                newHead.y = (newHead.y + 1) % mapSize;
                break;
        }


        // Check if the new head position is the location of the food
        if (newHead.equals(User)) {
            // If so, add the new head to the snake and spawn new food
            taxi.addFirst(newHead);
            map[newHead.x][newHead.y] = taxiBody;
            spawnFood();
        } else {
            // If not, move the snake by removing the tail and adding the new head
            Point tail = taxi.removeLast();
            map[tail.x][tail.y] = EMPTY;


            // Check for collision with the snake's body
            if (map[newHead.x][newHead.y] == taxiBody) {
                gameOver();
            }


            // Add the new head to the snake and update the board
            taxi.addFirst(newHead);
            map[newHead.x][newHead.y] = taxiBody;
        }
    }


    // Method to handle the end of the game
    private void gameOver() {
        System.out.println("Game Over!");
        System.exit(0);
    }


    // Method to handle user input for changing the snake's direction
    private void handleInput() {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);


        // Update the direction based on user input
        switch (input) {
            case 'w':
                direction = Direction.UP;
                break;
            case 's':
                direction = Direction.DOWN;
                break;
            case 'a':
                direction = Direction.LEFT;
                break;
            case 'd':
                direction = Direction.RIGHT;
                break;
            default:
                System.out.println("Invalid input. Use 'w', 's', 'a', or 'd'.");
        }
    }


    // Main game loop
    public void run() {
        while (true) {
            // Display the current state of the board
            printBoard();
            // Handle user input
            handleInput();
            // Move the snake
            move();
        }
    }


    // Main method to start the game
    public static void main(String[] args) {
        // Create an instance of the SnakeGame and start the game loop
        TaxiMap taximap = new TaxiMap();
        taximap.run();
    }
}


// Enum to represent possible directions for the snake












}*/
