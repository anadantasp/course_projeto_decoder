package com.ead.course.services.impl;

import com.ead.course.repositories.CourseUserRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseUserServiceImpl {

    final
    CourseUserRepository courseUserRepository;

    public CourseUserServiceImpl(CourseUserRepository courseUserRepository) {
        this.courseUserRepository = courseUserRepository;
    }
}
