package com.protobuf;

import com.protobuf.generated.AddressBookProtos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewAddPeople {

    public static void main(String[] arg) throws IOException {
        AddressBookProtos.Person.Builder p1 = AddressBookProtos.Person.newBuilder();

        p1.setName("Minh");
        p1.setId(1);
        //Phone
        AddressBookProtos.Person.PhoneNumber.Builder phone = AddressBookProtos.Person.PhoneNumber.newBuilder();
        phone.setNumber("0399988263");
        phone.setType(AddressBookProtos.Person.PhoneType.HOME);
        p1.addPhones(phone);

        FileOutputStream fileOutputStream = new FileOutputStream("person.file");
        p1.build().writeTo(fileOutputStream);
        fileOutputStream.close();

        AddressBookProtos.Person parsedPerson = AddressBookProtos.Person.parseFrom(new FileInputStream("person.file"));
        System.out.println(parsedPerson.toString());


    }
}
