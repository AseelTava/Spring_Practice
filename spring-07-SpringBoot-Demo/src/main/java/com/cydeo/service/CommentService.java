package com.cydeo.service;

import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydoe.model.Comment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    // Always add interface from Proxy and repository packages, because implementation change
 // good practice to put final, because we may forget to create constructor

    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    // create constructor for injection to happen automatically . inject in the container inside config
    public CommentService(CommentRepository commentRepository, @Qualifier("Email") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
         commentRepository.storeComment(comment);      //save in the DB
         commentNotificationProxy.sendComment(comment);    // send email




    }



}
