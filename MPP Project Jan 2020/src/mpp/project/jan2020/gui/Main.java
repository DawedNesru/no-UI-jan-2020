package mpp.project.jan2020.gui;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

import mpp.project.jan2020.api.BookController;
import mpp.project.jan2020.api.MemberController;
import mpp.project.jan2020.api.RecordController;
import mpp.project.jan2020.model.Book;
import mpp.project.jan2020.model.CheckOutRecord;
import mpp.project.jan2020.model.LibraryMember;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		BookController bc = new BookController();
		MemberController mc = new MemberController();
		RecordController rc = new RecordController();
		menu();
		System.out.println("Enter your Choice, please");
		sc = new Scanner(System.in);
		int choice = sc.nextInt();

		while (true) {
			switch (choice) {
			case 1:
				Book book1 = new Book("121", "Core Java", 1, "John", "Kennedy", "Much many are proven", "Phd holder");
				Book book2 = new Book("122", "Core Java", 1, "John", "Kennedy", "Much many are proven", "Phd holder");
				Book book3 = new Book("123", "Core Java", 1, "John", "Kennedy", "Much many are proven", "Phd holder");
				Book book4 = new Book("124", "Core Java", 1, "John", "Kennedy", "Much many are proven", "Phd holder");
				Book book5 = new Book("125", "Core Java", 1, "John", "Kennedy", "Much many are proven", "Phd holder");
				bc.addBook(book1);
				bc.addBook(book2);
				bc.addBook(book3);
				bc.addBook(book4);
				bc.addBook(book5);
				break;
			case 2:
				bc.deleteBookByISBN("124");
				break;
			case 3:
				System.out.println(bc.getAllBook());
				break;

			case 4:
				System.out.println(bc.getBookByISBN("125"));
				break;

			case 5:
				Book book6 = new Book("133", "Core Java", 1, "John", "Kennedy", "Much many are proven", "Phd holder");
				bc.updateBookISBN("123", book6);
				break;

			case 6:
				LibraryMember member1 = new LibraryMember("Chris", "Tacker", "121", "1000 N 4th St", "Fairfield",
						"IOWA", 52557);
				LibraryMember member2 = new LibraryMember("Tim", "Turner", "122", "1000 N 4th St", "Fairfield", "IOWA",
						52557);
				LibraryMember member3 = new LibraryMember("Alvaro", "Havier", "123", "1000 N 4th St", "Fairfield",
						"IOWA", 52557);
				LibraryMember member4 = new LibraryMember("Tim", "Turner", "124", "1000 N 4th St", "Fairfield", "IOWA",
						52557);
				LibraryMember member5 = new LibraryMember("Alvaro", "Havier", "125", "1000 N 4th St", "Fairfield",
						"IOWA", 52557);
				mc.addMember(member1);
				mc.addMember(member2);
				mc.addMember(member3);
				mc.addMember(member4);
				mc.addMember(member5);
				break;
			case 7:
				mc.deleteMemberByUsId("123");
				break;
			case 8:
				System.out.println(mc.getAllMember());
				break;

			case 9:
				System.out.println(mc.getMemberByUsId("123"));
				break;

			case 10:
				LibraryMember member7 = new LibraryMember("Alvaro", "Havier", "126", "1000 N 4th St", "Fairfield",
						"IOWA", 52557);
				mc.updateMemberUsId("122", member7);
				break;
			case 11:

				String isbn1 = "121";
				String isbn2 = "122";
				String isbn3 = "123";
				String usid1 = "121";
				String usid2 = "122";
				String usid3 = "123";
				bc.getBookByISBN(usid1);
				bc.getBookByISBN(usid2);
				bc.getBookByISBN(usid3);

				CheckOutRecord record1 = new CheckOutRecord(LocalDate.of(2020, 7, 22), bc.getBookByISBN(isbn1),
						mc.getMemberByUsId(usid1));
				CheckOutRecord record2 = new CheckOutRecord(LocalDate.of(2020, 9, 22), bc.getBookByISBN(isbn2),
						mc.getMemberByUsId(usid2));
				CheckOutRecord record3 = new CheckOutRecord(LocalDate.of(2020, 11, 22), bc.getBookByISBN(isbn3),
						mc.getMemberByUsId(usid3));
				rc.addRecord(record1);
				rc.addRecord(record2);
				rc.addRecord(record3);
				break;
			case 12:
				String is = "123";
				rc.deleteRecordByISBN(is);
				break;
			case 13:
				System.out.println(rc.getAllRecord());
				break;

			case 14:
				String isb = "122";
				System.out.println(rc.getRecordByISBN(isb));
				break;
			case 15:
				String usid = "121";
				System.out.println(rc.getRecordByUsId(usid));
				break;
			case 16:
				String isbnUp = "123";
				CheckOutRecord update = rc.getRecordByISBN(isbnUp);
				rc.updateRecordISBN(isbnUp, update);
				break;
			case 17:
				String usid4 = "125";
				CheckOutRecord update2 = rc.getRecordByUsId(usid4);
				rc.updateRecordUsId(usid4, update2);
				break;

			case -1:
				System.exit(0);
				break;
			}
			menu();
			System.out.println("Enter your Choice, please");
			choice = sc.nextInt();

		}

	}

	static void menu() {
		System.out.println("1. Add new Book");
		System.out.println("2. Delete Book By ISBN");
		System.out.println("3. View all Book");
		System.out.println("4. View Book By ISBN");
		System.out.println("5. Update Book By ISBN");
		System.out.println("6. Add new Member");
		System.out.println("7. Delete Member");
		System.out.println("8. View all Member");
		System.out.println("9. View Member By User ID");
		System.out.println("10. Update Member By ID");
		System.out.println("11. Checkout Book");
		System.out.println("12. Checkin Book");
		System.out.println("13. View all Check in Information");
		System.out.println("14. View CheckOut Information By ISBN of a book");
		System.out.println("15. View CheckOut Information By User ID of a Member");
		System.out.println("16. Update CheckOut By ISBN of a book");
		System.out.println("17. Update CheckOut By UserID of a member");
		System.out.println("-1. Exit");
		System.out.println();
	}
}
