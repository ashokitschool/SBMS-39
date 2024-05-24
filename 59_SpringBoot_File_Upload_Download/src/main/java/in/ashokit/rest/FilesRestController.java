package in.ashokit.rest;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FilesRestController {

	private final Path root = Paths.get("uploads");

	@PostMapping(
			value="/upload",
			consumes = {
					MediaType.APPLICATION_JSON_VALUE,
					MediaType.MULTIPART_FORM_DATA_VALUE
			}
	)
	public ResponseEntity<String> uploadFile(@RequestParam("user") String user, 
			@RequestParam("file") MultipartFile file) {
		System.out.println(user);
		try {
			Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
		} catch (Exception e) {
			if (e instanceof FileAlreadyExistsException) {
				throw new RuntimeException("A file of that name already exists.");
			}
			throw new RuntimeException(e.getMessage());
		}
		return new ResponseEntity<>("File Uploaded", HttpStatus.CREATED);
	}
	
	@GetMapping("/files/{filename}")
	public ResponseEntity<Resource> getFile(@PathVariable String filename) throws Exception{
		Path filePath = root.resolve(filename);
		Resource file = new UrlResource(filePath.toUri());

		if (file.exists() || file.isReadable()) {
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
					.body(file);
		} else {
			throw new RuntimeException("Could not read the file!");
		}
	}
}
