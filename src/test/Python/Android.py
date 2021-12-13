import self as self
from appium import webdriver
import unittest


desired_caps = dict(
    deviceName = '3201cff54d0e661b',
    platformName = 'Android',
    version = '9'
)


self.driver = webdriver.Remote('http://20.204.77.152:4444', desired_caps)

print(self.driver.page_source)
self.driver.save_screenshot('AndroidPython.png')


self.driver.quit()