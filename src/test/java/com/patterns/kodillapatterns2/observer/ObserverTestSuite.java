package com.patterns.kodillapatterns2.observer;

import com.patterns.kodillapatterns2.observer.homework.Mentor;
import com.patterns.kodillapatterns2.observer.homework.Task;
import com.patterns.kodillapatterns2.observer.homework.TaskQueue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObserverTestSuite {



        @Test
        public void queeTasksUpdate() {
            //Given
            Mentor mentor = new Mentor(1);
            Task task1 = new Task(1, "Build home");
            Task task2 = new Task(2, "Kill All Humans!");
            TaskQueue queue = new TaskQueue(1, "Smola");
            queue.registerQueueObserver(mentor);

            //When
            queue.addTaskToQueue(task1);
            queue.addTaskToQueue(task2);
            //Then

            assertThat(2).isEqualTo(mentor.getUpdateCount());

        }
    }