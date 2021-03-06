package com.qf.service;

import com.qf.pojo.*;

import java.util.List;

public interface TeacherService {
    //通过关联teacher，class，student，weekly查询到周报
    //查询本班学生考试周报成绩
    List<Weekly> getWeeklyListBySid(int tid);
    //讲师打分周报
    int updateWeeklyByTid(int tid, int score);
    //查看本班内学生信息
    List<Student> getStudentByTid(int tid);
    //查看待审核的学生请假信息
    List<Sleave> getSleaveListByTid(int tid);
    //审核学生请假
    int updateLeave(int lid);
    //老师请假
    int addTleave(Tleave tleave, int sid);
    //sid得到班主任和讲师
    Teacher getHeaderBySid(int sid);
    Teacher getTeacherBySid(int sid);
}
