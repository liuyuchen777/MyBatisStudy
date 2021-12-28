package com.example.codegenerator.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UmsAdmin implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.id
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.username
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.password
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.icon
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.email
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.nick_name
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.note
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.create_time
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.login_time
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private Date loginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin.status
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.id
     *
     * @return the value of ums_admin.id
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.id
     *
     * @param id the value for ums_admin.id
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.username
     *
     * @return the value of ums_admin.username
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.username
     *
     * @param username the value for ums_admin.username
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.password
     *
     * @return the value of ums_admin.password
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.password
     *
     * @param password the value for ums_admin.password
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.icon
     *
     * @return the value of ums_admin.icon
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.icon
     *
     * @param icon the value for ums_admin.icon
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.email
     *
     * @return the value of ums_admin.email
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.email
     *
     * @param email the value for ums_admin.email
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.nick_name
     *
     * @return the value of ums_admin.nick_name
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.nick_name
     *
     * @param nickName the value for ums_admin.nick_name
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.note
     *
     * @return the value of ums_admin.note
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.note
     *
     * @param note the value for ums_admin.note
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.create_time
     *
     * @return the value of ums_admin.create_time
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.create_time
     *
     * @param createTime the value for ums_admin.create_time
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.login_time
     *
     * @return the value of ums_admin.login_time
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.login_time
     *
     * @param loginTime the value for ums_admin.login_time
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin.status
     *
     * @return the value of ums_admin.status
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin.status
     *
     * @param status the value for ums_admin.status
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Dec 28 11:08:28 JST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", nickName=").append(nickName);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}