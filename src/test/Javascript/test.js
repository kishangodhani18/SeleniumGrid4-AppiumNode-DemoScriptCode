
const wd = require("wd");
let driver =  wd.promiseChainRemote({
  host: 'http://20.204.77.152',
  port: 4444
});
let desiredCaps = {
  platformName: 'Android',
  platformVersion: '9.0',
  deviceName: '3201cff54d0e661b',

};
 driver.init(desiredCaps);
 let screenshot = await driver.takeScreenshot();

 let pageSource =  driver.source();
 console.log(pageSource);

 driver.quit();

