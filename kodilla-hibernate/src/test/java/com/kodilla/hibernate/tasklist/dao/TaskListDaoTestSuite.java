package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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


}
