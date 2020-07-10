package com.example.demo.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @authod: pp_lan on 2020/7/11.
 */
//@Mapper
public interface TestMapper {

    @Select("select * from student")
    List<Map<String, Object>> queryAllStudents();
}
