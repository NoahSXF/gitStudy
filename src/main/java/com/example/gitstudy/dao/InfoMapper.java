package com.example.gitstudy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Mapper
@Repository
public interface InfoMapper {
    public Map<String,Object> queryInfo();
}
