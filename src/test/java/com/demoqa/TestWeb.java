package com.demoqa;
import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestWeb {
        @BeforeAll
        static void Size() {
            Configuration.browserSize = "1960x1024";
        }
        @Test
        void testWeb() {
            open("https://demoqa.com/automation-practice-form");
            zoom(0.75);
            String name = "Nastya";
            String surname = "Khitina";
            String mail = "nasok97@gmail.com";
            String number = "9179538502";

            $("#firstName").setValue(name);
            $("#lastName").setValue(surname);
            $("#userEmail").setValue(mail);
            $("#genterWrapper").$(byText("Female")).click();
            $("#userNumber").setValue(number);
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption("April");
            $(".react-datepicker__year-select").selectOption(("2022"));
            $(".react-datepicker__day--007").click();
            $("#subjectsInput").setValue("English").pressEnter();
            $("#hobbiesWrapper").$(byText("Sports")).click();
            $("#currentAddress").setValue("address");
            $("#uploadPicture").uploadFile(new File("src/test/resources/1.png"));
            $("#react-select-3-input").setValue("NCR").pressEnter();
            $("#react-select-4-input").setValue("Delhi").pressEnter();
            $("#submit").scrollTo().click();


            //Assert
            $(".modal-body").shouldHave(
                    text(name + " " + surname),
                    text(mail),
                    text("Female"),
                    text(number),
                    text("7 April,2022"),
                    text("English"),
                    text("Sports"),
                    text("address"),
                    text("1.png"),
                    text("NCR Delhi"));


            $("#closeLargeModal").scrollIntoView(true).click();



        }
    }