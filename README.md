# HackerNews-Article-API-Web-Viewer-Back-End
Fundamental function: A full stack application that makes an API call to Hacker News, collects JSON data, parses the data and sends it to the front end client to do be formatted and displayed on a webpage in a readable format.

This API design displays the data of a news article that was retrieved from the Hacker News API currently using a localhost port. The technologies useed are Java, Springboot in Spring MVC Structure, Javascript, React.js, Atom, MaterialUI, and Node.js.

[![](https://img.shields.io/badge/license-Spring-darkgreen.svg?)](https://www.apache.org/licenses/LICENSE-2.0)

*Questions?  Comments?  Feedback? Email me at emeka.enshinyan@gmail.com 

-----



# Documentation
1. [Requirements](#Requirements)
2. [Setup](#Setup)
3. [Running-The-Application](#Running-The-Application)
4. [Plans-&-Improvements](#Plans-&-Improvements)

## Requirements
**NOTE** This has not been tested on a Mac or Linux OS.

###### The following tools are required to to have the application run:
- Java 15 (can also be run on Java 8)
- Apache-Maven version 15
- Internet connection for the API calls
- The editors I used were IntelliJ and VSCode
- Node.JS
- Bootstrap
- 

## Setup
### Back End
1. Download the HackerNews-API-Design-Back-End repository
2.  Make sure the server is listening in on the right port (default 8080)
### Front End
1. Download the HackerNews-API-Design-Front-End repository and open it in VSCode
2. make sure it is listening on a different port (default is 3000)

## Running-The-Application
3.  Run the server (you can test via Postman or type in "localhost:8080/hn/articles" in a browser)


3. type the following in the terminal:

```
cd [directory of HackerNews-API-Design-Front-End repostory]
C:\Users\user\HackerNews-API-Design-Front-End> npm start
```
A new browser tab should open up showing a list of the Article Data categories predefined by Hacker News

## Plans-&-Improvements

display the top 500 trending articles
integrate DB
