package worker;

import java.util.Set;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void work(int howManyTask, Set <Integer> tasksToFail) {
        for (int i = 0; i < howManyTask; i++)
            if (tasksToFail.contains(i)) {
                errorCallback.onError("Task " + i + " fell erroneous");
            } else {
                callback.onDone("Task " + i + " is done");
            }
    }
}
