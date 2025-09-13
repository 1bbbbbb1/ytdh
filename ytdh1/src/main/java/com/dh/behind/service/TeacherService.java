package com.dh.behind.service;

import com.dh.behind.pojo.LoginForm;
import com.dh.behind.pojo.Teacher;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TeacherService extends IService<Teacher> {


    Teacher login(LoginForm loginForm);


    Teacher getTeacherById(Long userId);

    IPage<Teacher> getTeachersByOpr(Page<Teacher> paraParam, Teacher teacher);
}
