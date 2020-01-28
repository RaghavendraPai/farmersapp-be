package utils;

public class JsonListResponse extends JsonResponse {

    public JsonListResponse(Status status, double total, int page, int pageSize) {
        super(status.code, status.msg);
        this.put("total", total);
        this.put("page", page);
        this.put("page_size", pageSize);
    }
    public JsonListResponse(String msg, int code, double total, int page, int pageSize) {
        super(code, msg);
        this.put("total", total);
        this.put("page", page);
        this.put("page_size", pageSize);
    }

}
