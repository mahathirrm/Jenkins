#!/bin/bash
########################################################
#Author:Mahathir Mohamed
#Script Name: AWS Resource Tracker
#Date:10-01-26
#Version: V1
########################################################
#
#This script is to Track the AWS resources of
# 1.S3 Bucket
# 2.EC2 Instance
# 3.IAM Users
#set -x
#Debug mode of Each Commend when Executes

echo "********************************************************************************"
echo " Listing S3 Buckets"
aws s3api list-buckets --query 'Buckets[*].Name' --output table

echo "*********************************************************************************"
echo " Listing EC2 Instances"
##aws ec2 describe-instances --output table
aws ec2 describe-instances --query 'Reservations[*].Instances[*].[InstanceId]' --output table 
##aws ec2 describe-instances >> output.txt

echo "**********************************************************************************"
echo " Listing IAM Users"
aws iam list-users --query 'Users[*].UserName' --output table
echo "**********************************************************************************"
