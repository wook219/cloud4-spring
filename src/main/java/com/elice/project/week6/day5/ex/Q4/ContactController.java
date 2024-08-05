//package com.elice.project.week6.day5.ex.Q4;
//
//import com.elice.entity.Contact;
//import com.elice.service.ContactService;
//import jakarta.validation.constraints.Positive;
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
//    @PutMapping("/{contact_id}")
//    public ResponseEntity<Contact> updatePhoneNumber(@PathVariable Long contact_id, @RequestBody Contact contact){
//        Contact updateContact = contactService.updateContact(contact);
//        contact.setContactId(contact_id);
//        return new ResponseEntity<>(updateContact, HttpStatus.OK);
//    }
//}
