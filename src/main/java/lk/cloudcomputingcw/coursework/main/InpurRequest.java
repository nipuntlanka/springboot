package lk.cloudcomputingcw.coursework.main;

public class InpurRequest {

    private String id;

    private String username;

    private String auth_token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    @Override
    public String toString() {
        return "InpurRequest{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", auth_token='" + auth_token + '\'' +
                '}';
    }
}
