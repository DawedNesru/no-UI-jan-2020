package mpp.project.jan2020.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.Book;
import mpp.project.jan2020.model.CheckOutRecord;
import mpp.project.jan2020.model.LibraryMember;


public class RecordDataAccessService implements RecordDao {
	private static List<CheckOutRecord> DB = new ArrayList<>();
	
	@Override
	public boolean insertCheckOutRecord(CheckOutRecord checkOutRecord) {
		if(checkOutRecord == null) return false;
		
		DB.add(new CheckOutRecord(checkOutRecord.getDueDate(), checkOutRecord.getBook(), checkOutRecord.getLibraryMember()));
		return true;
	}

	@Override
	public List<CheckOutRecord> selectAllCheckOutRecords() {
		
		return DB;
	}

	@Override
	public CheckOutRecord selectCheckOutRecordByISBN(String isbn) {
	
		for(CheckOutRecord b: DB) {
			if(b.getBook().getISBN().equals(isbn))
				return b;
		}
		return null;
	}

	@Override
	public CheckOutRecord selectCheckOutRecordByUsId(String usid) {
		for(CheckOutRecord b: DB) {
			if(b.getLibraryMember().getUID().equals(usid))
				return b;
		}
		return null;
		
	}

	@Override
	public boolean deleteCheckOutRecordByISBN(String isbn) {
		CheckOutRecord memberToDelete = selectCheckOutRecordByISBN(isbn);
		if(memberToDelete == null) {
			return false;
		}
		DB.remove(memberToDelete);
		return true;
	}

	@Override
	public boolean deleteCheckOutRecordByUsId(String usid) {
		CheckOutRecord memberToDelete = selectCheckOutRecordByISBN(usid);
		if(memberToDelete == null) {
			return false;
		}
		DB.remove(memberToDelete);
		return true;
	}

	@Override
	public boolean updateCheckOutRecordByISBN(String isbn, CheckOutRecord  checkOutRecord) {
		CheckOutRecord old = selectCheckOutRecordByISBN(isbn);
		for(int i = 0; i < DB.size(); i++) {
			if(old.getLibraryMember().getUID().equals(isbn))
			{	DB.set(i, checkOutRecord);
			return true;
			}
			}
			

		return false;
	
	}

	@Override
	public boolean updateCheckOutRecordByUsId(String usid, CheckOutRecord update2){
		CheckOutRecord old = selectCheckOutRecordByUsId(usid);
		for(int i = 0; i < DB.size(); i++) {
			if(old.getLibraryMember().getUID().equals(usid))
			{	DB.set(i, update2);
			return true;
			}
			}
			

		return false;
		
		
		
	}

	

}
