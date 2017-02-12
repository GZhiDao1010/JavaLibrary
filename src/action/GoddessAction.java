package action;

import java.util.List;

import dao.GoddessDao;
import model.Goddess;

public class GoddessAction {
	public static void main(String[] args) throws Exception
	{
		GoddessDao g = new GoddessDao();
		List<Goddess> gs = g.query();//获得数据集合
		for(Goddess goddess :gs)
		{
			System.out.println(goddess.getUser_name()+goddess.getAge());
		}
	}
}
