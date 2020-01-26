package mpp.project.jan2020.dao;

import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.LibraryMember;;

public interface LibMemberDao {
	public boolean insertMember(LibraryMember libraryMember);
	public List<LibraryMember> selectAllMembers();
	public LibraryMember  selectMemberByUsId(String usid);
	public boolean deleteMemberByUsId(String usid);
	public boolean updateMemberByUsId(String usid, LibraryMember libraryMember);
}
