package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass){
            case SHOPPING -> new ShoppingTask("grocery shopping", "Bread", 2);
            case PAINTING -> new PaintingTask("Wall painting","Beige", "Livingroom");
            case DRIVING -> new DrivingTask("Taxi drive","Home", "Skoda fabia");
            default -> null;
            };
        }
}
