//package com.elice.project.week6.day5.ex.Q2;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/contacts")
//public class ContactController {
//
//    private final ContactService contactService;
//
//    @Autowired
//    public ContactController(ContactService contactService) {
//        this.contactService = contactService;
//    }
//
//    // 지시사항에 따라 코드를 작성해 보세요.
//    @GetMapping("/{contactId}")
//    public ResponseEntity<Contact> getContact(@PathVariable("contactId") long contactId){
//        Contact contact = contactService.findContact(contactId);
//        if(contact == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(contact,HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Contact>> getContacts(){
//        List<Contact> contacts = contactService.findContacts();
//        if(contacts.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(contacts,HttpStatus.OK);
//    }
//}
