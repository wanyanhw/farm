package com.wy.farm.mapper;

import com.wy.farm.dao.UserInfoDao;
import com.wy.farm.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wanyanhw
 * @date 2023/3/2 19:57
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Resource
    private UserInfoDao userInfoDao;
    @Test
    public void listUserTest() {
        List<UserInfo> userInfo = userInfoDao.list();
        System.out.println(userInfo);
    }
}
