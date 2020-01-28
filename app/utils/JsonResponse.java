package utils;

import java.util.HashMap;
import java.util.List;

public class JsonResponse extends HashMap<String, Object> {
    public void setStatus(int code, String msg) {
        put("status", new Status(msg, code));
    }
    public void setStatus(int code, String msg, List<Error> errors) {
        put("status", new Status(msg, code));
        put("errors", errors);
    }
    public JsonResponse(int code, String msg) {
        put("status", new Status(msg, code));
    }
    public JsonResponse(Status status) {
        put("status", new Status(status.msg, status.code));
    }
    public Status getStatus() {
        return (Status)get("status");
    }
    public String toString() {
        return ((Status)this.get("status")).toString();
    }
}