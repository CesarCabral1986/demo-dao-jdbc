package Application;

import java.sql.Date;
import java.util.Scanner;

import Model.Entities.Department;
import Model.Entities.Seller;
import Model.dao.DaoFactory;
import Model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(0), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller seller1 = sellerDao.findById(3);
		
		System.out.println(seller1);
		
		
		sc.close();
	}

}
