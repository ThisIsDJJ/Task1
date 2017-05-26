package com.dj.service;


import java.util.List;

import com.dj.domain.Student;

public interface StudentService {

    public long insert(Student student);
    public boolean update(Student student);
    public boolean delete(long id);
    public List<Student> selectAll();
    public int countAll();
    public Student findByStudentId(long id);
}
