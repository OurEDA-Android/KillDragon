package com.example.means88.test;

/**
 * Created by Means88 on 2016/6/4.
 */
public class Message {

    private int id;
    private String detail;

    public Message() {
    }

    public Message(int id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (id != message.id) return false;
        return detail != null ? detail.equals(message.detail) : message.detail == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                '}';
    }
}
