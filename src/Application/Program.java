package Application;

import java.sql.Date;
import java.util.Scanner;

import Model.Entities.Department;
import Model.Entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(1950), 3000.0, obj);
		System.out.println(seller);
		
		
		sc.close();
	}

}
