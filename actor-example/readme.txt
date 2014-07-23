1. Overview
This application connects to Twitter streaming API using Twitter4J client. 
In order to connect to the Twitter streaming API, we must first generate a set of OAuth tokens that will enable our application 
to authenticate with Twitter.

By default, Twitter4J will search the classpath for a twitter4j.properties file and load OAuth tokens from that file.
Here we put it in "src/main/resources" directory.

To create consumer key/secret and access token pairs, you need a twitter account. And once you login, please follow the steps below:
1. Go to https://dev.twitter.com/apps/new and log in if necessary.
2. Enter a name and description for your application.
3. Enter a URL for your application. In our case, the URL is unimportant, a placeholder URL here is fine.
4. Submit the form. The next page will display the details of the OAuth settings for your application. 
"API key" and "API secret" are the "consumer key/secret" pair we need.
5. At the bottom of the page, click on the Create my access token button. 
This will generate an OAuth Access token and a secret key that will allow an application to access your account on your behalf.
"Access token" and "Access token secret" are the "access token & Access token secret" pair we need.
6. Fill "consumer key/secret" and "access token/access token secret" pairs in the corresponding fields in "twitter4j.properties".

2. Deploying actors on remote machines will implemented soon, stay tuned.
