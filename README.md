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

Jenkins – Day 02 (Master–Agent & Pipeline Concepts)

Date: 25-Jan-2026
Focus: Jenkins Master–Agent, SSH, Pipeline Fundamentals

==================================================

Topics Covered

--------------------------------------------------
Jenkins Master–Agent (Slave) Architecture
--------------------------------------------------
- Jenkins uses a master–agent architecture to distribute workload
- Prevents overloading a single Jenkins master
- Improves performance and scalability
- Jobs are executed on agent machines

--------------------------------------------------
Public Key and Private Key Concept
--------------------------------------------------
- Based on asymmetric encryption (lock and key model)
- Public key encrypts data
- Private key decrypts data
- Only the matching private key can decrypt the data

--------------------------------------------------
SSH Key Generation
--------------------------------------------------
- Windows: PuTTYgen (RSA / DSA)
- Linux:
  ssh-keygen

--------------------------------------------------
SSH Keys in AWS EC2
--------------------------------------------------
- Public key stored in:
  /home/ubuntu/.ssh/authorized_keys
- Private key downloaded during EC2 creation
- Public key can be viewed using:
  cat ~/.ssh/authorized_keys

--------------------------------------------------
Jenkins Master–Agent SSH Communication
--------------------------------------------------
- Master connects to agent using:
  - Agent IP address
  - Username
  - Private key
- Communication is encrypted using SSH
- Master generates key pair
- Public key copied to agent
- Agent sends encrypted data
- Master decrypts data using private key

--------------------------------------------------
Agent (Slave) Machine Setup
--------------------------------------------------
- Installed Java on agent machine
- Created directories for logs
- Stored AWS private key securely
- Changed key permission:
  chmod 400 <key.pem>

--------------------------------------------------
Executors (Interview Question)
--------------------------------------------------
- Executors define how many jobs an agent can run simultaneously
- Depends on:
  - CPU
  - Memory
  - Resource utilization

--------------------------------------------------
Restricting Jobs to Specific Machines
--------------------------------------------------
- Used agent labels
- Jobs can be configured to run only on specific labeled agents

==================================================
Jenkins Pipeline – Introduction
==================================================

--------------------------------------------------
Declarative vs Scripted Pipeline
--------------------------------------------------
- Scripted Pipeline:
  - Groovy-based
  - Coding-heavy
- Declarative Pipeline:
  - Easier to read
  - Structured
  - Built-in error handling
  - Recommended for most use cases

--------------------------------------------------
Pipeline Plugins
--------------------------------------------------
- Installed Pipeline Stage View plugin
- Installed SSH Build Agent plugin

--------------------------------------------------
Pipeline Agent Types (Interview Question)
--------------------------------------------------
- agent any  → run on any available agent
- agent none → no global agent
- agent label → run on specific agent

- When using agent none, agents are defined at stage level
- Referred Jenkins documentation for multi-agent pipelines

--------------------------------------------------
Practice Status
--------------------------------------------------
- Concepts studied and understood
- Hands-on practice planned next

--------------------------------------------------
Key Learnings
--------------------------------------------------
- Jenkins master–agent architecture
- SSH key-based authentication
- Executors and resource planning
- Pipeline fundamentals
- Agent configuration concepts

--------------------------------------------------
Next Steps
--------------------------------------------------
- Configure Jenkins agent via SSH
- Run jobs on agent machine
- Create first declarative pipeline

- Jenkins installed and running successfully
- Able to create and manage jobs
