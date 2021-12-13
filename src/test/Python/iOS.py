import self as self
from appium import webdriver
import unittest

desired_caps = dict(
    platformVersion='13.2.2',
    deviceName='iPhone',
    platformName='iOS',
    udid='e3a2211901a618a832d92b5cecec27ca049f0a0d'
)

self.driver = webdriver.Remote('http://20.204.77.152:4444', desired_caps)

print(self.driver.page_source)
self.driver.save_screenshot('iOSPython.png')

self.driver.quit()
