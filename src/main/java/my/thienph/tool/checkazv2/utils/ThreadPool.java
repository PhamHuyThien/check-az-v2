package my.thienph.tool.checkazv2.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool extends ThreadPoolExecutor {

    private final Runnable[] runnables;
    private boolean exec;
    private boolean stopExecute;

    public ThreadPool(Runnable[] runnables, int maxThread) {
        super(maxThread, maxThread, 10, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1000000));
        this.runnables = runnables;
    }

    public void execute() {
        if (exec) {
            return;
        }
        exec = true;
        for (Runnable runnable : this.runnables) {
            if (stopExecute) {
                break;
            }
            if (runnable == null) {
                continue;
            }
            execute(runnable);
//            Utils.sleep(1);
        }
        shutdown();
    }

    public void await() {
        try {
            awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
        }
    }

    public boolean isExecute() {
        return exec;
    }

    public void stopExecute() {
        stopExecute = true;
    }

}
