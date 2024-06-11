package com.api.ForoHub.Topic;


import com.api.ForoHub.exception.DuplicateTopicException;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(TopicDTO topicDto) {
        if (topicRepository.existsByTitleAndMessage(topicDto.title(), topicDto.message())) {
            throw new DuplicateTopicException("Un tópico con el mismo título y mensaje ya existe.");
        }

        Topic topic = new Topic();
        topic.setTitle(topicDto.title());
        topic.setMessage(topicDto.message());
        topic.setCreationDate(LocalDateTime.now());
        topic.setStatus(TopicStatus.OPEN);
        topic.setAuthorId(topicDto.authorId());
        topic.setCourseId(topicDto.courseId());
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }
}
