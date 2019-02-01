echo %PATH%

echo %JAVA_HOME%

set projectLocation=C:\Test_Automation\Working_Dir\Coopers_Selenium_Dir\CooperProject2019
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Cooper_testng.xml