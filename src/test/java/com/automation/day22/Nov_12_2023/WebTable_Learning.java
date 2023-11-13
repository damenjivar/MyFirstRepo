package com.automation.day22.Nov_12_2023;

public class WebTable_Learning {

	//How to identify a WebTable in DOM
	//WebTables are dynamic in nature
	
	//WebTable will have a specific id or class
	//thead
	//tbody
	
	//Having good XPath knowledge is very important for WebTables
	
	//table[@class = 'dataTable'] - this represents the whole WebTable
	//table[@class = 'dataTable']/thead - this represents the head of the WebTable
	//table[@class = 'dataTable']/thead/tr - this represents the header row of the WebTable
	//table[@class = 'dataTable']/thead/tr/th - this represents all the columns of the header row
	//table[@class = 'dataTable'] /thead/tr/th[1] - this represents the 1st column of the header row
	//table[@class = 'dataTable']/thread/tr/th[5] - this represents the 5th column of the header row
	
	//table[@class = 'dataTable']/tbody - this represents the body of the WebTable without the header row
	//table[@class = 'dataTable']/tbody/tr - this represents all the rows of the body of the WebTable
	//table[@class = 'dataTable']/tbody/tr[1] - this represents the first row of the body of the WebTable
	//table[@class = 'dataTable']tbody/tr/td - this represents all the columns of all the rows of the body of the WebTable
	//table[@class = 'dataTable']/tbody/tr[1]/td - this represents all the columns of the first row of the WebTable
	//table[@class = 'dataTable']/tbody/tr[1]/td[1] - this represents the first column of the first row of the WebTable
	//table[@class = 'dataTable']/tbody/tr/td[1] - this represents all the values of the first column of the WebTable
	//table[@class = 'dataTable']/tbody/tr/td[4] - this represents all the values of the 4th column of the WebTable
}
