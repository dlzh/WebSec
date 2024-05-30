﻿This project is used to test and verify 
 - AWS CodeBuild, 
 - Amazon Elastic Container Registry (ECR) is a fully managed Docker container registry that makes it easy to store, share, and deploy container images.
 - An Amazon ECS cluster is a logical grouping of tasks or services (Elastic Cluster Service)
   Github repository is provided to CodeBuild service where the code will be compiled and packed. Then the image will be stored in ECR, and if the ECS cluster service is configured, a service based on this image will be created to provide service in the cluster.

   
