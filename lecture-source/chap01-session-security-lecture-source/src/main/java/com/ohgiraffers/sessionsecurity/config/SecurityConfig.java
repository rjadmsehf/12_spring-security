package com.ohgiraffers.sessionsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration  //필기 설정파일
@EnableWebSecurity
/*필기 spring security 의 기능을 활성화 시키는 어노테이션 */
public class SecurityConfig {

    /* 필기.
        비밀번호를 인코딩 하기 위한 Bean
        Bcrypt : 비밀번호 해싱에 가장 많이 사용되고 있는 알고리즘.
     */
    /* 필기.
        1. 보안성 : 해시 함수에 무작위 솔트를 적용하여 생성해준다.
        2. 호환성 : 높은 보안 수준 및 데이터베이스에 저장하기 쉬운 특징
        3. 알고리즘 신뢰성 : 보안에 논의 평가를 거친 알고리즘으로 문제 없이 사용 가능
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  //필기 암호화를 위한 클래스
    }

}
