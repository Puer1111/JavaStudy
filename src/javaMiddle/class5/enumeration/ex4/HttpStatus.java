package javaMiddle.class5.enumeration.ex4;

public enum HttpStatus {
    OK(200,"OK"),BAD_REQUEST(400,"Bad Request"),NOT_FOUND(404,"Not Found"),INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int codeInput) {
        HttpStatus[] values = values();    // values 까먹지 말자. if문으로 일일히 하는거 아님.
        for (HttpStatus value : values) {
            if (value.getCode() == codeInput) {
                return value;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}
