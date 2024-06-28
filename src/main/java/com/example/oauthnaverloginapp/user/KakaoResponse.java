package com.example.oauthnaverloginapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

public class KakaoResponse {
    @Data // getter, setter
    public static class TokenDTO {
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("expires_in")
        private Integer expiresIn;
        private String scope; // 조심하자
        @JsonProperty("refresh_token_expires_in")
        private Integer refreshTokenExpiresIn;
    }

//    {
//        "access_token": "Of5vpvMW7dzb5ysL_Wr_NLiGezqn8YZrAAAAAQoqJY8AAAGQXXT2YxKZRqbpl2cW",
//            "token_type": "bearer",
//            "refresh_token": "_4uoFCyohL396RNhr-Jmc3wuiQzgtTlaAAAAAgoqJY8AAAGQXXT2XxKZRqbpl2cW",
//            "expires_in": 21599,
//            "scope": "profile_nickname",
//            "refresh_token_expires_in": 5183999
//    }

    @Data
    public static class KakaoUserDTO {
        private Long id;
        @JsonProperty("connected_at")
        private Timestamp connectedAt;
        private Properties properties;


        @Data
        class Properties {
            private String nickname;
        }
    }


//    {
//        "id":3599443073,
//            "connected_at":"2024-06-28T04:59:20Z",
//            "properties":{
//                "nickname":"심유주"
//        }
//    }

}

