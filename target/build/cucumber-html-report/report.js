$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/LoginGmail.feature");
formatter.feature({
  "name": "Login to Gmail",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginGmail"
    }
  ]
});
formatter.scenario({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginGmail"
    }
  ]
});
formatter.step({
  "name": "estoy en la pagina de Gmail",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginGmailStepdefs.estoyEnLaPaginaDeGmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso mi email y password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginGmailStepdefs.ingresoMiEmailYPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGmailStepdefs.iClickOnTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in to Gmail",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGmailStepdefs.verifyLoggedIn()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[text()\u003d\u0027Compose\u0027]\"}\n  (Session info: chrome\u003d113.0.5672.127)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027USER\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.127, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: C:\\Users\\Usuario\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:58753}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 13a18ef7641fdcaa6e87bd8eb1a55fd5\n*** Element info: {Using\u003dxpath, value\u003d//div[text()\u003d\u0027Compose\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.bdd.stepdefinitions.LoginGmailStepdefs.verifyLoggedIn(LoginGmailStepdefs.java:57)\r\n\tat ✽.I should be logged in to Gmail(src/test/resources/LoginGmail.feature:10)\r\n",
  "status": "failed"
});
});