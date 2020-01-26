package mpp.project.jan2020.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.Address;
import mpp.project.jan2020.model.Book;
import mpp.project.jan2020.model.LibraryMember;

public class LibMemberDataAccessService implements LibMemberDao {
	private static List<LibraryMember> DB = new ArrayList<>();
	@Override
	public boolean insertMember(LibraryMember libraryMember) {
		if(libraryMember == null) return false;
		
		DB.add(new LibraryMember(libraryMember.getfName(), libraryMember.getlName(), libraryMember.getUID(), libraryMember.getAddress().getStreet(), libraryMember.getAddress().getCity(), libraryMember.getAddress().getState(), libraryMember.getAddress().getZip()     ));
		return true;
	}

	@Override
	public List<LibraryMember> selectAllMembers() {
		
		return DB;
	}

	@Override
	public LibraryMember selectMemberByUsId(String usid) {
		for(LibraryMember lm: DB) {
			if(lm.getUID().equals(usid))
				return lm;
		}
		return null;
	}

	@Override
	public boolean deleteMemberByUsId(String usid) {
		LibraryMember memberToDelete = selectMemberByUsId(usid);
		if(memberToDelete == null) {
			return false;
		}
		DB.remove(memberToDelete);
		return true;
	}

	@Override
	public boolean updateMemberByUsId(String usid, LibraryMember libraryMember) {
		LibraryMember old = selectMemberByUsId(usid);
		for(int i = 0; i < DB.size(); i++) {
			if(old.getUID().equals(usid))
			{	DB.set(i, libraryMember);
			return true;
			}
			}
			

		return false;
	}

}
