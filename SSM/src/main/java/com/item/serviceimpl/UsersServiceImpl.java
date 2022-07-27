package com.item.serviceimpl;

import com.item.dao.UsersMapper;
import com.item.model.Users;
import com.item.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> GetInfo() {
        return usersMapper.GetInfo();
    }

    @Override
    public List<Users> SelectName(String nickName) {
        return usersMapper.SelectName(nickName);
    }

    @Override
    public Users UsersSelectById(int id) {
        return usersMapper.UsersSelectById(id);
    }

    @Override
    public int UsersAddInfo(String userName, String pwd, String nickName) {
        pwd=encrypt(pwd);
        return usersMapper.UsersAddInfo(userName, pwd, nickName);
    }

    @Override
    public int UsersUpdateInfo(String pwd, int id) {
        pwd=encrypt(pwd);
        return usersMapper.UsersUpdateInfo(pwd, id);
    }

    /**
     * MD5加密
     * @param password
     * @return
     */
    private String encrypt(String password) {
        String passwordMd5 = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(password.getBytes("utf-8"));
            passwordMd5 = toHex(bytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return passwordMd5;
    }

    private static String toHex(byte[] bytes) {
        final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
        StringBuilder ret = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
            ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
        }
        return ret.toString();
    }

    @Override
    public int UsersDeleteById(int id) {
        return usersMapper.UsersDeleteById(id);
    }
}