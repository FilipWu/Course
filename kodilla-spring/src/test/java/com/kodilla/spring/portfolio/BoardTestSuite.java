package com.kodilla.spring.portfolio;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testAddTask() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board) context.getBean(Board.class);

        board.toDoList.getTasks().add("Task to do");
        board.inProgressList.getTasks().add("Task in Progress");
        board.doneList.getTasks().add("Task done");

        assertEquals(1, board.toDoList.getTasks().size());
        assertEquals(1, board.inProgressList.getTasks().size());
        assertEquals("Task done", board.doneList.getTasks().get(0));
    }
}
