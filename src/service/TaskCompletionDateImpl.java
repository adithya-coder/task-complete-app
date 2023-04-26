package service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.logging.Logger;

/**
 * for  TaskCompletion business logic implementation
 *
 * @author adithya heshan
 */
public class TaskCompletionDateImpl implements TaskCompletionDate {
    // List of public holidays
    private static final HashSet<LocalDate> publicHolidays = new HashSet<>();
    static Logger logger = Logger.getLogger(TaskCompletionDateImpl.class.getName());

    public TaskCompletionDateImpl() {
        publicHolidays.add(LocalDate.of(2022, 8, 23)); // Add more public holidays if needed
    }

    /**
     * Calculate Task Completion Date
     *
     * @param startDate
     * @param numWorkingDays
     * @return LocalDate
     */
    @Override
    public  LocalDate getCompletionDate(LocalDate startDate, int numWorkingDays) {
        logger.info("call getCompletionDate method.....");
        int count = 0;
        LocalDate currDate = startDate;
        logger.info("set StatDate : " + currDate);
        while (count < numWorkingDays) {
            if (currDate.getDayOfWeek() != DayOfWeek.SATURDAY && currDate.getDayOfWeek() != DayOfWeek.SUNDAY && !publicHolidays.contains(currDate)) {
                count++;
            }
            currDate = currDate.plusDays(1);
        }
        logger.info("end of method...");
        // Return the completion date
        return currDate.minusDays(1);
    }
}
