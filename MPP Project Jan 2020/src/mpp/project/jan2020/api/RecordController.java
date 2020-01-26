package mpp.project.jan2020.api;

import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.CheckOutRecord;
import mpp.project.jan2020.service.CheckOutRecordService;

public class RecordController {
	private  CheckOutRecordService recordService = new CheckOutRecordService();
	
	public void addRecord(CheckOutRecord record) {
		recordService.addRecord(record);
	}

	
	public List<CheckOutRecord> getAllRecord() {
		return recordService.getAllRecord();
	}
   
    public CheckOutRecord getRecordByISBN(String isbn){
    	return recordService.getRecordByUSBN(isbn);
    }
    public CheckOutRecord getRecordByUsId(String usid){
    	return recordService.getRecordByUsId(usid);
    }

	public void deleteRecordByISBN(String isbn) {
		recordService.deleteRecordByISBN(isbn);
	}

	public void deleteRecordByUsId(String usid) {
		recordService.deleteRecordByUsId(usid);
	}
	public void updateRecordISBN(String isbn, CheckOutRecord update) {
		recordService.updateRecordISBN(isbn, update);
	}
	public void updateRecordUsId(String usid, CheckOutRecord update2) {
		recordService.updateRecordUsId(usid, update2);
	}
}
