export default {

    oidc:{
        clientId: '0oafh0w64tdM0EJ2o5d7', // public identifier
        issuer: 'https://dev-72077753.okta.com/oauth2/default', //issuer of tokens, URL when authorizing with okta authorization server
        redirectUri: 'http://localhost:4200/login/callback', // Once user logs in send them here
        scopes: ['openid', 'profile', 'email'] // Scropes provide access to infomation about a user 
        /*
        openid: required for authentication requests
        profile: user's first name, last name, phone etc
        email: user's email address
         */
    }

}
