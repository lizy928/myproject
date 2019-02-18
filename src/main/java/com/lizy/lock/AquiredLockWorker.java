package com.lizy.lock;

/**
 * Created By Lizhengyuan on 19-2-15
 */
public interface AquiredLockWorker<T> {

    T invokeAfterLockAquire() throws Exception;
}
