package com.ohgiraffers.sessionsecurity.user.model.service;

import com.ohgiraffers.sessionsecurity.user.model.dao.UserMapper;
import com.ohgiraffers.sessionsecurity.user.model.dto.SignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    public int regist(SignupDTO signupDTO) {

        signupDTO.setUserPass(passwordEncoder.encode(signupDTO.getUserPass()));

        int result = 0;

        try{
            result = UserMapper.regist(signupDTO);
        } catch (Exception e) {
            e.printStackTrace();   //필기 예외가 발생시 , 발생한 위치와 상태를 반환하는 메소드
        }
        return result;
    }
}
