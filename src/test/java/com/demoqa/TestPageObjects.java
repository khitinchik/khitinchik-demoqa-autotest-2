package com.demoqa;

import org.junit.jupiter.api.Test;

public class TestPageObjects {

    TestDate Date = new TestDate();

    @Test
    void TestDate() {
        Date.openBrowser()
                .firstName("Nastya")
                .lastname("Khit")
                .email("90@gmail.com")
                .genterWrapper("Female")
                .userNumber("9179546849")
                .hobbiesData("Sports")
                .dateOfBirth()
                .monthData("April")
                .yearData("2000")
                .dayOfBirthday("07")
                .subjectData("English")
                .addressData("Lenina")
                .pictureData("1.png")
                .stateData("NCR")
                .cityData("Delhi")
                .submitPage()


                .check("Nastya", "Khit", "90@gmail.com", "Female")
                .check("April", "2000", "07", "English")
                .check("NCR", "Delhi", "Lenina", "1.png")
                .check("9179546849", "Sports", "Sports", "Sports");


    }


}
