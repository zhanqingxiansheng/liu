package com.liuwork.pojo;

/**
 * @ClassName UserManager
 * @Author liuzhihao
 * @Description
 * @Date 2021/5/20 9:13
 * @Version 1.0.0
 */
//实体类
public class UserManager {
    private int user_id;
    private int dept_id;
    private String user_name;
    private String nick_name;
    private String user_label;
    private String user_password;
    private String user_time;
    private String user_log;
    private String user_status;
    private String user_email;
    private int user_phoenumber;
    public UserManager(){
        //无参构造器
    }

    public UserManager(int user_id, int dept_id, String user_name, String nick_name,
                       String user_label, String user_password, String user_time, String user_log,
                       String user_status, String user_email, int user_phoenumber) {
        this.user_id = user_id;
        this.dept_id = dept_id;
        this.user_name = user_name;
        this.nick_name = nick_name;
        this.user_label = user_label;
        this.user_password = user_password;
        this.user_time = user_time;
        this.user_log = user_log;
        this.user_status = user_status;
        this.user_email = user_email;
        this.user_phoenumber = user_phoenumber;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getUser_label() {
        return user_label;
    }

    public void setUser_label(String user_label) {
        this.user_label = user_label;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_time() {
        return user_time;
    }

    public void setUser_time(String user_time) {
        this.user_time = user_time;
    }

    public String getUser_log() {
        return user_log;
    }

    public void setUser_log(String user_log) {
        this.user_log = user_log;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getUser_phoenumber() {
        return user_phoenumber;
    }

    public void setUser_phoenumber(int user_phoenumber) {
        this.user_phoenumber = user_phoenumber;
    }

    @Override
    public String toString() {
        return "UserManager{" +
                "user_id=" + user_id +
                ", dept_id=" + dept_id +
                ", user_name='" + user_name + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", user_label='" + user_label + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_time='" + user_time + '\'' +
                ", user_log='" + user_log + '\'' +
                ", user_status='" + user_status + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_phoenumber=" + user_phoenumber +
                '}';
    }
}
