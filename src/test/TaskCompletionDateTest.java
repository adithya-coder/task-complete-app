package test;

import service.TaskCompletionDate;
import service.TaskCompletionDateImpl;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskCompletionDateTest {
    private static final TaskCompletionDate TaskCompletionDate = new TaskCompletionDateImpl();

    @org.junit.jupiter.api.Test
    void getCompletionDate() {
        LocalDate completionDates = TaskCompletionDate.getCompletionDate(LocalDate.of(2022, 8, 19), 5);
        assertEquals(LocalDate.of(2022, 8, 26), completionDates);
    }
}