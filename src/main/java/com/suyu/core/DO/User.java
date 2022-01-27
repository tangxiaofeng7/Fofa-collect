/*
 * Copyright (c) 2019. r4v3zn.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.suyu.core.DO;

import com.suyu.core.enmus.UserVipLevelEnum;

/**
 * Title: User
 * Descrption: this is User
 * Date:2019-06-07 16:00
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 * @author R4v3zn
 * @version 1.0.0
 */
public class User {
    /**
     * user email
     */
    private String email;

    /**
     * username;
     */
    private String userName;

    /**
     * fcion
     */
    private Integer fCoin;

    /**
     * vip
     */
    private Boolean isVip;

    /**
     * vip level
     */
    private UserVipLevelEnum vipLevel;

    /**
     * is verified
     */
    private Boolean isVerified;

    /**
     * avatar
     */
    private String avatar;

    /**
     * message count
     */
    private Integer message;

    /**
     * fofacli version
     */
    private String fofacliVersion;

    /**
     * fofa server
     */
    private Boolean fofaServer;

    /**
     * User
     * @param email email
     * @param userName name
     * @param fCoin FCoin
     * @param isVip is vip
     * @param vipLevel vip level
     * @param isVerified is verified
     * @param avatar avatar link
     * @param message message count
     * @param fofacliVersion fofacli version
     * @param fofaServer fofaServer
     */
    public User(String email, String userName, Integer fCoin, Boolean isVip, UserVipLevelEnum vipLevel, Boolean isVerified, String avatar, Integer message, String fofacliVersion, Boolean fofaServer) {
        this.email = email;
        this.userName = userName;
        this.fCoin = fCoin;
        this.isVip = isVip;
        this.vipLevel = vipLevel;
        this.isVerified = isVerified;
        this.avatar = avatar;
        this.message = message;
        this.fofacliVersion = fofacliVersion;
        this.fofaServer = fofaServer;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setfCoin(Integer fCoin) {
        this.fCoin = fCoin;
    }

    public void setVip(Boolean vip) {
        isVip = vip;
    }

    public void setVipLevel(UserVipLevelEnum vipLevel) {
        this.vipLevel = vipLevel;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    public void setFofacliVersion(String fofacliVersion) {
        this.fofacliVersion = fofacliVersion;
    }

    public void setFofaServer(Boolean fofaServer) {
        this.fofaServer = fofaServer;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getfCoin() {
        return fCoin;
    }

    public Boolean getVip() {
        return isVip;
    }

    public UserVipLevelEnum getVipLevel() {
        return vipLevel;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public String getAvatar() {
        return avatar;
    }

    public Integer getMessage() {
        return message;
    }

    public String getFofacliVersion() {
        return fofacliVersion;
    }

    public Boolean getFofaServer() {
        return fofaServer;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fCoin=" + fCoin +
                ", isVip=" + isVip +
                ", vipLevel=" + vipLevel +
                ", isVerified=" + isVerified +
                ", avatar='" + avatar + '\'' +
                ", message=" + message +
                ", fofacliVersion='" + fofacliVersion + '\'' +
                ", fofaServer=" + fofaServer +
                '}';
    }
}
