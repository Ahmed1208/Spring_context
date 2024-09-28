package org.example.service;

import org.example.bean.Comment;
import org.example.proxy.CommentNotificationProxy;
import org.example.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;


    @Autowired
    public CommentService(@Qualifier("DB") CommentRepository commentRepository, @Qualifier("Email")CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment)
    {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }


}
