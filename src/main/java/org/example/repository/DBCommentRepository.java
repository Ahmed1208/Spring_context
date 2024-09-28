package org.example.repository;

import org.example.bean.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("DB")
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("go to DB to store the comment : " + comment.getText());
    }
}
