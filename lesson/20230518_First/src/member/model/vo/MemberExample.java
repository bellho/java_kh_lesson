package member.model.vo;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member();
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		
		sc.close();
		
		member.setName(name);
		System.out.println(member.getName());
	}
}