# Git Hands-On Lab

## Objectives
- Familiar with Git commands like `git init`, `git status`, `git add`, `git commit`, `git push`, and `git pull`
- Learn how to setup Git configuration
- Integrate Notepad++ as the default Git editor
- Add files to source code repository

## Prerequisites
- Install Git Bash client in your machine

## Notes
- Please follow the below steps for creating a free account in GitHub
- Don't use Cognizant credentials to login to GitHub
- Estimated time to complete this lab: 30 minutes

## Step 1: Setup your machine with Git Configuration

To create a new repository, signup with GitLab and register your credentials. Login to GitLab and create a "GitDemo" project.

### 1. Check Git Client Installation
Open Git bash shell and execute:
```bash
$ git version
```
If output shows Git with its version information, that indicates that Git Client is installed properly.

### 2. Configure User Level Configuration
Execute the following commands to set your user ID and email:
```bash
$ git config --global user.name "username"
$ git config --global user.email "username@cognizant.com"
```

### 3. Verify Configuration
To check if the configuration is properly set, execute:
```bash
$ git config --global --list
```

## Step 2: Integrate Notepad++ to Git and make it a default editor

### 1. Check Notepad++ Execution from Git Bash
Execute:
```bash
$ notepad++
```
If Git bash cannot recognize the notepad++ command, that implies notepad++.exe is not added to the environment path variable.

To add the path of notepad++.exe to environment variable:
- Go to Control Panel → System → Advanced System Settings
- Go to Advanced tab → Environment Variables
- Add path of notepad++.exe to the Path user variable by clicking on "Edit"

### 2. Test Notepad++ Integration
Exit Git bash shell, open bash shell and execute:
```bash
$ notepad++
```
Now, Notepad++ will open from Git bash shell.

### 3. Create Alias Command
To create an alias command for notepad++.exe, execute:
```bash
$ notepad++.exe bash -profile
```
It will open Notepad++ from bash shell and create a user profile by adding the line:
```bash
alias npp='notepad++.exe -multiInst -nosession'
```

### 4. Configure Git Editor
To configure the editor, execute the command:
```bash
$ git config --global core.editor "notepad++.exe -multiInst -nosession"
```

### 5. Verify Default Editor
To verify if Notepad++ is the default editor, execute the command:
```bash
$ git config --global -e
```
Here '-e' option implies editor. It will show the entire global configuration as shown below:
```ini
[user]
    name = username
    email = username@cognizant.com
[core]
    editor = notepad++.exe -multiInst -nosession
```

## Step 3: Add a file to source code repository

### 1. Create New Git Project
Open Git bash shell and create a new project "GitDemo" by executing the command:
```bash
$ git init GitDemo
```

### 2. Verify Repository Initialization
Git bash initializes the "GitDemo" repository. To verify, execute the command:
```bash
$ ls -al
```
It will display all the hidden files in the Git "working directory".

### 3. Create File with Content
To create a file "welcome.txt" and add content to the file, execute the command:
```bash
$ echo "Welcome to the version control" >> welcome.txt
```

### 4. Verify File Creation
To verify if the file "welcome.txt" is created, execute:
```bash
$ ls -al
```

### 5. Verify File Content
To verify the content, execute the command:
```bash
$ cat welcome.txt
```

### 6. Check Git Status
Check the status by executing:
```bash
$ git status
```
Now the file "welcome.txt" is available in Git "working directory".

### 7. Track File in Git Repository
To make the file to be tracked by Git repository, execute the command:
```bash
$ git add welcome.txt
```

### 8. Commit Changes
To add multi-line comments, we are opening default editor to comment. Execute the command:
```bash
$ git commit
```
Notepad++ editor will open to add multi-line comment with default editor.

### 9. Verify Repository Status
To check if local and "Working Directory" Git repository are the same, execute:
```bash
$ git status
```
The welcome.txt file is now added to the local repository.

### 10. Create Remote Repository
Signup with GitLab and create a remote repository "GitDemo".

### 11. Pull Remote Repository
To pull the remote repository, execute:
```bash
$ git pull origin master
```

### 12. Push to Remote Repository
To push the local repository to remote repository, execute:
```bash
$ git push origin master
```

## Summary
This lab covers the fundamental Git operations including:
- Initial setup and configuration
- Editor integration
- Basic repository operations
- Remote repository management

By completing this lab, you will have hands-on experience with essential Git commands and workflows.
