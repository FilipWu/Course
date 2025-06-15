package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        TaskList taskList = new TaskList("Lista 1", DESCRIPTION);

        //given
        taskListDao.save(taskList);
        String taskListName = taskList.getListName();

        //when
        List<TaskList> taskLists = taskListDao.findByListName(taskListName);

        //then
        assertEquals("Lista 1", taskListName);

        //cleanUp
        int id = taskLists.get(0).getId();
        taskListDao.deleteById(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        Task task1 = new Task("Test: Learn Hibernate",14);
        Task task2 = new Task("Test: Write some entities",3);
        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(20),false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10),false);
        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("Name of List", "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        //
        taskListDao.save(taskList);
        int id = taskList.getId();

        //then
        assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }


}
