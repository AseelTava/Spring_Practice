package com.cydoe;

import com.cydoe.config.CommentConfig;
import com.cydoe.model.Comment;
import com.cydoe.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
