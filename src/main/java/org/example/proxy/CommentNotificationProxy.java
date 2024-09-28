package org.example.proxy;

import org.example.bean.Comment;

public interface CommentNotificationProxy {


     void sendComment(Comment comment);    // public by default
}
