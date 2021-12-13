require 'rubygems'
require 'appium_lib'



desired_caps = {

    'deviceName': 'iPhone',
    'platformVersion': '13.2.2',
    'udid': 'e3a2211901a618a832d92b5cecec27ca049f0a0d',
    'platformName': 'iOS'

}
appium_driver = Appium::Driver.new({
    'caps' => desired_caps,
    'appium_lib' => {
        :server_url => "http://20.204.77.152:4444"
    }}, true)
driver = appium_driver.start_driver
wait = Selenium::WebDriver::Wait.new(:timeout => 30)

driver.save_screenshot "iOSRuby.png"


driver.quit