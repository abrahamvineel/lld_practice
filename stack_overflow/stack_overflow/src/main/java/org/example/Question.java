package org.example;

import java.util.Date;
import java.util.List;

public class Question {

    private final int id;
    private final String title;
    private final String content;
    private final Date createdAt;
    private List<Answer> answers;

    public Question(int id, String title, String content, Date createdAt, List<Answer> answers) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.answers = answers;
    }
}
