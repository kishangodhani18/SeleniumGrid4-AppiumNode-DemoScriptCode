require 'rubygems'
require 'appium_lib'

caps = {}
# caps['name'] = 'Ruby Appium Example'
caps['deviceName'] = '3201cff54d0e661b'
caps['platformName'] = 'Android'
caps['version'] = '9.0'
# caps['app'] = 'https://testingbot.com/appium/sample.apk'
caps['realDevice'] = true

appium_driver = Appium::Driver.new({
    'caps' => caps,
    'appium_lib' => {
        :server_url => "http://20.204.77.152:4444"
    }}, true)
driver = appium_driver.start_driver

wait = Selenium::WebDriver::Wait.new(:timeout => 30)


driver.save_screenshot "Ruby.png"

driver.quit



