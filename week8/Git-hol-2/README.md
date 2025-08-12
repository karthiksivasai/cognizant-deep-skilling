# Git Hands-On Lab 2: Understanding .gitignore

## Objectives
- Explain git ignore
- Explain how to ignore unwanted files using git ignore

## Learning Outcomes
In this hands-on lab, you will learn how to:
- Implement git ignore command to ignore unwanted files and folders

## Prerequisites
The following are the pre-requisites to complete this hands-on lab:
- Setting up Git environment
- Integrate Notepad++ as a default editor
- A Git repository in the local system and a remote repository in GitLab

## Notes
- Please follow the below steps for creating a free account in GitHub
- Do not use Cognizant credentials to login to GitHub
- Estimated time to complete this lab: 20 minutes

## Lab Overview
Create a ".log" file and a log folder in the working directory of Git. Update the .gitignore file in such a way that on committing, these files (.log extensions and log folders) are ignored. Verify if the git status reflects the same about working directory, local repository and git repository.

## Step-by-Step Instructions

### Step 1: Navigate to Git Repository
First, navigate to your existing Git repository or create a new one:
```bash
$ cd GitDemo
# or if you need to create a new repository
$ git init GitDemo2
$ cd GitDemo2
```

### Step 2: Create Test Files and Folders
Create a log file and a log folder to demonstrate .gitignore functionality:
```bash
$ echo "This is a log file content" > application.log
$ echo "Another log entry" > debug.log
$ mkdir logs
$ echo "Log file inside folder" > logs/error.log
$ echo "System logs" > logs/system.log
```

### Step 3: Verify Current Status
Check the current git status to see all files:
```bash
$ git status
```
You should see all the .log files and the logs folder as untracked files.

### Step 4: Create .gitignore File
Create a .gitignore file to specify which files and folders should be ignored:
```bash
$ notepad++ .gitignore
```
Or if you prefer command line:
```bash
$ echo "# Ignore all .log files" > .gitignore
$ echo "*.log" >> .gitignore
$ echo "" >> .gitignore
$ echo "# Ignore logs folder and all its contents" >> .gitignore
$ echo "logs/" >> .gitignore
```

### Step 5: Verify .gitignore Content
Check the content of your .gitignore file:
```bash
$ cat .gitignore
```
You should see:
```
# Ignore all .log files
*.log

# Ignore logs folder and all its contents
logs/
```

### Step 6: Check Git Status After .gitignore
Now check the git status to see the effect of .gitignore:
```bash
$ git status
```
You should notice that:
- The .log files are no longer shown as untracked
- The logs folder and its contents are not shown
- Only the .gitignore file itself appears as untracked

### Step 7: Add and Commit .gitignore
Add the .gitignore file to the repository:
```bash
$ git add .gitignore
$ git commit -m "Add .gitignore file to ignore log files and folders"
```

### Step 8: Verify Final Status
Check the final git status:
```bash
$ git status
```
You should see:
- Working directory is clean
- No .log files or logs folder are tracked
- All changes are committed

### Step 9: Test Ignoring Functionality
To verify that .gitignore is working correctly, try to add a log file:
```bash
$ echo "New log entry" > newfile.log
$ git status
```
The newfile.log should not appear in git status, confirming that .gitignore is working.

### Step 10: Remove Test Files (Optional)
Clean up the test files if you want:
```bash
$ rm *.log
$ rm -rf logs/
$ rm newfile.log
```

## Understanding .gitignore Patterns

### Common Patterns
- `*.log` - Ignores all files with .log extension
- `logs/` - Ignores the logs folder and all its contents
- `*.tmp` - Ignores all temporary files
- `build/` - Ignores build directory
- `node_modules/` - Ignores node modules folder
- `*.class` - Ignores Java class files

### Advanced Patterns
- `!important.log` - Don't ignore important.log even if *.log is ignored
- `logs/*.txt` - Ignore only .txt files in logs folder
- `**/logs/` - Ignore logs folders at any level

## Verification Checklist
- [ ] .log files are created in working directory
- [ ] logs folder is created with log files
- [ ] .gitignore file is created with proper patterns
- [ ] git status shows .log files and logs folder as ignored
- [ ] .gitignore file is committed to repository
- [ ] Working directory shows as clean after commit

## Summary
This lab demonstrates how to use .gitignore to:
- Prevent unwanted files from being tracked by Git
- Keep your repository clean and focused on source code
- Handle common file types that shouldn't be version controlled
- Maintain consistent repository structure across team members

By completing this lab, you will understand the importance and implementation of .gitignore in Git repositories.
