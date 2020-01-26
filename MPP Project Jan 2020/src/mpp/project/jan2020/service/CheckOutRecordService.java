package mpp.project.jan2020.service;

import java.util.List;
import java.util.Optional;


import mpp.project.jan2020.dao.RecordDao;
import mpp.project.jan2020.dao.RecordDataAccessService;
import mpp.project.jan2020.model.CheckOutRecord;

public class CheckOutRecordService {
private RecordDao memberDao = new RecordDataAccessService();

public boolean addRecord(CheckOutRecord record) {
	return memberDao.insertCheckOutRecord(record);
}

public List<CheckOutRecord> getAllRecord(){
	return memberDao.selectAllCheckOutRecords();
}

public CheckOutRecord getRecordByUSBN(String isbn){
	return memberDao.selectCheckOutRecordByISBN(isbn);
}

public CheckOutRecord getRecordByUsId(String usid){
	return memberDao.selectCheckOutRecordByUsId(usid);
}
public boolean deleteRecordByISBN(String isbn) {
	return memberDao.deleteCheckOutRecordByISBN(isbn);
}

public boolean deleteRecordByUsId(String usid) {
	return memberDao.deleteCheckOutRecordByUsId(usid);
}
public boolean updateRecordISBN(String isbn, CheckOutRecord update) {
	return memberDao.updateCheckOutRecordByISBN(isbn, update);
}
public boolean updateRecordUsId(String usid, CheckOutRecord update2) {
	return memberDao.updateCheckOutRecordByUsId(usid, update2);
}
}
