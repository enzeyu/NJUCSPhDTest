package com.logicService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.data.po.Course;
import com.data.po.FacultyDean;

public interface FacultyDeanMethod extends Remote{
		//院系教务员登陆,输入ID（帐号）、password（密码）当ID和password匹配return true，反之return false；
		public boolean login(String ID,String password) throws RemoteException;
		//获取用户信息,传入ID（用户）ID，返回用户信息
		public FacultyDean getSelf(String ID) throws RemoteException;
		//院系教务员修改密码传入ID（帐号）、origninalassword（原密码）和password（现密码），
		//若原密码正确return true，若原密码错误return false。
		public boolean changePassword(String ID,String originalPassword,String password) throws RemoteException;
		//发布课程,传入ID（院系教务员ID）、Course（课程），若课程已存在，则发布失败return false，反之return true。
		public boolean publishClass(String ID,Course c) throws RemoteException;
		//查看本院系课程列表，传入ID（院系ID）,return 
		public List<Course> getClassList(String ID) throws RemoteException;
		//查看任何课程信息
		public Course getClass(String cID) throws RemoteException;
		//修改课程信息
		public boolean modifyClass(Course c) throws RemoteException;
}
