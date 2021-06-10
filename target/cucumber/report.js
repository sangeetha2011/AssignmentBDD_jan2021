$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/BankAndCash.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NewAccount"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should land on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and\"\u003cdescription\u003e\"and\"\u003cinitialBalance\u003e\"and\"\u003caccountNumber\u003e\"and\"\u003ccontactPerson\u003e\"and\"\u003cphone\u003e\"and\"\u003cinternetBankingUrl\u003e\"and clicks submit",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should be able to see validate",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 18,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "",
        "Savings Account",
        "opening New Account",
        "$50,000",
        "172843",
        "john",
        "263848",
        "www.bofa.com"
      ],
      "line": 19,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1990687700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "BankAndCashStepDef.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 1144582400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@NewAccount"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user enter the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should land on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User fill up the form entering \"Savings Account\"and\"opening New Account\"and\"$50,000\"and\"172843\"and\"john\"and\"263848\"and\"www.bofa.com\"and clicks submit",
  "matchedColumns": [
    3,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should be able to see validate",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 16
    },
    {
      "val": "abc123",
      "offset": 40
    }
  ],
  "location": "BankAndCashStepDef.user_enters_the_username_and_password(String,String)"
});
formatter.result({
  "duration": 145715900,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDef.user_click_on_the_signin_button()"
});
formatter.result({
  "duration": 1262998700,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDef.user_should_land_on_the_Dashboard_page()"
});
formatter.result({
  "duration": 7657600,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDef.user_clicks_on_the_bank_and_cash()"
});
formatter.result({
  "duration": 53139400,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDef.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 666034100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Savings Account",
      "offset": 32
    },
    {
      "val": "opening New Account",
      "offset": 52
    },
    {
      "val": "$50,000",
      "offset": 76
    },
    {
      "val": "172843",
      "offset": 88
    },
    {
      "val": "john",
      "offset": 99
    },
    {
      "val": "263848",
      "offset": 108
    },
    {
      "val": "www.bofa.com",
      "offset": 119
    }
  ],
  "location": "BankAndCashStepDef.user_fill_up_the_form_entering_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1308495000,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepDef.user_should_be_able_to_see_validate()"
});
formatter.result({
  "duration": 6823400,
  "status": "passed"
});
});