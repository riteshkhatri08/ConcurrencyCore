package runnables;

class Job implements Runnable {

  // What happens when x is shared between 2 threads
  // Very unsafe to run it this way
  private int x = 0;
  @Override
  public void run() {
    System.out.println("Job starting");
    for (; x < 1_00; x++) {
      System.out.println(Thread.currentThread().getName() + " x is " + x);
    }
    System.out.println("Job ending");
  }
}

public class Example1 {
  public static void main(String[] args) {
    Job j = new Job();
    Thread tr = new Thread(j);
    Thread tr2 = new Thread(j);
    System.out.println("Starting the thread");
    tr.start();
    tr2.start();
    System.out.println("The thread has been started");
    System.out.println("main exiting");
  }
}

// Three Thing for multi threading
/*
 * Program Code to execute - Usually via Runnable
 * Data, something on memory 
 * Something like a cpu -  Threads
 */