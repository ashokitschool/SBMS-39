package in.ashokit.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<ExInfo> handlePNFE(ProductNotFoundException pe) {
		
		ExInfo info = new ExInfo();
		info.setExCode("SBI0002");
		info.setExMsg(pe.getMessage());
		info.setExDate(LocalDate.now());
		
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExInfo> handleException(Exception e) {

		ExInfo info = new ExInfo();
		info.setExCode("SBI0001");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDate.now());

		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
