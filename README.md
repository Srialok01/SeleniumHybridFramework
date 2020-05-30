This is Selenium hybrid framework(TestNG + Data Driven) things that is covered as part of this framework consists of five different Modules :

1--DataProvider--As the name suggests it provides data needed for testcase execution it has two class files namely.

(a)ConfigDataProvider: It is used to retrieve configuration related data namely -url,ChromePath and MozillaPath that is stored in config files in Configuration Folder

(b)ExcelDataProvider: It is used to retrieve data(Username and Password) from Excel sheet located in Application Testdata folder

2--Factory -- It consists of two class files one

(a)BrowserFactory: This is used to launch and teardown the browser(based on Input provided)along with maximizing the screen.

(b)DataProviderFactory: This basically creates the objects of Data Provider files(DataProviderFactory&ExcelDataProvider) so it can used dynamically

3--Pages-- This module will consists of the page on which we will be working, here basically we find web elements and input values in that

4--Testcases-- This consists of actual testcases that we will be executing , actual execution starts from here .

Here we launch the browser and navigate to url ( @BeforeMethod )

Post that Script is executed accordingly (@Test)

Finally browser is closed (@AfterMethod)
5--Utility -- This contains the code for capturing screenshot and attaching it to the report.
