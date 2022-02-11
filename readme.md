MD cheat sheet: https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#lists

#Documentation
This service allows to add a rating service to shop systems by providing a gRPC interface that can post and get ratings for a specific product ID or without an ID for the shop itself. 

Ratings are persisted in a postgres database that is connected via JDBC (see further details on the configuration in the setup section).

##Grpc Interface
The developed gRpc Interface offers four endpoints that can be found:
- Post a product rating by submitting the rating and a product ID as defined by the shop
- Get a product rating summary by submitting a product ID
- Get shop ratings
- Post a shop rating by submitting a rating


#Setup

##Database setup
Note: These steps can be skipped if the demo DB is used that is already configured and running in the google cloud.

In oder to save the shop and product ratings in a database a postgres db server is required. The following steps will run you through the required steps to setup an instance and configure the microservice accordingly.
1. We propose to use a postgres db instance in the google cloud, for the setup of the instance please follow the steps in the [documentation](https://cloud.google.com/sql/docs/postgres/create-instance)
2. Please make sure that your IP address and the IP address of the server on which the microserice will run is on the list of allowed networks (see configuration/connection in the instance)
3. To configure the microservice the user name, password that you entered in the set up as well as the IP address of the instance has to be entered into the configuration variabled on top of the PersistanceService class under ...\ratingService\src\main\java\cse\project\persistence
4. To run the DB configuration scripts a local installation of postgres and pfAdmin is required [download](https://www.postgresql.org/download/)	
5. In postgres add a new server and establish a connection to the DB server in the cloud
6. Open and run the DbCreation scrip in postgres, this will create the required tables. The data base is now ready to persist the ratings.
7. If mock up data is required the  MockDbData script can optionally be executed. This script will create shop ratings as well ratings for the candle holder.


##Build and deployment process
The completed project was built as a jar file and can be found in the out\artifacts\ratingService_jar folder. Make sure to rebuild the jar file in case that changes were made to the code (especially for the database configuration).

The included docker file copies the jar file into a JDK8 image and starts the service under port 9090 as soon as deployed. 

In case that the service should be deployed with the google demo [documentation](https://github.com/GoogleCloudPlatform/microservices-demo) the included yaml file can be placed into the following folders to allow a deployment in the Kubernetes cluster:
- scaffold.yaml into the root folder
- microservice.yaml into the release folder