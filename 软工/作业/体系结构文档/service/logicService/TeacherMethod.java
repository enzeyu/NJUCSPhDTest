package com.logicService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import com.data.po.Student;
import com.data.po.Teacher;

public interface TeacherMethod extends Remote{
		//老师登陆,传入ID（帐号）和password(密码)，当ID和password匹配return true，反之return false；
		public boolean login(String ID,String password) throws RemoteException;
		//获取用户信息，传入(用户ID)
		public Teacher getSelf(String ID) throws RemoteException;
		//老师修改密码码,传入ID（帐号）、origninalassword（原密码）和password（现密码），若原密码正确return true，若原密码错误return false。
		public boolean changePassword(String ID,String originalPassword,String password) throws RemoteException;
		//老师填写课程信息,传入cID（课程ID）、text（课程简介），若成功return true，反之return false。
		public boolean filnCourseInfor(String cID,String text) throws RemoteException;
		//老师查看选课学生，传入cID(课程ID),返回选择该课程的学生列表。
		public List<Student> getCourseStudent(String cID) throws RemoteException;
		//老师录入成绩，传入ID（课程ID）、score(学生ID-学生成绩)
		public boolean recordScore(String cID,Map score) throws RemoteException;
}
