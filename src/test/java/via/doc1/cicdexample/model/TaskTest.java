package via.doc1.cicdexample.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTest {
    @Test
    public void ctorTest()
    {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }
}
