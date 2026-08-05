package com.tidbcloud.jdbc.internal.http;

public final class RetryableHttpFailure extends Exception {
    public RetryableHttpFailure(String message) {
        super(message);
    }
}
