package _06_컬렉션프레임워크.app.ex05_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> queue = new ArrayDeque<>();

    public void addTask(Task task) {
        queue.offer(task);
    }

    public int getRemainingTasks() {
        return queue.size();
    }

    public void processNextTask() {
        while(!queue.isEmpty())
            queue.poll().execute();
    }
}
