package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
   private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isTaskDone = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public void executeTask() {
        System.out.println("Buying " + quantity + " of " + whatToBuy);
        isTaskDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        return isTaskDone;
    }
}
