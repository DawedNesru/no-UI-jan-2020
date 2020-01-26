package mpp.project.jan2020.dao;

import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.CheckOutRecord;

public interface RecordDao {
	public boolean insertCheckOutRecord(CheckOutRecord checkOutRecord);

	public List<CheckOutRecord> selectAllCheckOutRecords();

	public CheckOutRecord selectCheckOutRecordByISBN(String isbn);

	public CheckOutRecord selectCheckOutRecordByUsId(String usid);

	public boolean deleteCheckOutRecordByISBN(String isbn);

	public boolean deleteCheckOutRecordByUsId(String usid);

	public boolean updateCheckOutRecordByUsId(String usid, CheckOutRecord update2);

	public boolean updateCheckOutRecordByISBN(String isbn, CheckOutRecord update);

	}
