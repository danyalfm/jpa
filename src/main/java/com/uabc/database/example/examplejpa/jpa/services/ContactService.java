package com.uabc.database.example.examplejpa.jpa.services;



import com.uabc.database.example.examplejpa.jpa.entity.Contact;
import com.uabc.database.example.examplejpa.jpa.model.ContactModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("contactService")
public interface ContactService {
    public abstract ContactModel addContact(ContactModel contactModel);

    public abstract List<ContactModel> listAllContacts();

    public abstract Contact findContactById(int id);

    public abstract void removeContact(int id);

    public abstract ContactModel findContactByIdModel(int id);

}
