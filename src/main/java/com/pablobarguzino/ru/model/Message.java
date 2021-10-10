package com.pablobarguzino.ru.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private Date date;
    private Long userId;

    public Message(Long id, String content, Date date, Long userId) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.userId = userId;
    }

    public Message() {

    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public Long getUserId() {
        return userId;
    }
}
