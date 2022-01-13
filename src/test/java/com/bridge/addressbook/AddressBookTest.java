package com.bridge.addressbook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {

    @Test
    public void givenTheContactShouldGetAddedToAddressBook() {

        Contacts contact = new Contacts("Ajay", "Nagar", "#30 Abc", " Bangalore", "Karnataka", "Ajay@gmail.com", 936329212, 546784);
        Main main = new Main(contact);
        main.read();
        List<Contacts> list = new ArrayList<>();
        Assert.assertEquals(list.);
    }
}
