# Jenkins Hands-on Practice – Detailed Daily Log

## Date
27–28 Jan 2026

---

## Overview
This document captures my **hands-on Jenkins practice**, focused on understanding Jenkins fundamentals through **real execution**, **basic pipelines**, and **troubleshooting common issues**.  
The tasks performed were intentionally simple to build a strong foundation.

---

## Study Time Breakdown
- Morning session: Jenkins job execution and triggers
- Afternoon session: Agent setup and troubleshooting
- Evening session: Pipelines, shared libraries, and notifications

Total practice time: ~7 hours (hands-on + troubleshooting)

---

## Infrastructure Setup
- Provisioned two AWS EC2 instances:
  - Jenkins Master
  - Jenkins Agent
- Installed Java on both systems
- Installed Jenkins on the master node
- Installed required and suggested Jenkins plugins
- Configured system timezone to Asia/Kolkata at:
  - OS level
  - Jenkins level

---

## Jenkins Jobs Practice
- Created freestyle Jenkins jobs
- Executed basic shell commands:
  - date
  - echo
- Observed Jenkins build weather indicators:
  - Sunny
  - Cloudy
  - Rainy
  - Thunderstorm

---

## Jenkins Triggers

### Periodic Trigger
- Configured cron-based execution
- Cron expression used:
  */2 * * * *
- Verified job execution at scheduled intervals

### Remote Trigger
- Configured authentication token
- Triggered Jenkins job via remote URL
- Verified execution through console output

---

## Jenkins Master–Agent Configuration
- Installed Java on agent node
- Created agent working directory
- Configured SSH-based connection from Jenkins master
- Added agent credentials in Jenkins
- Assigned agent label
- Restricted jobs to run on the configured agent

---

## Disk Space Issue (/tmp)
- Encountered Jenkins node offline issue due to low /tmp disk space
- Identified default /tmp size limitation (~500MB)
- Temporarily resolved by remounting /tmp with increased size
- Node reconnected successfully
- Permanent solution identified as future improvement

---

## Jenkins Pipelines

### Scripted Pipeline (Basic)
```groovy
node {
    stage('Build') {
        echo "Hello world"
    }
}
```

### Declarative Pipeline (Basic)
```groovy
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo "Hello world"
            }
        }
    }
}
```

---

## Error Handling
- Practiced `post` conditions:
  - always
  - success
  - failure
- Observed Jenkins default behavior:
  - Pipeline stops after stage failure
- Used `catchError` to allow pipeline continuation

---

## Environment Variables
- Used Jenkins built-in variables:
  - env.JOB_NAME
  - env.BUILD_NUMBER
- Printed variables in console output
- Used variables in email notifications

---

## Jenkins Shared Library
- Created a shared library repository
- Implemented reusable function using `def call()`
- Invoked shared library function from Jenkinsfile using:
  ```groovy
  @Library('Jenkins')_
  ```

---

## Email Notifications
- Installed Email Extension Plugin
- Configured SMTP and app password
- Sent email notifications on:
  - Build failure
  - Build success

---

## Backup
- Configured Jenkins backup using ThinBackup plugin
- Performed manual backup
- Understood Jenkins home directory structure

---

## Key Learnings
- Jenkins runs jobs as the `jenkins` user
- Permissions and disk space issues are common in real setups
- Pipelines fail fast by default
- Shared libraries improve reusability
- Simple jobs are essential for mastering fundamentals

---

## Areas to Improve
- Executor configuration and optimization
- Permanent /tmp disk configuration
- More realistic deployment pipelines

---


