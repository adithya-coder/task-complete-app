package service;

import java.time.LocalDate;

/**
 * interface for  TaskCompletion
 *
 * @author adithya heshan
 */
public interface TaskCompletionDate {
    public  LocalDate getCompletionDate(LocalDate startDate, int numWorkingDays);
}
