package com.test.components;
import java.util.concurrent.*;

public class GameServer {
    private static final int MAX_THREADS = 10;  // Maximum concurrent threads
    private static final ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

    // Method to start a battle between two players
    public static void startBattle(String player1, String player2) {
        if (((ThreadPoolExecutor) executor).getActiveCount() >= MAX_THREADS) {
            // Check if the maximum number of threads are already in use
            System.out.println("Server is busy. Please try again later. Maximum battle threads are in use.");
            return;
        }

        // Define the battle task to be executed in a separate thread
        Callable<String> battleTask = () -> {
            try {
                System.out.println("Battle started between " + player1 + " and " + player2);

                // Simulate a battle with a 5-second timeout for both players
                if (simulateBattleWithTimeout(5)) {
                    return "Battle between " + player1 + " and " + player2 + " ended: Victory!";
                } else {
                    return "Battle between " + player1 + " and " + player2 + " ended: Timeout!";
                }
            } catch (InterruptedException e) {
                return "Battle between " + player1 + " and " + player2 + " was interrupted!";
            }
        };

        // Submit the battle task to the executor service
        Future<String> future = executor.submit(battleTask);

        try {
            // Wait for the result of the battle with a 5-second timeout
            String result = future.get(5, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (TimeoutException e) {
            System.out.println("Timeout occurred: Battle did not complete in time.");
            future.cancel(true);  // Cancel the battle if it exceeds the timeout
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Simulate the battle between two players with a timeout period
    private static boolean simulateBattleWithTimeout(int timeoutInSeconds) throws InterruptedException {
        // Simulate each player's action with a random delay
        Thread.sleep((long) (Math.random() * timeoutInSeconds * 1000));
        // Simulate whether the battle ends within the timeout period
        return true;  // Assuming the battle completes in time (true means victory)
    }

    // Shutdown the executor service gracefully when the server is done
    public static void shutdownServer() {
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}
