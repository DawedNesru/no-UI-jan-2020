package mpp.project.jan2020.api;

import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.LibraryMember;
import mpp.project.jan2020.service.MemberService;

public class MemberController {
	private  MemberService memberService = new MemberService();

		
	public void addMember(LibraryMember member) {
		memberService.addMember(member);
	}

	
	public List<LibraryMember> getAllMember() {
		return memberService.getAllMember();
	}
   
    public LibraryMember getMemberByUsId(String usid){
    	return memberService.getMemberByUsId(usid);
    }

	public void deleteMemberByUsId(String usid) {
		memberService.deleteMemberByUsId(usid);
	}

	
	public void updateMemberUsId(String usid, LibraryMember libraryMember) {
		memberService.updateBook(usid, libraryMember);
	}
}
