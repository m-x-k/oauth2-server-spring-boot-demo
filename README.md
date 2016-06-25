# Spring boot Frontend UI application example with OAuth2 support

Spring cloud security example using GitHub Api for OAuth2 authentication server support.

## Run

```
gradle clean build bootRun
```

## Manual testing

http://localhost:8080

You should already be logged into GitHub with your own account in the same browser.
The request will be redirected to a sample login screen and prompted to accept the github application
before you can continue.

## Unit Tests
```
gradle clean build test
```

