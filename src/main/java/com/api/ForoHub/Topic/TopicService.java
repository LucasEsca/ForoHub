package com.api.ForoHub.Topic;


import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(TopicDTO topicDto) {
        Topic topic = new Topic();
        topic.setTitle(topicDto.title());
        topic.setMessage(topicDto.message());
        topic.setCreationDate(LocalDateTime.now());
        topic.setStatus(TopicStatus.OPEN);
        topic.setAuthorId(topicDto.authorId());
        topic.setCourseId(topicDto.courseId());
        return topicRepository.save(topic);
    }
}
