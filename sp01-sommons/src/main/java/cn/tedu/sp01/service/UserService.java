package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

public interface UserService {
    User getUser(Integer userid);
    void addScore(Integer userid, Integer score);
}
