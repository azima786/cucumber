$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_login.feature");
formatter.feature({
  "line": 2,
  "name": "validate techfios login functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    },
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 7346170200,
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
  "comments": [
    {
      "line": 5,
      "value": "#\tGiven User is on Techfios Login Page"
    },
    {
      "line": 6,
      "value": "#\tGiven User is on \"Techfios\" Login Page"
    }
  ],
  "line": 7,
  "name": "User is on \"Techfios\" Login Page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Techfios",
      "offset": 12
    }
  ],
  "location": "LoginStepDefination.user_is_on_Login_Page(String)"
});
formatter.result({
  "duration": 5768230100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "1 User should be able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@scenario1"
    },
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user click on signon button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user should land on Dashboard Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefination.user_enters_password_as(String)"
});
formatter.result({
  "duration": 2172829900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefination.user_enters_username_as(String)"
});
formatter.result({
  "duration": 131680800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_signon_button()"
});
formatter.result({
  "duration": 1982514900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_should_land_on_Dashboard_Page()"
});
formatter.result({
  "duration": 1246121900,
  "status": "passed"
});
formatter.after({
  "duration": 4812484400,
  "status": "passed"
});
});