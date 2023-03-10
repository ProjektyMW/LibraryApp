package com.example.application.views.list;

import com.vaadin.flow.component.login.LoginI18n;
import org.junit.Test;

import org.junit.Assert;
public class LoginViewTest {

    private LoginI18n login = LoginI18n.createDefault();

    @Test
    public void testLoginView() {

        LoginView loginView =  new LoginView();
        LoginI18n.Form i18 = login.getForm();
        LoginI18n.ErrorMessage i18error = login.getErrorMessage();
        Assert.assertEquals("Username", i18.getUsername());
        Assert.assertEquals("Password", i18.getPassword());
        Assert.assertEquals("Log in", i18.getTitle());
        Assert.assertEquals("Log in", i18.getSubmit());
        Assert.assertEquals("Check that you have entered the correct username and password and try again.",
                i18error.getMessage());
        Assert.assertEquals("Incorrect username or password",
                i18error.getTitle());
    }

}