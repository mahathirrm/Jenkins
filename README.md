# Jenkins – Day 1

Date: 24-Jan-2026
Learning Source: YouTube – Learn with Mithran
Platform: Ubuntu EC2 (2 vCPU, 8 GB RAM)

## What is Jenkins
- Jenkins is an automation server used for CI/CD
- Open-source and enterprise editions available
- Integrates with Git, Docker, Kubernetes, and cloud tools
- UI-based tool running on port 8080
- Requires Java

## Installation
- Installed OpenJDK 21
- Installed Jenkins using official documentation
- Allowed port 8080 in EC2 security group
- Accessed Jenkins via browser
- Installed suggested plugins
- Created first admin user

## Jobs and Triggers
- Created freestyle jobs
- Executed shell commands: date, uptime, pwd, echo
- Manual trigger tested
- Periodic (cron-based) trigger learned
- Configured upstream and downstream jobs

## Key Learnings
- Jenkins weather report
- Post-build actions
- User management and role-based authorization

## Outcome
- Jenkins installed and running successfully
- Able to create and manage jobs
