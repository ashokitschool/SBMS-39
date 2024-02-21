package in.ashokit.service;

import in.ashokit.dao.BookDao;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void saveBook() {
		boolean status = bookDao.save();
		if (status) {
			System.out.println("Record Inserted...");
		} else {
			System.out.println("Insertion Failed...");
		}
	}

}
