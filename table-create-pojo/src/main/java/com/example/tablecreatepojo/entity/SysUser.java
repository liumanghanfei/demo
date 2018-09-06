package com.example.tablecreatepojo.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.usercode
     *
     * @mbg.generated
     */
    private String usercode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.salt
     *
     * @mbg.generated
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.locked
     *
     * @mbg.generated
     */
    private Integer locked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.realName
     *
     * @mbg.generated
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.pid
     *
     * @mbg.generated
     */
    private String pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.openbank
     *
     * @mbg.generated
     */
    private String openbank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.cardNo
     *
     * @mbg.generated
     */
    private String cardno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.phoneNo
     *
     * @mbg.generated
     */
    private String phoneno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.role
     *
     * @mbg.generated
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.lastlogtime
     *
     * @mbg.generated
     */
    private Date lastlogtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.recommendNo
     *
     * @mbg.generated
     */
    private String recommendno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.regtime
     *
     * @mbg.generated
     */
    private Date regtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.threezhifu
     *
     * @mbg.generated
     */
    private String threezhifu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.wttz
     *
     * @mbg.generated
     */
    private String wttz;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.passState
     *
     * @mbg.generated
     */
    private String passstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.ticket
     *
     * @mbg.generated
     */
    private Integer ticket;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.open_id
     *
     * @mbg.generated
     */
    private String openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.manager
     *
     * @mbg.generated
     */
    private String manager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.usercode
     *
     * @return the value of sys_user.usercode
     *
     * @mbg.generated
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.usercode
     *
     * @param usercode the value for sys_user.usercode
     *
     * @mbg.generated
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.username
     *
     * @return the value of sys_user.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.username
     *
     * @param username the value for sys_user.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.salt
     *
     * @return the value of sys_user.salt
     *
     * @mbg.generated
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.salt
     *
     * @param salt the value for sys_user.salt
     *
     * @mbg.generated
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.locked
     *
     * @return the value of sys_user.locked
     *
     * @mbg.generated
     */
    public Integer getLocked() {
        return locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.locked
     *
     * @param locked the value for sys_user.locked
     *
     * @mbg.generated
     */
    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.realName
     *
     * @return the value of sys_user.realName
     *
     * @mbg.generated
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.realName
     *
     * @param realname the value for sys_user.realName
     *
     * @mbg.generated
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.pid
     *
     * @return the value of sys_user.pid
     *
     * @mbg.generated
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.pid
     *
     * @param pid the value for sys_user.pid
     *
     * @mbg.generated
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.openbank
     *
     * @return the value of sys_user.openbank
     *
     * @mbg.generated
     */
    public String getOpenbank() {
        return openbank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.openbank
     *
     * @param openbank the value for sys_user.openbank
     *
     * @mbg.generated
     */
    public void setOpenbank(String openbank) {
        this.openbank = openbank == null ? null : openbank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.cardNo
     *
     * @return the value of sys_user.cardNo
     *
     * @mbg.generated
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.cardNo
     *
     * @param cardno the value for sys_user.cardNo
     *
     * @mbg.generated
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.phoneNo
     *
     * @return the value of sys_user.phoneNo
     *
     * @mbg.generated
     */
    public String getPhoneno() {
        return phoneno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.phoneNo
     *
     * @param phoneno the value for sys_user.phoneNo
     *
     * @mbg.generated
     */
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.email
     *
     * @return the value of sys_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.email
     *
     * @param email the value for sys_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.role
     *
     * @return the value of sys_user.role
     *
     * @mbg.generated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.role
     *
     * @param role the value for sys_user.role
     *
     * @mbg.generated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.address
     *
     * @return the value of sys_user.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.address
     *
     * @param address the value for sys_user.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.lastlogtime
     *
     * @return the value of sys_user.lastlogtime
     *
     * @mbg.generated
     */
    public Date getLastlogtime() {
        return lastlogtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.lastlogtime
     *
     * @param lastlogtime the value for sys_user.lastlogtime
     *
     * @mbg.generated
     */
    public void setLastlogtime(Date lastlogtime) {
        this.lastlogtime = lastlogtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.recommendNo
     *
     * @return the value of sys_user.recommendNo
     *
     * @mbg.generated
     */
    public String getRecommendno() {
        return recommendno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.recommendNo
     *
     * @param recommendno the value for sys_user.recommendNo
     *
     * @mbg.generated
     */
    public void setRecommendno(String recommendno) {
        this.recommendno = recommendno == null ? null : recommendno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.regtime
     *
     * @return the value of sys_user.regtime
     *
     * @mbg.generated
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.regtime
     *
     * @param regtime the value for sys_user.regtime
     *
     * @mbg.generated
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.threezhifu
     *
     * @return the value of sys_user.threezhifu
     *
     * @mbg.generated
     */
    public String getThreezhifu() {
        return threezhifu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.threezhifu
     *
     * @param threezhifu the value for sys_user.threezhifu
     *
     * @mbg.generated
     */
    public void setThreezhifu(String threezhifu) {
        this.threezhifu = threezhifu == null ? null : threezhifu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.wttz
     *
     * @return the value of sys_user.wttz
     *
     * @mbg.generated
     */
    public String getWttz() {
        return wttz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.wttz
     *
     * @param wttz the value for sys_user.wttz
     *
     * @mbg.generated
     */
    public void setWttz(String wttz) {
        this.wttz = wttz == null ? null : wttz.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.passState
     *
     * @return the value of sys_user.passState
     *
     * @mbg.generated
     */
    public String getPassstate() {
        return passstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.passState
     *
     * @param passstate the value for sys_user.passState
     *
     * @mbg.generated
     */
    public void setPassstate(String passstate) {
        this.passstate = passstate == null ? null : passstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.ticket
     *
     * @return the value of sys_user.ticket
     *
     * @mbg.generated
     */
    public Integer getTicket() {
        return ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.ticket
     *
     * @param ticket the value for sys_user.ticket
     *
     * @mbg.generated
     */
    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.open_id
     *
     * @return the value of sys_user.open_id
     *
     * @mbg.generated
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.open_id
     *
     * @param openId the value for sys_user.open_id
     *
     * @mbg.generated
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.manager
     *
     * @return the value of sys_user.manager
     *
     * @mbg.generated
     */
    public String getManager() {
        return manager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.manager
     *
     * @param manager the value for sys_user.manager
     *
     * @mbg.generated
     */
    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", usercode=").append(usercode);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", locked=").append(locked);
        sb.append(", realname=").append(realname);
        sb.append(", pid=").append(pid);
        sb.append(", openbank=").append(openbank);
        sb.append(", cardno=").append(cardno);
        sb.append(", phoneno=").append(phoneno);
        sb.append(", email=").append(email);
        sb.append(", role=").append(role);
        sb.append(", address=").append(address);
        sb.append(", lastlogtime=").append(lastlogtime);
        sb.append(", recommendno=").append(recommendno);
        sb.append(", regtime=").append(regtime);
        sb.append(", threezhifu=").append(threezhifu);
        sb.append(", wttz=").append(wttz);
        sb.append(", passstate=").append(passstate);
        sb.append(", ticket=").append(ticket);
        sb.append(", openId=").append(openId);
        sb.append(", manager=").append(manager);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}