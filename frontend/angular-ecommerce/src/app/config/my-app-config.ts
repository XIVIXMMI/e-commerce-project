export default {

    oidc:{
        clientId: '0oafhroginNOCoEdZ5d7', // public identifier
        issuer: 'https://dev-60254125.okta.com/oauth2/default', //issuer of tokens, URL when authorizing with okta authorization server
        redirectUri: 'https://localhost:4200/login/callback', // Once user logs in send them here
        scopes: ['openid', 'profile', 'email'] // Scropes provide access to infomation about a user 
        /*
        openid: required for authentication requests
        profile: user's first name, last name, phone etc
        email: user's email address
         */
    }

}
