package com.cydoe.repository;

import com.cydoe.model.Comment;
import org.springframework.stereotype.Component;


@Component
public class DBCommentRepository implements CommentRepository{


    public void storeComment(Comment comment) {
        System.out.println("Storing comment;" + comment.getText());
    }
}

// it is injected in service. we use @component