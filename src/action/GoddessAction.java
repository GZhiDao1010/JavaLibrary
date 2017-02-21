package action;

import java.util.Date;
import java.util.List;

import dao.GoddessDao;
import model.Goddess;

public class GoddessAction {
	public static void main(String[] args) throws Exception
	{
		GoddessDao g = new GoddessDao();
		Goddess g1 = new Goddess();
		g1.setUser_name("xiaoqiang");
		g1.setAge(25);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("1352@163.com");
		g1.setMobile("15902042654");
		g1.setCreate_user("ADMIN");
		g1.setUpdate_user("admin");
		g1.setIsdel(1);
		
		g.addGoddess(g1);
//		List<Goddess> gs = g.query();//获得数据集合
//		for(Goddess goddess :gs)
//		{
//			System.out.println(goddess.getUser_name()+goddess.getAge());
//		}
	}
}
