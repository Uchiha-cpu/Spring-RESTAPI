package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	
	public CourseServiceImpl() {
//		list=new ArrayList<Course>();
//		list.add(new Course(145,"Java Core course","this course contains basic of java"));
//		list.add(new Course(146,"Spring Boot course","Creating Spring boot app"));
	}


	public List<Course> getCourses() {
		return courseDao.findAll();
		
		//return list;
	}


	public Course getCourse(long courseId) {
		return courseDao.getById(courseId);
		
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
//		return c;
	}


	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
//		list.add(course);
//		return course;
	}


	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
		// TODO Auto-generated method stub
//		list.forEach(e -> {
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
	}



	public void deleteCourse(long parseLong) {
		Course entity=courseDao.getById(parseLong);
		courseDao.delete(entity);
		//list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
	}

}
