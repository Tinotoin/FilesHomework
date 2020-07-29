package com.codeclan.example.FilesHomework;

import com.codeclan.example.FilesHomework.models.File;
import com.codeclan.example.FilesHomework.models.Folder;
import com.codeclan.example.FilesHomework.models.User;
import com.codeclan.example.FilesHomework.repository.FileRepository;
import com.codeclan.example.FilesHomework.repository.FolderRepository;
import com.codeclan.example.FilesHomework.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesHomeworkApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}
//
//	@Test
//	public void createFileAndFolderThenSave(){
//		Folder errands = new Folder("Errands");
//		folderRepository.save(errands);
//
//		File shoppingList = new File("Shopping List", "docx", 50);
//		fileRepository.save(shoppingList);
//
//	}
//
//	@Test
//	public void createFolderAndUserThenSave(){
//		Folder errands = new Folder("Errands");
//		folderRepository.save(errands);
//
//		User bert = new User("Bert");
//		userRepository.save(bert);
//
//	}

}
