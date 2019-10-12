package com.wj.membercheck.mbcommon.dto;

import lombok.Data;

@Data
public class LoginResultDTO{
        public static final String NO_SUCH_USER="404";
        public static final String WRONG_PW="444";
        public static final String SUCCESS="666";
        String code;
        int uid;
}
