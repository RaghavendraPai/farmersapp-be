package utils;

public final class Status {
    public String msg;
    public int code;
    public Status(String msg, int code) {
        this.code = code;
        this.msg = msg;
    }
    public String toString() {
        return "Status[ code: " + code + ", msg: " + msg + " ] ";
    }
}