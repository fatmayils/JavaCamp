package Concrete;

import java.util.ArrayList;

import Abstract.CheckService;
import Abstract.MemberService;
import Adapters.MernisServiceAdapter;
import Entities.Member;

public class MemberManager implements MemberService{

	CheckService check;
	public MemberManager(MernisServiceAdapter mernisServiceAdapter)
	{
		this.check= mernisServiceAdapter;
	}
	ArrayList<Member> members=new ArrayList<Member>();
	@Override
	public void add(Member member) {
		
		if(check.checkIfRealPerson(member))
		{
			System.out.println("Do�rulama ba�ar�l�."+member.getFirstName()+" eklendi");
			members.add(member);
		}
		else {
			System.out.println("Do�rulama ba�ar�s�z."+member.getFirstName()+" eklenmedi");
		}
		
	}

	@Override
	public void delete(Member member) {
		
		System.out.println("Silindi:"+member.getFirstName());
		members.remove(member);
	}

	@Override
	public void update(Member member) {
	
		System.out.println("g�ncellendi:"+member.getFirstName());	
	}

	@Override
	public void list() {
		
		System.out.println("�yeler listeleniyor....");
		for(Member member:members)
		{
			System.out.println(member.getFirstName());
		}
		System.out.println("Listeleme bitti");
	}

	@Override
	public void login(Member member) {
	
		System.out.println("Kullan�c� giri� yapt�:"+member.getFirstName());
	}

	@Override
	public void logout(Member member) {
		System.out.println("Kullan�c� ��k�� yapt�"+member.getFirstName());	
		
	}

}
