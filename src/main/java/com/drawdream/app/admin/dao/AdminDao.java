package com.drawdream.app.admin.dao;

import com.drawdream.app.admin.pojo.Admin;
import org.apache.ibatis.annotations.Param;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public interface AdminDao {
    public Admin getAdmin(@Param("id") int id);
}
