package com.ead.course.services;

import com.ead.course.models.CourseModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface CourseService {
    public void delete(CourseModel courseModel);

    public CourseModel save(CourseModel courseModel);

    public Optional<CourseModel> findById(UUID courseID);

    List<CourseModel> findAll();
}
