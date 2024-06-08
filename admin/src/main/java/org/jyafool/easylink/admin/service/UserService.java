package org.jyafool.easylink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jyafool.easylink.admin.dao.entity.UserDO;
import org.jyafool.easylink.admin.dto.req.UserLoginReqDTO;
import org.jyafool.easylink.admin.dto.req.UserRegisterReqDTO;
import org.jyafool.easylink.admin.dto.req.UserUpdateReqDTO;
import org.jyafool.easylink.admin.dto.resp.UserLoginRespDTO;
import org.jyafool.easylink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 * @Author jyafool
 * @Version 1.0
 * @Since 2024/6/7
 */
public interface UserService extends IService<UserDO> {
    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     *
     * @param username 用户名
     * @return 用户名存在返回 True，不存在返回 False
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     *
     * @param requestParam 注册用户请求参数
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     *
     * @param requestParam 修改用户请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     *
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回参数 Token
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     *
     * @param username 用户名
     * @param token    用户登录 Token
     * @return 用户是否登录标识
     */
    Boolean checkLogin(String username, String token);

    /**
     * 退出登录
     *
     * @param username 用户名
     * @param token    用户登录 Token
     */
    void logout(String username, String token);
}