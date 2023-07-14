# Playground Credit Union

## Description
This project is a playground for new concepts and POCS. It features the following technologies:

 - OAUTH2 with JWT

## Table of Contents

- [Requirements](#requirements)
- [Usage](#usage)
- [Authentication](#authentication)
  - [Generating a PEM keypair](#generating-a-pem-keypair)

## Requirements
This project requires the following:
 - Java 17
 - Maven 3.8.5 or later

## Usage
Run the following command from the terminal:
```shell
mvn package 
```

## Authentication
The authentication process relies on JWT Authentication. It requires that the application.yml file contains the 
path to both the private and public rsa keys in the pem format.

### Generating a PEM keypair
Generate a keypair using the following command:
```shell
ssh-keygen
```
Select the location and the name for the keypair.

Now issue the following commands to convert the key and the key_pub generated:
```shell
## Convert the private key
openssl rsa -in /path/to/private_key -outform pem -out private_key.pem
## Convert the public key
ssh-keygen -f /path/to/public_key.pub -e -m pem > public_key.pem
```

Store it in a safe location on the server and make sure the user running the program has the privileges to access them.
