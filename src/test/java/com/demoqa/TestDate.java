package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestDate {

    SelenideElement
            fName = $("#firstName"),
            lName = $("#lastName"),
            emailinput = $("#userEmail"),
            genterinput = $("#genterWrapper"),
            numberinput = $("#userNumber"),
            birthdayinput = $("#dateOfBirthInput"),
            monthinput = $(".react-datepicker__month-select"),
            yearinput = $(".react-datepicker__year-select"),
            subjectinput = $("#subjectsInput"),
            hobbiesinput = $("#hobbiesWrapper"),
            addressinput = $("#currentAddress"),
            pictureinput = $("#uploadPicture"),
            stateinput = $("#react-select-3-input"),
            cityinput = $("#react-select-4-input"),
            submit = $("#submit"),
            asserTest = $(".modal-body");

    public TestDate openBrowser() {
        Configuration.browserSize = "1960x1024";
        open("https://demoqa.com/automation-practice-form");
        zoom(0.75);
        return this;
    }

    public TestDate firstName(String name) {
        fName.setValue(name);
        return this;
    }

    public TestDate lastname(String surname) {
        lName.setValue(surname);
        return this;
    }

    public TestDate email(String user) {
        emailinput.setValue(user);
        return this;
    }

    public TestDate genterWrapper(String genter) {
        genterinput.$(byText(genter)).click();
        return this;
    }

    public TestDate userNumber(String number) {
        numberinput.setValue(number);
        return this;
    }

    public TestDate dateOfBirth() {
        birthdayinput.click();
        return this;
    }

    public TestDate monthData(String month) {
        monthinput.selectOption(month);
        return this;
    }


    public TestDate yearData(String year) {
        yearinput.selectOption(year);
        return this;
    }

    public TestDate dayOfBirthday(String birth) {
        $(".react-datepicker__day--0" + birth +
                ":not(.react-datepicker__day--outside-month)").click();
        return this;
    }

    public TestDate subjectData(String subject) {
        subjectinput.setValue(subject).pressEnter();
        return this;

    }

    public TestDate hobbiesData(String hobbies) {
        hobbiesinput.$(byText(hobbies)).click();
        return this;
    }

    public TestDate addressData(String address) {
        addressinput.setValue(address);
        return this;
    }

    public TestDate pictureData(String picture) {
        pictureinput.uploadFile(new File("src/test/resources/" + picture));
        return this;
    }

    public TestDate stateData(String state) {
        stateinput.setValue(state).pressEnter();
        return this;
    }

    public TestDate cityData(String city) {
        cityinput.setValue(city).pressEnter();
        return this;
    }

    public TestDate submitPage() {
        submit.scrollTo().click();
        return this;
    }


    public TestDate check(String a,String b,String c,String d) {
    asserTest.shouldHave(text(a), text(b), text(c), text(d));
        return this;
    }
}



