package com.cydoe.proxy;

import com.cydoe.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("Email")
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment;" + comment.getText());


    }
}

// it is injected in Service - it is a component