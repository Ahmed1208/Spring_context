package org.example.proxy;

import org.example.bean.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Facebook")
public class FacebookCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("start send this by facebook : "+ comment.getText());
    }
}
