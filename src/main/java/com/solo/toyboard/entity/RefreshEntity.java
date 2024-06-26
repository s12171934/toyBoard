package com.solo.toyboard.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

//redis에 refresh token 저장
@Data
@RedisHash(value = "refresh", timeToLive = 24 * 60 * 60)
public class RefreshEntity {
    @Id
    private String refresh;
    private String username;
}
