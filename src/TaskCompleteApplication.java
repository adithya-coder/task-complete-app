import service.TaskCompletionDate;
import service.TaskCompletionDateImpl;

import java.time.LocalDate;
import java.util.logging.Logger;

/**
 * @author aditthya heshan
 *
 */
public class TaskCompleteApplication {
    static Logger logger = Logger.getLogger(TaskCompletionDateImpl.class.getName());
   private static TaskCompletionDate TaskCompletionDate = new TaskCompletionDateImpl();

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 8, 19);
        int numWorkingDays = 5;

        LocalDate completionDate = TaskCompletionDate.getCompletionDate(startDate, numWorkingDays);
        logger.info("Output: Completion Date of the Task :" + completionDate);


    }
}