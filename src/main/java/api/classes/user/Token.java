package api.classes.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Token {
    private String status;
    private String data;
    private String token;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("data")
    private void unpackNested(Map<String, Object> data) {
        this.token = (String) data.get("token");
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}