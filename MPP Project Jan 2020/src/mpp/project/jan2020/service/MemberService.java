package mpp.project.jan2020.service;

import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.dao.LibMemberDao;
import mpp.project.jan2020.dao.LibMemberDataAccessService;
import mpp.project.jan2020.model.LibraryMember;

public class MemberService {
	private  LibMemberDao libMemberDao = new LibMemberDataAccessService();

	

	public boolean addMember(LibraryMember libraryMember) {
		return libMemberDao.insertMember(libraryMember);
	}

	public List<LibraryMember> getAllMember(){
		return libMemberDao.selectAllMembers();
	}

	public LibraryMember getMemberByUsId(String usid){
		return libMemberDao.selectMemberByUsId(usid);
	}

	public boolean deleteMemberByUsId(String usid) {
		return libMemberDao.deleteMemberByUsId(usid);
	}

	public boolean updateBook(String usid, LibraryMember libraryMember) {
		return libMemberDao.updateMemberByUsId(usid, libraryMember);
	}
}
