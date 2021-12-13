# SeleniumGrid4-Appium Node with real multiple devices and All Supported Languages SetupDemo

* Basic Selenium Grid-4, Appium with node setup for Android &amp; iOS in Systems
* Multiple Languages supported by Appium Client library for selenium Grid-4.

### Execution on Local systems with Remote device:

* Clone the repo: `$ git clone https://github.com/kgodhani/SeleniumGrid4-with-Appium-Node-setup-Demo.git`

>  ***NOTE***: *Please make sure that you have Android Studio with the latest SDK, adb setup and iOS with XCode, & Appium Desktop GUI app has installed*

## Start Appium Server using Appium desktop GUI App.
### Change Desire capability according to your Configuration. [Appium-capabilities](https://appium.io/docs/en/writing-running-appium/caps/)
```
For Example

//------------------ Android -------------
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "9.0.1");
        capabilities.setCapability("deviceName","devices-name here");
        capabilities.setCapability("platformName","Android");
        // Here passed public ip of selenium-grid HUB.
        driver  = new AndroidDriver<MobileElement>(new URL("http://<public-ip>:4444/"), capabilities);

//---------  iOS -------------
        DesiredCapabilities capabilities1 = new DesiredCapabilities();
        capabilities1.setCapability("platformVersion", "13.2.2");
        capabilities1.setCapability("deviceName","iPhone");
        capabilities1.setCapability("platformName","iOS");
        capabilities1.setCapability("udid","ud-id here");
        capabilities1.setCapability("autoAcceptAlerts","true");
        // Here passed public ip of selenium-grid HUB.
        driver1 = new IOSDriver<MobileElement>(new URL("http://<public-ip>:4444/"), capabilities1);"
```

## For Using Java

Build and run a file direct using RUN button on IDE.

## For Using python

### before you install.

```bash
pip3 install --upgrade pip 

pip install Appium-Python-Client
```

Build and run a file direct using RUN button on IDE.

## For ruby

### before you install.

```bash
gem install appium_lib
```

Build and run a file using below command and to write on Terminal.
```
ruby <filename>.rb
```

## For Javascript

### Appium iOS & Android nodejs

This project will test the simple android application using Appium, and here I am using Node.JS as a programming language.

### Libraries:
1) **mocha:** JavaScript testing framework
2) **chai:** Assertion library for Node.js 
3) **wd:**  Node.js client for WebDriver(Appium) 

All above dependencies are mentioned in **package.json**

## Installation
### Prerequisites:
* Make sure valid Android device is connected properly.

### Execution on Local device:

Open terminal and type following commands:
	*  `$ npm install`
	*  `$ npm test` 

>  ***NOTE***: *Please make sure that mocha has been installed globally, OR you can use the command `$ npm install -g mocha` to install mocha globally.*

# Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[KishanGodhani](https://github.com/kgodhani/SeleniumGrid4-with-Appium-Node-setup-Demo/)
