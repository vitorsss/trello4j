## Introduction
**trello4j** is a java wrapper around [Trello API](https://developers.trello.com/v1.0/reference).

You need to get a API key and optionally generate a token [here](https://trello.com/1/appKey/generate) to be able to use Trello's API.

## Getting started

### Get source and build it

    git clone git@github.com:joelso/trello4j.git
	cd trello4j
	mvn install

Now you got two options:

1. Use trello4j from your local maven repo, add dependency groupId: org.trello4j / artifactId: trello4j
2. Use jar that was built in directory **target/**

## Usage
	
	// myToken is optional, set to null if you are accessing public data
    Trello trello = new TrelloImpl("myApiKey", "myToken");  
	
	// example: get organization by its name
    Organization org = trello.getOrganization("fogcreek");