package com.lizy.lock;

/**
 * Created By Lizhengyuan on 19-2-15
 */
public class UnableToAquireLockException extends RuntimeException{
    public UnableToAquireLockException() {
    }

    public UnableToAquireLockException(String message) {
        super(message);
    }

    public UnableToAquireLockException(String message, Throwable cause) {
        super(message, cause);
    }

}
