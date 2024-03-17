package servlets;

public class Message {
    private String username;
    private String createTime;
    private String content;

    public Message(String username, String createTime, String content) {
        this.username = username;
        this.createTime = createTime;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}