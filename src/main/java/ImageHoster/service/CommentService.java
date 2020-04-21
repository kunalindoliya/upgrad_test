package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Kunal Indoliya.
 */
@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public void addComment(Comment comment) {
        commentRepository.addComment(comment);
    }
}
