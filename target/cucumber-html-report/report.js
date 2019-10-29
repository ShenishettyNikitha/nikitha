$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Training_h2a.06.17/Documents/Selenium/Casestudys/Features/DemoWebShopcs.feature");
formatter.feature({
  "name": "Demo Web Shop Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successfull registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on DemoWebShop home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User chooses register on the home page",
  "keyword": "And "
});
formatter.step({
  "name": "User chooses the \"\u003cgender\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters \"\u003cfirstname\"\u003e , \"\u003clastname\u003e\" and \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cpassword\u003e\" and \"\u003cconfirmPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on register",
  "keyword": "Then "
});
formatter.step({
  "name": "User is successfully registeres",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "gender",
        "firstname",
        "lastname",
        "email",
        "password",
        "confirmPassword"
      ]
    },
    {
      "cells": [
        "female",
        "tori",
        "anderson",
        "tori.anderson@gmail.com",
        "torianderson",
        "torianderson"
      ]
    },
    {
      "cells": [
        "male",
        "kura",
        "adi",
        "kura.adi@gmail.com",
        "kuraadi",
        "kuraadi"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successfull registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on DemoWebShop home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoWebShopcs.user_is_on_DemoWebShop_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses register on the home page",
  "keyword": "And "
});
formatter.match({
  "location": "DemoWebShopcs.user_chooses_register_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses the \"female\"",
  "keyword": "When "
});
formatter.match({
  "location": "DemoWebShopcs.user_chooses_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"\u003cfirstname\"\u003e , \"anderson\" and \"tori.anderson@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "DemoWebShopcs.user_enters_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"torianderson\" and \"torianderson\"",
  "keyword": "And "
});
formatter.match({
  "location": "DemoWebShopcs.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on register",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoWebShopcs.user_clicks_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is successfully registeres",
  "keyword": "And "
});
formatter.match({
  "location": "DemoWebShopcs.user_is_successfully_registeres()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successfull registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on DemoWebShop home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoWebShopcs.user_is_on_DemoWebShop_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses register on the home page",
  "keyword": "And "
});
formatter.match({
  "location": "DemoWebShopcs.user_chooses_register_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses the \"male\"",
  "keyword": "When "
});
formatter.match({
  "location": "DemoWebShopcs.user_chooses_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"\u003cfirstname\"\u003e , \"adi\" and \"kura.adi@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "DemoWebShopcs.user_enters_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"kuraadi\" and \"kuraadi\"",
  "keyword": "And "
});
formatter.match({
  "location": "DemoWebShopcs.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on register",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoWebShopcs.user_clicks_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is successfully registeres",
  "keyword": "And "
});
formatter.match({
  "location": "DemoWebShopcs.user_is_successfully_registeres()"
});
formatter.result({
  "status": "passed"
});
});