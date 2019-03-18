package com.example.demo.forum.user.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "f_user")
public class User {
    //用户id.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //用户邮箱
    @Column(length = 40,nullable = false)
    private String mailbox;
    //用户密码
    @Column(length = 32,nullable = false)
    private String password;
    //昵称
    @Column(length = 20,nullable = false)
    private String nickname;
    //生日
    @Column(length = 20)
    private String birthday;
    //性别
    @Column(length = 1)
    private Integer sex;
    //注册时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date registertime=new Date();
    //积分
    @Column(length = 10)
    private Integer integral=0;

    //在线时长
    @Column(length=10)
    private Integer onlinetime=1;
    //权限
    @Column(length=2)
    private Integer power=0;
    //签名
    @Column(length=100)
    private String autograph;
    //头像
    @Lob
    private String headpic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(Integer onlinetime) {
        this.onlinetime = onlinetime;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }
}
