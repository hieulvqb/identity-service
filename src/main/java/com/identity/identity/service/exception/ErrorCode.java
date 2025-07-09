package com.identity.identity.service.exception;

public enum ErrorCode {
    UNCATEGORIZED_ERROR(9999, "An uncategorized error occurred"),
    INVALID_KEY(1001, "An uncategorized error occurred"),
    USERNAME_ALREADY_EXISTS(1002, "Username already exists"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters long"),
    INVALID_PASSWORD(1004, "Password must be at least 8 characters long"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
